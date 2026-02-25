public class asciiArt {

    public static void digitalCameraTopUI() {
        System.out.println("\n" + "\033[1;30m" + "====================================================================================================" + "\033[0m");
        System.out.println("" + "\033[1;30m" + " DIGITAL CAMERA VIEWER | IMG 002/002 | 14:32:55 |                             | MODE: TACTICAL VIEW " + "\033[0m");
        System.out.println("" + "\033[1;30m" + "====================================================================================================" + "\033[0m\n");
    }

    public static void digitalCameraBottomUI() {
        System.out.println("\n" + "\033[1;30m" + "====================================================================================================" + "\033[0m");
        System.out.println("" + "\033[1;30m" + " TIME: 12:48 | BATTERY: \033[1;32m84%\033[1;30m |                                  | SYSTEM: ONLINE | CONTINUE: " + "\033[0;32m[ENTER]\033[0m");
        System.out.println("" + "\033[1;30m" + "====================================================================================================" + "\033[0m");
    }
    
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

    public static void imageRussianLeader() {

        // create a digital camera UI for the image ????
        // loading image screen ????        

        String indent = "         ";

        gameSystems.clearConsole();

        System.out.println("\n" + "\033[1;30m" + "====================================================================================================" + "\033[0m");
        System.out.println("" + "\033[1;30m" + " DIGITAL CAMERA VIEWER |                                                      | MODE: TACTICAL VIEW " + "\033[0m");
        System.out.println("" + "\033[1;30m" + "====================================================================================================" + "\033[0m\n");
        
        gameSystems.printWithDelay("\n" + indent + "Loading image...\n", 20);

        System.out.print(indent);
        for (int i = 0; i < 10; i++) {
            System.out.print("█");
            gameSystems.pauseText(500);
        }

        gameSystems.printWithDelay("\n" + indent + "\033[1;30mDecoding image data...\033[0m", 2);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("\n" + indent + "\033[1;30mDecrypting image...\033[0m\n", 2);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(indent + "\033[1;30mVerifying image data...\033[0m\n", 2);
        gameSystems.pauseText(300);

        gameSystems.printWithDelay("\n" + indent + "\033[0;32mImage retrieval successful. Now displaying image\033[0m", 5);
        int i = 0;
        while (i < 3) {
            System.out.print("\033[0;32m.\033[0m"); 
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

        gameSystems.pauseText(1000);
        gameSystems.clearConsole();

        digitalCameraTopUI();
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::::::::::.     =#@@@@@@@@@@@@%+     :::::::::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::::::::.   *@@@:               .:@@@   .::::::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::::::  *@@         ::::::::::::    .@@  .::::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::::::  @   .:: @@@@ ::::::::::::::::   @#  :::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::::  @  ::::   %@   :::::::::::::::::   @  ::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::::. @  ::::: @@  %@ :::::::::::::::::::  @  :::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::: :@ :::::: @@@@@@ :::::::::::::::::::: =@ :::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::: @  .     .       :..       .:::::::::. @  ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::  @  .+@@@  :===----=+=.-@@@@.:::::::::: :# ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::  @ @#    @@@:  ::::...:@@@@:      ::::::. @ ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::: @@   @      @*.::             @@@    :::: @ ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::: @  . @ #@@@@  .:: @@@%.-::::    @ @@  .:: @ ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::: @    @    @: ::::     .:::.  @   @  @#  . @ ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::  @  @  .  @      ::::::    @@   @=   .@  .@ ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::: @@ @ ::: @ @@@@ :::.   @@@   : @ @@   @ .% ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::.  @@ :::        :::.@@     ::: .   .:  @ % ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::::::::::::::  @@ .   @@@@@@  .:.   ::::::::: @ ::  @ + ::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::: -+@   @@    @@@@.::::::::::::::   :  @ @ .::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::: @ @=     ::     .:::::::::::::   .  @:@  :::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::: @ *@ ::::::::::::::::::::::::  @ - %    ::::::::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::::::::. @  @ ::::::::::::::::.     .-:@@=@@@*+=.    .:::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::::::.     -=+@@@ ::::::::::::.    *@@@%-.         .:@@@+  ::::::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::::::.    @@@@+.    @ :::::::::.   =@@:     .:::::::::::.    @ .:::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::::  #@@:     :.  @  :::.     :@@@    ::::::::::::::::::::: @:  ::::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::::.  @    :::::: :@ @     @@@@@:    :::::::::::::::::::::::.  *@ .:::::::::::\n", 1);
            gameSystems.printWithDelay(" ::::::::::::::::::::::  #@  ::::::::  @   .@ @@     .::::::::::::::::::::::      @@@@@@:::::::::::\n", 1);
            gameSystems.printWithDelay(" :::::::::::::::::::::. @@  :::::::.  @      @   :::::::::::::::::::::::    =@@@@@     @@@:::::::::\n", 1);
        digitalCameraBottomUI();
        gameSystems.readInput();

            // Closing out animation
            gameSystems.clearConsole();
            asciiArt.digitalCameraTopUI();
            gameSystems.pauseText(600);
            System.out.println("\n");
            gameSystems.printWithDelay("         \033[1;90mClosing viewer...\033[0m\n", 5);
            gameSystems.pauseText(2000);
            gameSystems.clearConsole();

            // Return to main choice
            gameplayChoices.firstPlayerChoice();
        }
    // public static void posterOne() {} // lewd poster moment


public static void displaySolitonRadarSCREENONE() { 
    solitonRadarTopHeader();
            gameSystems.printWithDelay("\n                                                       \033[1;90m[ SOLITON RADAR SYSTEM : \033[0m\033[0;32mACTIVE\033[0m\033[1;90m ]\033[0m", 10);
            gameSystems.pauseText(1000);

            gameSystems.printWithDelay("\033[1;90m\n\n\033[0m", 2);

            gameSystems.printWithDelay("\033[1;90m                                            ^   [UPPER DECK]                    \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            .-------------.                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            |_________    |            \033[0;36mO\033[1;90m = SNAKE\n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            |         |   |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            |         |___|                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            |             |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            |           \033[0;36mO\033[1;90m |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                            '-------------'                                     \033[0m\n", 2);

            gameSystems.printWithDelay(
                "\n\033[0;90m                     [!] Signals blocked. Perform Recon to identify targets.\n\033[0m",
                4
            );
        gameSystems.pauseText(1000);

        solitonRadarBottomHeader();
        }

        // Version 2: The "Intel" Radar (Shows enemies)
        public static void displaySolitonRadarSCREENONE(boolean hasIntelTWO) {
    if (!hasIntelTWO) {
        displaySolitonRadarSCREENONE(); // Show blind radar
        return;
    }

    solitonRadarTopHeader();

    System.out.println("\033[1;36m"); 

            gameSystems.printWithDelay("\n                                                       \033[1;90m[ SOLITON RADAR SYSTEM : \033[0m\033[0;32mACTIVE\033[0m\033[1;90m ]\033[0m", 10);
    gameSystems.pauseText(1000);

    gameSystems.printWithDelay("\033[1;90m\n\n\033[0m", 2);

        gameSystems.printWithDelay("\033[1;90m                                            ^   [UPPER DECK]                    \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            .-------------.                                     \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            |__________ \033[0;31mX\033[1;90m |           \033[0;36mO\033[1;90m = SNAKE\n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            | \033[0;31mX\033[1;90m       |   |                                     \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            |         |___|           \033[0;31mX\033[1;90m = RUSSIAN SOLDIER        \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            |             |                                     \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            |           \033[0;36mO\033[1;90m |                                     \n\033[0m", 2);
        gameSystems.printWithDelay("\033[1;90m                            '-------------'                                     \033[0m\n", 2);

    gameSystems.printWithDelay(
        "\n\033[1;96m                     [!] Intel acquired. Targets identified.\n\033[0m",
        4
    );
    gameSystems.pauseText(300);

    solitonRadarBottomHeader();
}


    public static void solitonRadarTopHeader() {
        System.out.println("\n\033[1;90m==========================================================================================\033[0m");
        System.out.println("\033[1;90m [ SOLITON RADAR SYSTEM ]                        PWR STATUS: 86% | Signal: 82% | LAT 12ms\033[0m");
        System.out.println("\033[1;90m==========================================================================================\033[0m");
    }


public static void solitonRadarBottomHeader() {
    System.out.println("\n\033[1;90m==========================================================================================\033[0m");
    System.out.println("\033[1;90m Soliton Feed Stable                                              Press \033[0;32m[ENTER]\033[1;90m to return\033[0m");
    System.out.println("\033[1;90m==========================================================================================\033[0m");
    gameSystems.readInput();
    }


public static void displaySolitonRadarSCREENTWO() { 
    solitonRadarTopHeader();
            gameSystems.printWithDelay("\n                                                       \033[1;90m[ SOLITON RADAR SYSTEM : \033[0m\033[0;32mACTIVE\033[0m\033[1;90m ]\033[0m", 10);
            gameSystems.pauseText(1000);

            gameSystems.printWithDelay("\033[1;90m\n\n\033[0m", 2);

            gameSystems.printWithDelay("\033[1;90m                                      [DECK-A HALLWAY]                         \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    .----|---------.                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |           \033[0;36mO\033[1;90m = SNAKE\n\033[0m\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |  \033[0;36mO \033[1;90m|_________|                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |              |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    '--------------'                                     \033[0m\n", 2);

            gameSystems.printWithDelay(
                "\n\033[0;90m                [!] Signals weak. Interior bulkheads reduce scan clarity.\n\033[0m",
                4
            );
            gameSystems.pauseText(1000);

        solitonRadarBottomHeader();
        }

    public static void displaySolitonRadarSCREENTWO(boolean hasIntelTWO) {
        if (!hasIntelTWO) {
            displaySolitonRadarSCREENTWO(); // Show blind radar
            return;
        }
        
        solitonRadarTopHeader();
            gameSystems.printWithDelay("\n                                                       \033[1;90m[ SOLITON RADAR SYSTEM : \033[0m\033[0;32mACTIVE\033[0m\033[1;90m ]\033[0m", 10);
            gameSystems.pauseText(1000);

            gameSystems.printWithDelay("\033[1;90m\n\n\033[0m", 2);

            gameSystems.printWithDelay("\033[1;90m                                      [DECK-A HALLWAY]                         \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    .----|---------.                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |           \033[0;36mO\033[1;90m = SNAKE\n\033[0m\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |    |         |           \033[0;31mX\033[1;90m = RUSSIAN SOLDIER                                   \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |  \033[0;36mO \033[1;90m|_________|                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    |           \033[0;31mX\033[1;90m  |                                     \n\033[0m", 2);
            gameSystems.printWithDelay("\033[1;90m                    '--------------'                                     \033[0m\n", 2);

            gameSystems.printWithDelay(
                "\n\033[0;90m                     [!] Signals weak. Interior bulkheads reduce scan clarity.\n\033[0m",
                4
            );
        gameSystems.pauseText(1000);

        solitonRadarBottomHeader();
        }
}
