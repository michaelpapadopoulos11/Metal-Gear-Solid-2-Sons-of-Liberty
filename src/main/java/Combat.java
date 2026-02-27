import java.util.Random;

public class Combat {
    private static Player player;
    private static Enemy enemy;
    private static int combatTurn = 1;

    // boss battle flags
    private static boolean bossBattle = false;
    private static boolean chaffUsed = false;
    private static boolean bossStunned = false;
    
    // light mechanics (after codec hint)
    private static boolean lightsOut = false;           // once shot, Olga accuracy drops
    private static boolean canShootLights = false;      // becomes available after olgaFightOne

    // getters for header
    public static int getCombatTurn() {
        return combatTurn;
    }

    public static String getEnemyType() {
        return enemy != null ? enemy.getEnemyType() : "";
    }

    public static boolean isBossBattle() {
        return bossBattle;
    }

    public static void startCombat(Player p, Enemy e) {
        player = p;
        enemy = e;
        combatTurn = 1;
        bossBattle = e.getEnemyType().toLowerCase().contains("olga");
        chaffUsed = false;
        bossStunned = false;
        lightsOut = false;
        canShootLights = false;

        // asciiArt.combatIntroAnimation();
        // gameSystems.pauseText(800);
        combatTurn();
    }

    // Main combat loop logic
    private static void combatTurn() {
        gameSystems.clearConsole();
        if (bossBattle) {
            // unique boss header
            Cutscene.combatHeaderOlga();
        } else {
            System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
            String titleLine = "[COMBAT VIEWER] | TURN " + combatTurn + "                                 SNAKE VS " + enemy.getEnemyType();
            System.out.println("\033[1;36m" + titleLine + "\033[0m");
            System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        }

        System.out.print("\n  \033[0;37mSnake's Health - \033[0m");
        player.checkSnakeHealthBar();

        System.out.println();
        System.out.print("  "); enemy.displayHealthBar();

        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[0;37m   [1] Shoot with M9 Tranquilizer\033[0m");
        System.out.println("\033[0;37m   [2] CQC Attack\033[0m");
        System.out.println("\033[0;37m   [3] \033[0;32mUSE RATION - Recover 30% HP\033[0m\n");
        if (bossBattle && !chaffUsed) {
            System.out.println("\033[0;37m   [4] Throw a CHAFF Grenade - stuns Olga for one turn\033[0m\n");
        } else {
            System.out.println("\033[0;37m   [4] Attempt to Flee\033[0m\n");
        }
        if (canShootLights && !lightsOut) {
        System.out.println("\033[0;33m   [5] Shoot out the overhead lights - reduces Olga accuracy\033[0m\n");        }
        System.out.println("\033[0;37m   [C] Call CODEC\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        int maxChoice = 4;
        if (canShootLights && !lightsOut) {
            maxChoice = 5;
        }
        System.out.print("\033[0;90m  Choose your action [1 - " + maxChoice + "]: \033[0m");

        try {
            String input = gameSystems.readInput().trim().toUpperCase();

            // codec call takes priority
            if (input.equals("C")) {
                playerCallCodec();
                // free action
                combatTurn();
                return;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("\033[1;31mInvalid choice. Try again.\033[0m");
                gameSystems.pauseText(800);
                combatTurn();
                return;
            }

            switch (choice) {
                case 1:
                    playerShootAction();
                    break;
                case 2:
                    playerCQCAction();
                    break;
                case 3:
                    playerUseRation();
                    break;
                case 4:
                    if (bossBattle && !chaffUsed) {
                        playerUseChaff();
                    } else {
                        playerFlee();
                        return; // Stop the combat loop if fleeing
                    }
                    break;
                case 5:
                    if (canShootLights && !lightsOut) {
                        playerShootLights();
                        break;
                    }
                    // fall through to invalid
                default:
                    System.out.println("\033[1;31mInvalid choice. Try again.\033[0m");
                    gameSystems.pauseText(800);
                    combatTurn();
                    return;
            }

            // Check if enemy is defeated
            if (!enemy.isAlive()) {
                playerVictory();
                return;
            }

            gameSystems.pauseText(1500);
            if (bossStunned) {
                gameSystems.clearConsole();
                Cutscene.combatHeaderOlga();
                    gameSystems.printWithDelay("\n\033[0;90m  [Olga is blinded by the chaff and cannot move this turn!]\033[0m\n", 20);                
                    gameSystems.pauseText(500);
                Cutscene.bottomHeader();
                bossStunned = false;
            } else {
                enemyTurn();
            }

            // Check if player is defeated
            if (player.getHealth() <= 0) {
                playerDefeat();
                return;
            }

            // Next turn
            combatTurn++;
            gameSystems.pauseText(1500);
            combatTurn();

        } catch (NumberFormatException e) {
            System.out.println("\033[1;31m  Invalid input. Please enter a number between 1 - 4.\033[0m");
            gameSystems.pauseText(800);
            combatTurn();
        }
    }

    public static void playerCallCodec() {
        gameSystems.clearConsole();
        Random rand = new Random();
        int choice = rand.nextInt(3); // 0,1 or 2
        switch (choice) {
            case 0:
                CODEC.olgaFightOne();
                break;
            case 1:
                CODEC.olgaFightTwo();
                break;
            case 2:
                CODEC.olgaFightThree();
                break;
        }
        // the codec routines handle their own input at the end,
        // avoid an extra read that forces a second ENTER press.
    }

    private static void playerShootAction() {
        gameSystems.clearConsole();

        if (bossBattle) Cutscene.combatHeaderOlga(); else Cutscene.combatTopHeader();
        gameSystems.printWithDelay("  Snake's Health - ", 0);        
        player.checkSnakeHealthBar();
        gameSystems.printWithDelay("\033[0;90m================================================================================\033[0m\n", 0);
        
        gameSystems.pauseText(350);
        System.out.print("\n                               ");
        gameSystems.printWithDelay("\033[0;90m>>> SNAKE'S TURN <<<\033[0m\n", 20);
        gameSystems.pauseText(350);
        
        gameSystems.printWithDelay("\n\033[0;37m  [Snake carefully aims the M9 and fires...]\033[0m\n\n", 20);
        gameSystems.pauseText(1000);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 20) {
            int damage = 25 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);

            System.out.println("\033[0;32m  [HIT!]\033[0m\n");
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;32m  The dart strikes the guard, dealing " + damage + " damage!\033[0m\n", 10);
            // asciiArt.playShootAnimation();
            gameSystems.pauseText(700);
        } else {
            gameSystems.printWithDelay("\033[1;31m  [MISS!]\033[0m\n\n", 0);
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;33m  The tranquilizer dart goes wide!\033[0m\n", 10);
            gameSystems.pauseText(700);
        }
        Cutscene.bottomHeader(); // has a delay when pressing enter here not sure why ??
    }

    private static void playerCQCAction() {
        gameSystems.clearConsole();

        if (bossBattle) Cutscene.combatHeaderOlga(); else Cutscene.combatTopHeader();
        gameSystems.printWithDelay("  Snake's Health - ", 0);        
        player.checkSnakeHealthBar();
        gameSystems.printWithDelay("\033[0;90m================================================================================\033[0m\n", 0);

        gameSystems.pauseText(350);
        System.out.print("\n                               ");
        gameSystems.printWithDelay("\033[0;90m>>> SNAKE'S TURN <<<\033[0m\n", 20);
        gameSystems.pauseText(350);

        gameSystems.printWithDelay("\n\033[0;37m  [Snake closes in on the guard and engages a CQC attack!]\033[0m\n", 10);
        gameSystems.pauseText(1000);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 30) {
            int damage = 15 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);
            System.out.println("\n\033[0;32m  [HIT!]\033[0m\n");
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;32m  A swift CQC attack deals " + damage + " damage!\033[0m\n", 10);
            gameSystems.pauseText(700);
        } else {
            gameSystems.printWithDelay("\n\033[1;31m  [MISS!]\033[0m\n\n", 0);
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;33m  [The guard avoids the attack!]\033[0m\n", 10);
            gameSystems.pauseText(700);
        }
        Cutscene.bottomHeader();
    }

    private static void playerUseRation() {
        gameSystems.clearConsole();
        if (bossBattle) Cutscene.combatHeaderOlga(); 
        else Cutscene.combatTopHeader();

        gameSystems.printWithDelay("  Snake's Health - ", 0);        
        player.checkSnakeHealthBar();
        gameSystems.printWithDelay("\033[0;90m================================================================================\033[0m\n", 0);

        gameSystems.pauseText(350);
        System.out.print("\n                              ");
        gameSystems.printWithDelay("\033[0;90m>>> UTILITY USED <<<\033[0m\n", 20);
        gameSystems.pauseText(350);

        gameSystems.printWithDelay("\n\033[0;37m  [Snake takes a moment to eat a ration...]\033[0m\n\n\n", 10);
            gameSystems.pauseText(800);
            System.out.println("                              ( >_<) ");
            gameSystems.pauseText(1000); 
            System.out.print("\033[1A\r"); //overwrites last line
            System.out.print("                              ( ^_^) ");
            gameSystems.pauseText(800);
            gameSystems.printWithDelay("*burp*\n\n", 70);  
            gameSystems.pauseText(00);

        
        int oldHealth = player.getHealth();
        player.healDamage(30); // heal increased
        int healAmount = player.getHealth() - oldHealth;
        gameSystems.printWithDelay("\033[0;37m  Snake has recovered " + "\033[0;32m[" + healAmount +  "]\033[0m" + " health!\033[0m\n", 10);
        gameSystems.pauseText(500);
        Cutscene.bottomHeader();
    }

    private static void playerUseChaff() {
        gameSystems.clearConsole();
        if (bossBattle) Cutscene.combatHeaderOlga(); else Cutscene.combatTopHeader();

        gameSystems.pauseText(350);
        System.out.print("\n                              ");
        gameSystems.printWithDelay("\033[0;90m>>> UTILITY USED <<<\033[0m\n", 20);
        gameSystems.pauseText(350);

        gameSystems.printWithDelay("\n\033[0;37m  [Snake tosses a CHAFF grenade at Olga...]\033[0m\n", 20);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("\n\033[0;37m  Olga is temporarily blinded by swarming chaff!\033[0m\n", 20);
        gameSystems.pauseText(800);
        bossStunned = true;
        chaffUsed = true;
        Cutscene.bottomHeader();
    }

    // light shooting utility, unlocked by codec hint
    public static void enableLightShot() {
        canShootLights = true;
    }

    private static void playerShootLights() {
        gameSystems.clearConsole();
        if (bossBattle) Cutscene.combatHeaderOlga(); else Cutscene.combatTopHeader();

        gameSystems.pauseText(350);
        System.out.print("\n                               ");
        gameSystems.printWithDelay("\033[0;90m>>> SNAKE'S TURN <<<\033[0m\n", 20);
        gameSystems.pauseText(350);

        gameSystems.printWithDelay("\n\033[0;37m  [Snake fires at the overhead lights...]\033[0m\n", 20);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("\n\033[0;32m  [Lights shattered! Olga's visibility suffers.]\033[0m\n", 20);
        gameSystems.pauseText(500);
        lightsOut = true;
        canShootLights = false;
        Cutscene.bottomHeader();
    }

    private static void playerFlee() {
        gameSystems.clearConsole();
        if (bossBattle) Cutscene.combatHeaderOlga(); else Cutscene.combatTopHeader();

        gameSystems.pauseText(350);
        System.out.print("\n                               ");
        gameSystems.printWithDelay("\033[0;90m>>> SNAKE'S TURN <<<\033[0m\n", 20);
        gameSystems.pauseText(350);

        if (bossBattle) {
            System.out.print("\n\033[1;31m  [You cannot flee from a boss fight!]\033[0m\n");
            gameSystems.pauseText(1000);
            Cutscene.bottomHeader();
            combatTurn();
            return;
        }

        gameSystems.printWithDelay("\n\033[0;37m  [Snake attempts to disengage and flee...]\033[0m", 10);
        gameSystems.pauseText(1000);

        int fleeChance = (int) (Math.random() * 100);
        if (bossBattle) {
            // boss cannot be fled easily
            fleeChance -= 30;
        }
        if (fleeChance > 50) {
            System.out.print("\n\n\033[0;32m  [SUCCESSFULLY ESCAPED!]\033[0m\n");
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("\n\033[1;32m  Snake evades the guard and retreats!\033[0m\n", 10);
            gameSystems.pauseText(1000);
            Cutscene.bottomHeader();
            // gameplayChoices.secondPlayerChoice();
        } else {
            System.out.print("\n\n\033[1;31m  [FAILED ESCAPE!]\033[0m\n\n");
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("\033[1;33m  [The guard blocks your escape route!]\033[0m\n", 10 );
            gameSystems.pauseText(1000);
            Cutscene.bottomHeader();
            enemyTurn();
            combatTurn++;
            combatTurn();
        }
    }

    private static void enemyTurn() {
        gameSystems.clearConsole();
        if (bossBattle) {
            Cutscene.combatHeaderOlga();
        } else {
            Cutscene.combatTopHeader();
        }

        // if lights have been shot out, Olga has a chance to miss
        if (bossBattle && lightsOut) {
            int missRoll = (int) (Math.random() * 100);
            if (missRoll < 30) { // 30% chance to whiff
                gameSystems.printWithDelay("\n\033[1;90m  [Olga fires wildly in the dark and misses!]\033[0m\n", 20);
                gameSystems.pauseText(500);
                Cutscene.bottomHeader();
                return;
            }
        }

        if (bossBattle) {

            System.out.print("  ");
            enemy.displayHealthBar();
            gameSystems.printWithDelay("\033[0;90m================================================================================\033[0m\n", 0);
            System.out.print(" ");

            gameSystems.pauseText(350);
            System.out.print("\n                                ");
            gameSystems.printWithDelay("\033[1;33m>>> OLGA'S TURN <<<\033[0m\n", 20);
            gameSystems.pauseText(350);
        } else {
            // show generic enemy health bar when it attacks
            System.out.print("  ");
            enemy.displayHealthBar();
            gameSystems.printWithDelay("\033[0;90m================================================================================\033[0m\n", 0);

            gameSystems.pauseText(350);
            System.out.print("\n                               ");
            gameSystems.printWithDelay("\033[1;33m>>> ENEMY ATTACK <<<\033[0m\n", 20);
            gameSystems.pauseText(350);
        }
        gameSystems.pauseText(500);

        int damage = enemy.attackSnake();
        
        if (bossBattle) {
            gameSystems.printWithDelay("\n\033[1;35m  [Olga smirks and counters...]\033[0m\n", 20); // purple
            gameSystems.pauseText(700);
        }

        if (bossBattle) {
            gameSystems.printWithDelay("\n\033[0;90m  [Olga attacks!]\033[0m\n", 10); // grey
        } else {
            gameSystems.printWithDelay("\n\033[0;90m  [The guard attacks!]\033[0m\n", 10);        }
        gameSystems.pauseText(600);
        
        player.takeDamage(damage);
        gameSystems.printWithDelay("\n\033[1;31m  [Snake takes " + damage + " damage!]\033[0m\n", 10); // red
        gameSystems.pauseText(500);

        Cutscene.bottomHeader();
    }

    private static void playerVictory() {
        // capture boss info before resetting
        boolean wasBoss = bossBattle;
        String type = enemy.getEnemyType();

        // Reset flags in case same combat reused
        bossBattle = false;
        chaffUsed = false;
        bossStunned = false;
        gameSystems.clearConsole();

        if (wasBoss) {
                System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m\n");
                System.out.println("\033[1;35m" + "              *** CONGRATULATIONS! YOU BEAT OLGA GURLUKOVICH ***" + "\033[0m\n");
                System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");
                gameSystems.printWithDelay("  [Snake overcomes Olga Gurlukovich and the mission continues...]\n", 30);
                gameSystems.readInput();
        } else {
            System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
            System.out.println("\033[1;32m" + "                            *** COMBAT VICTORY ***" + "\033[0m");
            System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");
            gameSystems.printWithDelay("\033[1;36m  [Snake defeats the " + type + ", rendering him unconscious]\033[0m\n", 30);
        }
        gameSystems.pauseText(1000);

        Cutscene.bottomHeader();
        gameSystems.clearConsole();
    }

    private static void playerDefeat() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;31m" + "                             *** STATUS: GAME OVER ***" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[1;36m  [Snake has been defeated. Mission failed.]\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90m  [Press ENTER to return to main menu]\033[0m");
        gameSystems.readInput();

        gameSystems.clearConsole();
        gameSystems.printWithDelay("\033[1;31mReturning to main menu...\033[0m", 20);
        gameSystems.pauseText(2000);
        Game.main(null); 
    }
}