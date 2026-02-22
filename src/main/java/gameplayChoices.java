public class gameplayChoices {

    static Player player = new Player();  // Create a player

    public static void firstPlayerChoice() {
        gameSystems.clearConsole();

        // Display context in a stylized way
        System.out.println("\n\033[1;30m" + "=================================================================================" + "\033[0m"); // Bold gray for top border
        System.out.println("\033[1;37m\nContext: \033[0;37mSnake is stealthily crouched at the rear end of the USS Discovery");
        System.out.println("         Tanker, behind the ship's anchor connector points.\n" + "\033[0m");
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m");

        // inventory / health
        System.out.println("\033[32m0) Access Inventory\033[0m                               \033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");
        System.out.println("\033[1;30m" + "=================================================================================\n" + "\033[0m");

        System.out.println("\033[0;37m   [1] More Reconnaissance");
        System.out.println("   [2] Approach the guard watching over the waters"); // Sneak Left"); // sneak left
        System.out.println("   [3] ..."); // sneak right
        System.out.println("   [4] [View image of the unknown Russian Leader]\033[0m\n");

        System.out.println("   [5] CODEC OTACON\n");
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m");

        // Choice prompt
        System.out.print("\033[0;90mChoice : \033[0m");
        int choice = Integer.parseInt(gameSystems.readInput());  // Read the entire line as input

        switch (choice) {
            case 0:
                player.displayInventory();
                
                System.out.println("\033[0;90m\n     Press [ENTER] to return\n\033[0m");
                gameSystems.readInput();  // Correctly wait for user input
                firstPlayerChoice();
            break;

        case 1: // option : more recon
            gameSystems.clearConsole();
            Cutscene.topHeader();
            gameSystems.printWithDelay("\n  [Using his binoculars, Snake observes the ship's layout. On the lower left \n  deck, a guard silently watches over the dark waters. Above, on the upper \n  deck, another guard admires the distant New York City skyline].\n\n", 40);
            gameSystems.pauseText(1000);

            Cutscene.bottomHeader();
            firstPlayerChoice();

        case 2: // option : approach the guard
        gameSystems.clearConsole();
        Enemy guard = new Enemy("Russian Guard");
        Combat.startCombat(player, guard);
        break;

        case 3:
        gameSystems.clearConsole();
        System.out.println("Work in progress");
        System.out.println("\n          Press [ENTER] to return\n");
        gameSystems.readInput();  // Correctly wait for user input
        firstPlayerChoice();

        case 4:
            gameSystems.clearConsole();
            asciiArt.imageRussianLeader();
            gameSystems.readInput();        
                firstPlayerChoice();

        case 5:
                gameSystems.clearConsole();
                System.out.println("Work in progress");
                System.out.println("\nPress [ENTER] to return\n");
                gameSystems.readInput();  // Correctly wait for user input    
                firstPlayerChoice();
        }
    }

    public static void secondPlayerChoice() {
        System.out.println("2nd player choice screen");
    }
}
