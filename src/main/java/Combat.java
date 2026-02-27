public class Combat {
    private static Player player;
    private static Enemy enemy;
    private static int combatTurn = 1;

    // boss battle flags
    private static boolean bossBattle = false;
    private static boolean chaffUsed = false;
    private static boolean bossStunned = false;

    // Entry point for starting a fight
    public static void startCombat(Player p, Enemy e) {
        player = p;
        enemy = e;
        combatTurn = 1;
        bossBattle = e.getEnemyType().toLowerCase().contains("olga");
        chaffUsed = false;
        bossStunned = false;

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
        System.out.println("\033[0;37m   [3] \033[0;32mUSE RATION - Recover 20% HP\033[0m\n");
        if (bossBattle && !chaffUsed) {
            System.out.println("\033[0;37m   [4] Throw a CHAFF Grenade (stuns Olga for one turn)\033[0m\n");
            System.out.println("\033[0;37m   [5] Attempt to Flee\033[0m\n");
        } else {
            System.out.println("\033[0;37m   [4] Attempt to Flee\033[0m\n");
        }

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        if (bossBattle && !chaffUsed) {
            System.out.print("\033[0;90mChoose your action [1 - 5]: \033[0m");
        } else {
            System.out.print("\033[0;90mChoose your action [1 - 4]: \033[0m");
        }

        try {
            String input = gameSystems.readInput();
            int choice = Integer.parseInt(input);

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
                    if (bossBattle && !chaffUsed) {
                        playerFlee();
                        return;
                    }
                    // fall through to invalid below
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
                // unique boss header when stunned
                Cutscene.combatHeaderOlga();
                System.out.println("\n\033[0;37m  [Olga is blinded by the chaff and cannot move this turn!]\033[0m\n");
                gameSystems.pauseText(500);
                gameSystems.readInput();
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
            System.out.println("\033[1;31mInvalid input. Please enter a number between 1-4.\033[0m");
            gameSystems.pauseText(800);
            combatTurn();
        }
    }

    private static void playerShootAction() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

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
        Cutscene.combatTopHeader();

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
        Cutscene.combatTopHeader();
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
        player.healDamage(20);
        int healAmount = player.getHealth() - oldHealth;
        gameSystems.printWithDelay("\n\033[0;37m  Snake recovered " + "\033[0;32m[" + healAmount +  "]\033[0m" + " health!\033[0m\n", 10);
        gameSystems.pauseText(500);
        Cutscene.bottomHeader();
    }

    private static void playerUseChaff() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();
        gameSystems.printWithDelay("\n\033[0;37m  [Snake tosses a CHAFF grenade at Olga...]\033[0m\n", 20);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("\n\033[0;37m  Olga is temporarily blinded by swarming chaff!\033[0m\n", 20);
        gameSystems.pauseText(800);
        bossStunned = true;
        chaffUsed = true;
        Cutscene.bottomHeader();
    }

    private static void playerFlee() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

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
            enemyTurn(); // Guard gets a free hit if you fail to flee
            combatTurn++;
            combatTurn();
        }
    }

    private static void enemyTurn() {
        gameSystems.clearConsole();
        if (bossBattle) {
            // boss uses special red header
            Cutscene.combatHeaderOlga();
        } else {
            Cutscene.combatTopHeader();
        }

        // attack announcement UI
        if (bossBattle) {
            gameSystems.pauseText(350);
            System.out.print("\n                          ");
            gameSystems.printWithDelay("\033[1;33m>>> OLGA STRIKES <<<\033[0m\n", 20);
            gameSystems.pauseText(350);
        } else {
            gameSystems.pauseText(350);
            System.out.print("\n                               ");
            gameSystems.printWithDelay("\033[1;33m>>> ENEMY ATTACK <<<\033[0m\n", 20);
            gameSystems.pauseText(350);
        }
        gameSystems.pauseText(500);

        int damage = enemy.attackSnake();
        
        // boss-specific taunt
        if (bossBattle) {
            gameSystems.printWithDelay("\n\033[1;35m  [Olga smirks and counters...]\033[0m\n", 20); // purple
            gameSystems.pauseText(700);
        }

        if (bossBattle) {
            gameSystems.printWithDelay("\n\033[0;90m  [Olga attacks!]\033[0m\n", 10); // grey
        } else {
            gameSystems.printWithDelay("\n\033[1;31m  [The guard attacks!]\033[0m\n", 10);
        }
        gameSystems.pauseText(600);
        
        player.takeDamage(damage);
        gameSystems.printWithDelay("\n\033[1;31m  [Snake takes " + damage + " damage!]\033[0m\n", 10); // red
        gameSystems.pauseText(500);

        Cutscene.bottomHeader();
    }

    private static void playerVictory() {
        // Reset bossBattle flags in case the same combat object reused
        bossBattle = false;
        chaffUsed = false;
        bossStunned = false;
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;32m" + "                            *** COMBAT VICTORY ***" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");

        gameSystems.printWithDelay("\033[1;36m  [Snake defeats the " + enemy.getEnemyType() + ", rendering him unconscious]\033[0m\n", 30);
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