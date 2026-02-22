public class Combat {
    private static Player player;
    private static Enemy enemy;
    private static int combatTurn = 1;

    // Entry point for starting a fight
    public static void startCombat(Player p, Enemy e) {
        player = p;
        enemy = e;
        combatTurn = 1;

        // combatIntroAnimation();
        
        // gameSystems.pauseText(800);
        Cutscene.topHeader();
        gameSystems.printWithDelay("\n\033[1;36m[Snake stealthily sneaks up behind the guard!]\033[0m", 30);
        gameSystems.pauseText(1000);
        System.out.println();
        
        Cutscene.bottomHeader();
        combatTurn();
    }

    // Displays the flashing intro box
    public static void combatIntroAnimation() { 
        for (int i = 0; i < 2; i++) {
            gameSystems.clearConsole();
            System.out.println("\n");
            System.out.println("   ┌────────────────────────────────────────────┐");
            System.out.println("   │                                            │");
            System.out.println("   │               COMBAT ENCOUNTER             │");
            System.out.println("   │                                            │");
            System.out.println("   └────────────────────────────────────────────┘");
            gameSystems.pauseText(500);
            gameSystems.clearConsole();
            gameSystems.pauseText(500);
        }
    }

    // Main combat loop logic
    private static void combatTurn() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;36m[COMBAT VIEWER] | TURN " + combatTurn + "                                 SNAKE VS " + enemy.getEnemyType() + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");

        System.out.print("\n\033[0;37mSnake's Health - \033[0m");
        player.checkSnakeHealthBar();

        System.out.println();
        enemy.displayHealthBar();

        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[0;37m[1] Shoot with M9 Tranquilizer\033[0m");
        System.out.println("\033[0;37m[2] CQC Attack\033[0m");
        System.out.println("\033[0;37m[3] \033[0;32mUSE RATION - Recovers 20% Health\033[0m\n");
        System.out.println("\033[0;37m[4] Attempt to Flee\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90mChoose your action [1 - 4]: \033[0m");

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
                    playerFlee();
                    return; // Stop the combat loop if fleeing
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
            enemyTurn();

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

        gameSystems.printWithDelay("\n\033[0;37m[Snake carefully aims the M9 and fires...]\033[0m\n\n", 30);
        gameSystems.pauseText(1000);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 20) {
            int damage = 25 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);

            System.out.println("\033[0;32m[HIT!]\033[0m\n");
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;32mThe dart strikes the guard, dealing " + damage + " damage!\033[0m\n", 20);
            gameSystems.pauseText(700);
        } else {
            gameSystems.printWithDelay("\033[1;31m[MISS!]\033[0m\n\n", 0);
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;33mThe tranquilizer dart goes wide!\033[0m\n", 20);
            gameSystems.pauseText(700);
        }
        Cutscene.bottomHeader(); // has a delay when pressing enter here not sure why ??
    }

    private static void playerCQCAction() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

        gameSystems.printWithDelay("\n\033[0;37m[Snake closes in on the guard and engages a CQC attack!]\033[0m\n", 20);
        gameSystems.pauseText(1000);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 30) {
            int damage = 15 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);
            System.out.println("\n\033[0;32m[HIT!]\033[0m\n");
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;32mA swift CQC attack deals " + damage + " damage!\033[0m\n", 20);
            gameSystems.pauseText(700);
        } else {
            gameSystems.printWithDelay("\n\033[1;31m[MISS!]\033[0m\n\n", 0);
            gameSystems.pauseText(500);
            gameSystems.printWithDelay("\033[1;33m[The guard avoids the attack!]\033[0m\n", 20);
            gameSystems.pauseText(700);
        }
        Cutscene.bottomHeader();
    }

    private static void playerUseRation() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

        gameSystems.printWithDelay("\n\033[0;37m[Snake takes a moment to eat a ration...]\033[0m\n\n", 20);
        gameSystems.pauseText(800);
        
        int oldHealth = player.getHealth();
        player.healDamage(20);
        int healAmount = player.getHealth() - oldHealth;
        gameSystems.printWithDelay("\033[0;37mSnake recovered \033[1;32m[+" + healAmount + "]\033[0;37m health!\033[0m\n", 20);
        Cutscene.bottomHeader();
    }

    private static void playerFlee() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

        System.out.println("\n\033[0;37m[Snake attempts to disengage and flee...]\033[0m");
        gameSystems.pauseText(800);

        int fleeChance = (int) (Math.random() * 100);
        if (fleeChance > 50) {
            System.out.println("\033[1;32m[Success! Snake evades the guard and retreats!]\033[0m");
            gameSystems.pauseText(1000);
            gameplayChoices.firstPlayerChoice();
        } else {
            System.out.println("\033[1;33m[The guard blocks your escape route!]\033[0m");
            gameSystems.pauseText(1000);
            enemyTurn(); // Guard gets a free hit if you fail to flee
            combatTurn++;
            combatTurn();
        }
    }

    private static void enemyTurn() {
        gameSystems.clearConsole();
        Cutscene.combatTopHeader();

        int damage = enemy.attackSnake();
        
        gameSystems.printWithDelay("\n\033[1;31m[The guard attacks!]\033[0m\n", 10);
        gameSystems.pauseText(600);
        
        player.takeDamage(damage);
        gameSystems.printWithDelay("\n\033[1;31m[Snake takes " + damage + " damage!]\033[0m\n", 10);
        gameSystems.pauseText(500);

        Cutscene.bottomHeader();
    }

    private static void playerVictory() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;32m" + "                            *** COMBAT VICTORY ***" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");

        gameSystems.printWithDelay("\033[1;36m[Snake defeats the " + enemy.getEnemyType() + " and proceeds deeper into the tanker!]\033[0m\n", 20);
        gameSystems.pauseText(1000);

        Cutscene.bottomHeader();
        gameSystems.readInput();

        gameSystems.clearConsole();
        gameplayChoices.secondPlayerChoice();
    }

    private static void playerDefeat() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;31m" + "                             *** STATUS: GAME OVER ***" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[1;36m[Snake has been defeated. Mission failed.]\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90m[Press ENTER to return to main menu]\033[0m");
        gameSystems.readInput();

        gameSystems.clearConsole();
        System.out.println("\033[1;31mReturning to main menu...\033[0m");
    }
}