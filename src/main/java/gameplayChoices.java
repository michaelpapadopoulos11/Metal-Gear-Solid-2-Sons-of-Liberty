import java.util.Scanner;

public class gameplayChoices {

    static Player player = new Player();  // Create a player
    static Scanner scanner = new Scanner(System.in);

    public static void firstPlayerChoice() {
        gameSystems.clearConsole();

        // Display context in a stylized way
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m"); // Bold gray for top border
        System.out.println("\033[1;37m\nContext: \033[0;37mSnake is stealthily crouched at the rear end of the USS Discovery Tanker,");
        System.out.println("behind the ship's anchor connector points.\n" + "\033[0m");
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m");

        // inventory / health
        System.out.println("\033[32m0) Access Inventory\033[0m                               \033[1;32mLIFE (100%):\033[0;32m ██████████████████\033[0m");
        System.out.println("\033[1;30m" + "=================================================================================" + "\033[0m");

        System.out.println("\033[0;37m1) More Reconnaissance");
        System.out.println("2) Sneak Left"); // sneak left
        System.out.println("3) ..."); // sneak right
        System.out.println("4) ...\033[0m\n");

        System.out.println("5) CODEC OTACON");
        System.out.println("\033[1;30m" + "---------------------------------------------------------------------------------" + "\033[0m");

        // Choice prompt
        System.out.print("\033[1;37mChoice : \033[0m");
        int choice = Integer.parseInt(scanner.nextLine());  // Read the entire line as input

        switch (choice) {
            case 0:
                player.displayInventory();
                
                System.out.println("\nPress [ENTER] to return\n");
                scanner.nextLine();  // Correctly wait for user input
                firstPlayerChoice();
            break;

        case 1: // option : more recon
            gameSystems.clearConsole();
            gameSystems.printWithDelay("\n[Using his binoculars, Snake observes the ship's layout. On the lower left deck, a \nguard silently watches over the dark waters. Above, on the upper deck, another guard \nadmires the distant New York City skyline].\n", 50);

            gameSystems.pauseText(1500);

            System.out.println("\nPress [ENTER] to return\n");
            scanner.nextLine();  // Correctly wait for user input
            firstPlayerChoice();

        case 2: // option : go left
        gameSystems.clearConsole();
        gameSystems.printWithDelay("\n[Blending with the shadows and evading the bright sea lights, Snake makes his way to the \nleft railing of the ship.\n", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("\nAs Snake reaches the railing, he notices a guard nearby. The guard, seemingly distracted, \ngazes intermittently towards the sea, his attention fixed more on the rolling waves \nthan on his surroundings].", 50);
        gameSystems.pauseText(1500);
    
        System.out.println("\nPress [ENTER] to progress\n");
        scanner.nextLine();  // Correctly wait for user input
        // snakeHeadsLeft(); // new screen with multiple options ????

        case 3:
        case 4:
        case 5:
            default:
                System.out.println("Invalid choice. Please try again.");
                firstPlayerChoice();
        }
    }
}
