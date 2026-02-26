public class gameplayChoices {

    static Player player = new Player();  // Create a player
    static boolean hasGatheredIntel = false;
    static boolean hasPeeked = false;
    static boolean lockerOneChecked = false;
    static boolean lockerThreeChecked = false;
    static boolean lockerProgress = false;

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
                System.out.println("           A guard watches the waters ahead, unaware of Snake's silent approach.\n");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m");

            System.out.println("\033[32m [0] Access Inventory\033[0m"+ "\033[0;90m | SYS: STABLE |                | TEMP: 12°C | \033[0m" + "\033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m\n");

            System.out.println("\033[0;37m   [1] More Reconnaissance");
            System.out.println("   [2] Approach the guard watching over the waters\n");
            System.out.println("   [3] [View image of the unknown Russian Leader]\n");
            System.out.println("   [R] [View Soliton Radar]");
            System.out.println("   [C] CODEC OTACON\033[0m\n");

            System.out.println("\033[1;30m====================================================================================================\033[0m");

            System.out.print("\033[0;90m   Choice : \033[0m");

        String choice = gameSystems.readInput().trim().toUpperCase();

            switch (choice) {
                case "0":
                    player.displayInventory();
                    
                    System.out.println("\033[0;90m\n     Press [ENTER] to return\n\033[0m");
                    gameSystems.readInput();  // Correctly wait for user input
                    firstPlayerChoice();
                break;

            case "1": // option : more recon
                gameSystems.clearConsole();
                Cutscene.topHeader();
                gameSystems.printWithDelay("\n  [Using his binoculars, Snake observes the ship's layout. On the lower left \n  deck, a guard silently watches over the dark waters. Above, on the upper \n  deck, another guard admires the distant New York City skyline].\n", 30);
                hasGatheredIntel = true;

                gameSystems.pauseText(500);
                gameSystems.printWithDelay("\033[0;32m\n  [Snake's Soliton Radar has been updated]\033[0m\n", 30);
                gameSystems.pauseText(600);

                Cutscene.bottomHeader();
                firstPlayerChoice();

            case "2": // option : approach the guard
                gameSystems.clearConsole();

                Cutscene.topHeader();
                gameSystems.printWithDelay("\n  The storm drowns out Snake's footsteps as he closes in.\n", 30);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\n  The guard stands by the railing, watching the lights of Manhattan shimmer\n  through the rain.\n", 30);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\n  The guard shifts-instinctively,", 30);
                gameSystems.pauseText(00);
                gameSystems.printWithDelay(" sensing movement behind him.\n\n\n", 30);
                gameSystems.pauseText(1000);

                System.out.println("\033[0;90m  ----------------------------------------------------------------------------  \033[0m");
                System.out.println("\033[0;90m   ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~   \033[0m");
                System.out.println("\033[0;90m\033[0m                                                       \033[31m!\033[0m                                         \033[0;90m\033[0m");
                System.out.println("\033[0;90m\033[0m                                           \033[36m   O\033[0m        O                                         \033[0;90m\033[0m");
                System.out.println("\033[0;90m\033[0m                                          \033[36m   /|\\\033[0m      /|\\                                        \033[0;90m\033[0m");
                System.out.println("\033[0;90m\033[0m                                          \033[36m   / \\\033[0m      / \\                                        \033[0;90m\033[0m");
                System.out.println("\033[0;90m  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  \033[0m");
                gameSystems.pauseText(1500);

                Cutscene.bottomHeader();

                Enemy guard = new Enemy("Russian Guard");
                Combat.startCombat(player, guard);
                gameSystems.pauseText(500);

                gameSystems.clearConsole();
                Cutscene.topHeader();
                gameSystems.printWithDelay("\n\033[1;36m  [Snake drags the unconscious body across the rain-soaked deck.]\033[0m\n\n", 30);
                    gameSystems.pauseText(1000);
                    gameSystems.printWithDelay("\033[1;36m  [With a swift motion, he throws the guard overboard]\033[0m\n\n", 30);
                    gameSystems.pauseText(500);
                    gameSystems.printWithDelay("\033[1;36m  [the splash is completely masked by the pounding rain.]\033[0m\n\n", 30);
                    gameSystems.pauseText(1000);
                    gameSystems.printWithDelay("\033[1;36m  [Snake turns toward the nearest hatch and slips inside the tanker.]\033[0m\n", 30);
                    gameSystems.pauseText(2000);
                Cutscene.bottomHeader();
                secondPlayerChoice();
            break;

            case "R":
                gameSystems.clearConsole();
                asciiArt.displaySolitonRadarSCREENONE(hasGatheredIntel);
                firstPlayerChoice();
            break;

            case "3":
                gameSystems.clearConsole();
                asciiArt.imageRussianLeader();
            break;

            case "C":
                gameSystems.clearConsole();
                CODEC.callOtaconSCREENONE();
            break;
            }
        }

    public static void secondPlayerChoice() {
        gameSystems.clearConsole();

            System.out.println("\n\033[1;30m====================================================================================================\033[0m");

            System.out.println(
                "\033[1;37m LOCATION : \033[0;37mUSS Discovery - Deck-A crew's quarters, port"
            + "\033[0;90m | WX: HEAVY RAIN | | HR 65 BPM | ALERT : 0\033[0m");

            System.out.println("\033[1;30m====================================================================================================\033[0m\n");

                System.out.print("\033[1;37m CONTEXT: \033[0m");
                System.out.println(" Snake is inside the Tanker now, crouched behind the corner of a narrow passageway.");
                System.out.println("           The corridor ahead is dim and still, its shadows hiding whatever waits beyond the");
                System.out.println("           turn.\n");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m");

            System.out.println("\033[32m [0] Access Inventory\033[0m"+ "\033[0;90m | SYS: STABLE |                | TEMP: 10°C | \033[0m" + "\033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m\n");

            System.out.println("\033[0;37m   [1] Peek around the corner");

            System.out.println("   [2] ...");

            if (hasPeeked) {
            System.out.println("");
            } else {
                System.out.println("   [3] Sneak into the open doorway\n");
            }

            if (hasPeeked) {
                System.out.println("   [3] [Distract the Guard]\n");
            } else {
                System.out.print("");
            }

            System.out.println("   [R] [View Soliton Radar]");
            System.out.println("   [C] ...\033[0m\n");

            System.out.println("\033[1;30m====================================================================================================\033[0m");

            System.out.print("\033[0;90m   Choice : \033[0m");

        String choice = gameSystems.readInput().trim().toUpperCase();

    switch (choice) {
        case "0":
            player.displayInventory();
            System.out.println("\033[0;90m\n     Press [ENTER] to return\n\033[0m");
            gameSystems.readInput();
            secondPlayerChoice();
        break;

        case "1": // peek around the corner
            gameSystems.clearConsole();
            Cutscene.topHeader();
            gameSystems.printWithDelay("\n  Snake leans out, just enough to study the passage ahead.\n\n", 40);
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("  An armed guard moves up and down the hallway in a slow and steady rhythm, his\n", 40);
            gameSystems.printWithDelay("  footsteps echoing off the metal flooring.\n\n", 40);
            gameSystems.pauseText(2000);

            gameSystems.printWithDelay("  Past the bend, a door sits slightly open - close enough to reach, but only\n", 40);
            gameSystems.printWithDelay("  when the guard turns his back.\n", 40);
            gameSystems.pauseText(2000);

            hasGatheredIntel = true; // updates radar map
            hasPeeked = true;
            gameSystems.printWithDelay("\033[0;32m\n  [Snake's Soliton Radar has been updated]\033[0m\n", 0);
            gameSystems.pauseText(1500);
            Cutscene.bottomHeader();
            secondPlayerChoice();
        break;

        case "3": // slip through the door
            if (hasPeeked) {
                // SUCCESSFUL STEALTH
                gameSystems.clearConsole();
                Cutscene.topHeader();
                gameSystems.printWithDelay("\n  Snake taps the wall - two sharp knocks.\n", 40);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("  The guard mutters, stepping slowly, curiosity pulling him closer.\n\n", 40);
                gameSystems.pauseText(1000);

                gameSystems.printWithDelay("  As he leans past the corner, Snake hooks an arm around his neck and drags\n", 40);
                gameSystems.printWithDelay("  him back into a tight, controlled hold. The guard struggles briefly, \n", 40);
                gameSystems.printWithDelay("  his breathing slowing as he loses consciousness.\n\n", 40);
                gameSystems.pauseText(1500);

                gameSystems.printWithDelay("  Snake lowers him gently and searches the guard for supplies.\n", 40);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\033[0;32m\n  [Item Obtained: Pack of Cigarettes]\033[0m\n", 0);
                player.addItem("Pack of Cigarettes");
                Cutscene.bottomHeader();
                secondPlayerChoice();
            } else {
                // FAILED STEALTH → COMBAT
                gameSystems.clearConsole();
                Cutscene.topHeader();
                gameSystems.printWithDelay("\n  Snake moves for the open door, keeping low and silent...\n", 40);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("  But the guard suddenly breaks his patrol pattern, locking eyes onto Snake.\n", 40);
                gameSystems.pauseText(1000);
                gameSystems.printWithDelay("\n  There's no slipping away now!\n", 40);
                gameSystems.pauseText(1000);
                Cutscene.bottomHeader();

                Enemy guard = new Enemy("Russian Guard");
                Combat.startCombat(player, guard);
                Cutscene.lockerRoom();
                secondPlayerChoice();
            }
        break;
        
        case "2":
            gameSystems.clearConsole();
            Cutscene.topHeader();

            System.out.println("option 2");

            Cutscene.bottomHeader();
            secondPlayerChoice();
        break;


        case "4":
            if (hasPeeked) {
                gameSystems.clearConsole();
                System.out.println("   [4] Knock on the wall");
                secondPlayerChoice();
                } else {
                    secondPlayerChoice(); // or show "You don't know enough yet"
                }
        break;

        case "R":
            gameSystems.clearConsole();
            asciiArt.displaySolitonRadarSCREENTWO(hasGatheredIntel);
            secondPlayerChoice();
        break;

        case "C": // codec otacon option
        gameSystems.clearConsole();
        System.out.println("calls otacon");
        Cutscene.bottomHeader();
        secondPlayerChoice();
        break;

        default:
            secondPlayerChoice();
        break;
        }
    }




















    public static void lockerRoomChoice() {
        gameSystems.clearConsole();

            System.out.println("\n\033[1;30m====================================================================================================\033[0m");

            System.out.println(
                "\033[1;37m LOCATION : \033[0;37mUSS Discovery - Deck-A crew's Locker Room"
            + "\033[0;90m | WX: RN / VIS LOW | HR 66 BPM  | ALERT : <20\033[0m");

            System.out.println("\033[1;30m====================================================================================================\033[0m\n");

                System.out.print("\033[1;37m CONTEXT: \033[0m");
                System.out.println(" //");
                System.out.println("           //");
                System.out.println("           //\n");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m");

            System.out.println("\033[32m [0] Access Inventory\033[0m"+ "\033[0;90m | SYS: STABLE |                | TEMP: 11°C | \033[0m" + "\033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");

            System.out.println("\033[1;30m----------------------------------------------------------------------------------------------------\033[0m\n");

            if (lockerOneChecked) { // LOCKED
                    System.out.println("\033[0;37m   [1] Open Locker #1 - Locked\033[0m");
                } else {
                    System.out.println("\033[0;37m   [1] Open Locker #1\033[0m");
                }

            System.out.println("   [2] Open Locker #2"); // GET CHAFF NADE



            if (lockerThreeChecked) { // LOCKED
                    System.out.println("\033[0;37m   [3] Open Locker #3 - Locked\033[0m");
                } else {
                    System.out.println("\033[0;37m   [3] Open Locker #3\033[0m");
                }

            if (lockerProgress) {
                System.out.println("\033[0;37m   [4] Open Locker #4\n\n   [P] Proceed\033[0m");
            } else {
            System.out.println("   [4] Open Locker #4");
            }

            System.out.println("\n   [R] [View Soliton Radar]");
            System.out.println("   [C] CODEC OTACON\033[0m\n");

            System.out.println("\033[1;30m====================================================================================================\033[0m");

            System.out.print("\033[0;90m   Choice : \033[0m");

        String choice = gameSystems.readInput().trim().toUpperCase();

            switch (choice) {
                case "0":
                    player.displayInventory();
                    
                    System.out.println("\033[0;90m\n     Press [ENTER] to return\n\033[0m");
                    gameSystems.readInput();  // Correctly wait for user input
                    firstPlayerChoice();
                break;

                case "1":
                    gameSystems.clearConsole();
                    Cutscene.topHeader();

                        gameSystems.printWithDelay("\n  [This locker is locked]\n", 40);
                        lockerOneChecked = true;
                        gameSystems.pauseText(1000);

                    Cutscene.bottomHeader();
                    lockerRoomChoice();
                break;

                case "2":
                gameSystems.clearConsole();
                Cutscene.topHeader();
                    gameSystems.printWithDelay("\n  Snake opens the locker and rummages through it.\n", 40);
                    gameSystems.pauseText(1000);
                    gameSystems.printWithDelay("\033[0;32m\n  [Item Obtained: Chaff Grenade]\033[0m\n", 0);

                    player.addItem("Chaff Grenade");
                    gameSystems.pauseText(1500);

                Cutscene.bottomHeader();
                lockerRoomChoice();
                break;

                case "3":
                    gameSystems.clearConsole();
                    Cutscene.topHeader();

                        gameSystems.printWithDelay("\n  [This locker is locked]\n", 40);
                        lockerThreeChecked = true;
                        gameSystems.pauseText(1000);

                    Cutscene.bottomHeader();
                    lockerRoomChoice();
                break;


                case "4":
                gameSystems.clearConsole();
                Cutscene.topHeader();
                    lockerProgress = true;

                System.out.println("\nshows porn poster");
                Cutscene.bottomHeader();
                lockerRoomChoice();
                break;

                case "P":
                break;


                case "R":
                break;

                case "C":
                break;
            }
        }
}


