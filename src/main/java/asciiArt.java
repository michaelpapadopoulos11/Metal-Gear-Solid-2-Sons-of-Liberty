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
        }
    // public static void posterOne() {} // lewd poster moment


    public static void displaySolitonRadar() { // screen 1 mini maps 
            System.out.println("\033[1;36m"); // Cyan color
            gameSystems.printWithDelay("                      [ SOLITON RADAR SYSTEM : ACTIVE ]", 10);
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("\n                                                       \n", 1);
            gameSystems.printWithDelay("                            ^   [UPPER DECK]           \n", 1);
            gameSystems.printWithDelay("                .-----|---------.                    \n", 1);
            gameSystems.printWithDelay("                |     |         |                    \n", 2);
            gameSystems.printWithDelay("                |     |         |                    \n", 2);
            gameSystems.printWithDelay("                |     |         |                    \n", 2);
            gameSystems.printWithDelay("                |  ^  '---------|                    \n", 2);
            gameSystems.printWithDelay("                | [SNAKE]       |                    \n", 2);
            gameSystems.printWithDelay("                '---------------'                    \n", 2);
            gameSystems.printWithDelay("\n\033[0;90m    [!] Signals blocked. Perform Recon to identify targets.\n\033[0m", 4);
            gameSystems.pauseText(1000);
        }

        // Version 2: The "Intel" Radar (Shows enemies)
        public static void displaySolitonRadar(boolean hasIntel) {
            if (!hasIntel) {
                displaySolitonRadar(); // If false, just show the blind one
                return;
            }

            System.out.println("\033[1;36m"); // Cyan color
            System.out.println("                      [ SOLITON RADAR SYSTEM : ACTIVE ]");
            System.out.println("                                                       ");
            System.out.println("                            ^   [UPPER DECK]           ");
            System.out.println("                .-------|---------.                    ");
            System.out.println("                |       |     (X) |  <-- Target 02     ");
            System.out.println("                |       |         |                    ");
            System.out.println("                |   (X) |         |  <-- Target 01     ");
            System.out.println("                |    ^  '---------|                    ");
            System.out.println("                |  [SNAKE]        |                    ");
            System.out.println("                '-----------------'                    ");
            System.out.println("\033[0m");
        }
}
