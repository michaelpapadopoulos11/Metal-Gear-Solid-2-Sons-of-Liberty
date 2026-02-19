public class Combat {
    private static Player player;
    private static Enemy enemy;
    private static int combatTurn = 1;

    public static void startCombat(Player p, Enemy e) {
        player = p;
        enemy = e;
        combatTurn = 1;

        // Flash effect - first flash
public static void combatIntroAnimation() { // combat intro b4 fights  
        gameSystems.clearConsole();
        System.out.println("\n");
        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              COMBAT ENCOUNTER              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);

        System.out.println("\n");
        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              COMBAT ENCOUNTER              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
    }
        combatIntroAnimation();
        gameSystems.pauseText(800);
        System.out.println("\n\033[1;36m[A guard blocks your path!]\033[0m\n");
        
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90m[Press ENTER to engage in combat]\033[0m");
        gameSystems.readInput();

        combatTurn();
    }

    private static void combatTurn() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;36m[COMBAT VIEWER] | TURN " + combatTurn + " — SNAKE VS " + enemy.getEnemyType() + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");

        System.out.print("\n\033[0;37mSnake's Health - \033[0m");
        player.checkSnakeHealthBar();

        System.out.println();
        enemy.displayHealthBar();

        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[0;37m[1] Shoot with M9 Tranquilizer\033[0m");
        System.out.println("\033[0;37m[2] CQC Attack\033[0m");
        System.out.println("\033[0;37m[3] \033[0;32mUSE RATION - Recovers 20% Health\033\033[0m\n");
        System.out.println("\033[0;37m[4] Attempt to Flee\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90mChoose your action [1-4]: \033[0m");

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
                    break;
                default:
                    System.out.println("\033[1;31mInvalid choice. Try again.\033[0m");
                    gameSystems.pauseText(800);
                    combatTurn();
                    return;
            }

            if (!enemy.isAlive()) {
                playerVictory();
                return;
            }

            gameSystems.pauseText(1500);
            enemyTurn();

            if (player.getHealth() <= 0) {
                playerDefeat();
                return;
            }

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
        System.out.println("\n\033[0;37m[Snake carefully aims the M9 and fires...]\033[0m");
        gameSystems.pauseText(1000);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 20) {
            int damage = 25 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);
            System.out.println("\033[1;32m[HIT! The dart strikes the guard, dealing " + damage + " damage!]\033[0m");
        } else {
            System.out.println("\033[1;33m[MISS! The tranquilizer dart goes wide!]\033[0m");
        }
    }

    private static void playerCQCAction() {
        gameSystems.clearConsole();
        System.out.println("\n\033[0;37m[Snake rapidly closes the distance and engages in close combat!]\033[0m");
        gameSystems.pauseText(800);

        int hitChance = (int) (Math.random() * 100);
        if (hitChance > 30) {
            int damage = 15 + (int) (Math.random() * 10);
            enemy.takeDamage(damage);
            System.out.println("\033[1;32m[HIT! A swift CQC move deals " + damage + " damage!]\033[0m");
        } else {
            System.out.println("\033[1;33m[The guard avoids the attack!]\033[0m");
        }
    }

    private static void playerUseRation() {
        gameSystems.clearConsole();
        System.out.println("\n\033[0;37m[Snake takes a moment to eat a ration...]\033[0m");
        gameSystems.pauseText(800);
        
        int oldHealth = player.getHealth();
        player.healDamage(20);
        int healAmount = player.getHealth() - oldHealth;
        
        System.out.println("\033[1;32m[Recovered " + healAmount + " health!]\033[0m");
    }

    private static void playerFlee() {
        gameSystems.clearConsole();
        System.out.println("\n\033[0;37m[Snake attempts to disengage and flee...]\033[0m");
        gameSystems.pauseText(800);

        int fleeChance = (int) (Math.random() * 100);
        if (fleeChance > 50) {
            System.out.println("\033[1;32m[Success! Snake evades the guard and retreats!]\033[0m");
            gameSystems.pauseText(1000);
            gameplayChoices.firstPlayerChoice();
        } else {
            System.out.println("\033[1;33m[The guard blocks your escape route!]\033[0m");
        }
    }

    private static void enemyTurn() {
        gameSystems.clearConsole();
        int damage = enemy.attackSnake();
        
        System.out.println("\n\033[1;31m[The guard attacks!]\033[0m");
        gameSystems.pauseText(600);
        
        player.takeDamage(damage);
        System.out.println("\033[1;31m[You take " + damage + " damage!]\033[0m");
    }

    private static void playerVictory() {
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;32m" + "                            *** COMBAT VICTORY ***" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m\n");

        System.out.println("\033[1;36m[The guard falls to the tranquilizer. Snake stands victorious.]\033[0m\n");
        System.out.println("\033[0;37m[You proceed deeper into the ship...]\033[0m\n");

        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.print("\033[0;90m[Press ENTER to continue]\033[0m");
        gameSystems.readInput();

        gameSystems.clearConsole();
        gameplayChoices.firstPlayerChoice();
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