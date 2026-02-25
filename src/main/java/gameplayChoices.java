public class gameplayChoices {

    static Player player = new Player();  // Create a player
    static boolean hasGatheredIntel = false;

    public static void firstPlayerChoice() {
        gameSystems.clearConsole();

            System.out.println("\n\033[1;30m====================================================================================================\033[0m");

            System.out.println(
                "\033[1;37m LOCATION : \033[0;37mUSS Discovery - Aft Deck"
            + "\033[0;90m |      | WX: HEAVY RAIN / VIS LOW | BIO: HR 62 BPM | ALERT : 0\033[0m");

            System.out.println("\033[1;30m====================================================================================================\033[0m\n");

                System.out.print("\033[1;37m CONTEXT: \033[0m");
                System.out.println(" Snake remains low behind the anchor connector points, keeping his profile hidden.");
                System.out.println("           Rain pounds on the deck, masking his movement beneath the constant noise.");
                System.out.println("           A guard watches the waters ahead, unaware of Snake’s silent approach.\n");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m");

            System.out.println("\033[32m [0] Access Inventory\033[0m"+ "\033[0;90m | SYS: STABLE |                | TEMP: 12°C | \033[0m" + "\033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m\n");

            System.out.println("\033[0;37m   [1] More Reconnaissance");
            System.out.println("   [2] Approach the guard watching over the waters\n");
            System.out.println("   [3] View Soliton Radar");
            System.out.println("   [4] View image of the unknown Russian Leader\n");
            System.out.println("   [5] CODEC OTACON\033[0m\n");

            System.out.println("\033[1;30m====================================================================================================\033[0m");

            System.out.print("\033[0;90m   Choice : \033[0m");

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
                gameSystems.printWithDelay("\n  [Using his binoculars, Snake observes the ship's layout. On the lower left \n  deck, a guard silently watches over the dark waters. Above, on the upper \n  deck, another guard admires the distant New York City skyline].\n", 30);
                hasGatheredIntel = true;

                gameSystems.pauseText(500);
                gameSystems.printWithDelay("\033[0;32m\n  [Snake's Soliton Radar has been updated]\033[0m\n", 30);
                gameSystems.pauseText(1000);

                Cutscene.bottomHeader();
                firstPlayerChoice();

            case 2: // option : approach the guard
                gameSystems.clearConsole();

                Cutscene.topHeader();
                gameSystems.printWithDelay("\n  The storm drowns out Snake's footsteps as he closes in.\n", 30);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\n  The guard stands by the railing, watching the lights of Manhattan \n  shimmer through the rain.\n", 30);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\n  The guard shifts-instinctively,", 30);
                gameSystems.pauseText(500);
                gameSystems.printWithDelay(" sensing movement behind him.", 30);
                gameSystems.pauseText(1500);
                System.out.println();
                Cutscene.bottomHeader();

                Enemy guard = new Enemy("Russian Guard");
                Combat.startCombat(player, guard);
                gameSystems.pauseText(500);

                gameSystems.clearConsole();
                Cutscene.topHeader();
                gameSystems.printWithDelay("\n\033[1;36m  [Snake drags the unconscious body across the rain-soaked deck.]\033[0m\n\n", 30);
                    gameSystems.pauseText(1000);
                    gameSystems.printWithDelay("\033[1;36m  [With a swift motion, he throws the guard overboard-]\033[0m\n\n", 30);
                    gameSystems.pauseText(500);
                    gameSystems.printWithDelay("\033[1;36m  [the splash is completely masked by the pounding rain.]\033[0m\n\n", 30);
                    gameSystems.pauseText(1000);
                    gameSystems.printWithDelay("\033[1;36m  [Snake turns toward the nearest hatch and slips inside the tanker.]\033[0m\n", 30);
                    gameSystems.pauseText(2000);
                Cutscene.bottomHeader();

                secondPlayerChoice();
            break;

            case 3:
                gameSystems.clearConsole();
                    asciiArt.displaySolitonRadar(hasGatheredIntel);
                firstPlayerChoice();
            break;

            case 4:
                gameSystems.clearConsole();
                asciiArt.imageRussianLeader();
            break;

            case 5:
                gameSystems.clearConsole();
                CODEC.callOtaconSCREENONE();
            break;
            }
        }

    public static void secondPlayerChoice() {
        gameSystems.clearConsole();

        System.out.println("\n\033[1;30m" + "=================================================================================" + "\033[0m"); // Bold gray for top border
        System.out.println("\033[1;37m\nContext: \033[0;37msnake sneakily enters the ship through");
        System.out.println("         Tanker, behind the ship's anchor connector points.\n\n" + "\033[0m");
        System.out.println("\033[1;37m\nLocation: \033[0;37mDeck-A, crew's quarters, port");
        System.out.println("         Tanker, behind the ship's anchor connector points.\n" + "\033[0m");
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m");
    }
}
