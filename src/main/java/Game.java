import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gameIntro(input);
        input.close();  // Close the scanner once all input operations are done
    }

    public static void gameIntro(Scanner input) { // runs the pre-game contents + difficulty selection
        gameSystems.clearConsole();
        gameSystems.printWithDelay("\n               Mike presents...", 0);
        // gameSystems.pauseText(1500);
        gameSystems.clearConsole(); // clear console function does NOT work in IntelliJ !!
        gameSystems.printWithDelay("\n     Metal Gear Solid 2: Sons of Liberty", 0);
        // gameSystems.pauseText(1500);
        System.out.println("\n     ------- THE TANKER INCIDENT -------");
        // gameSystems.pauseText(2000);
        gameSystems.printWithDelay(" (An interactive text-adventure experience!)\n", 0);
        // gameSystems.pauseText(1000);

        int choice = 0; 
        while (choice != 2) {
            System.out.println("\n          Select [1] to continue or [2] to exit");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                gameSystems.clearConsole();

                if (choice == 1) {
                    gameSystems.gameDifficulty(input);
                } else if (choice == 2) {
                    System.out.println("* exits terminal - functionality not finished *");
                }
            } else {
                System.out.println("Invalid input. Please enter [1] or [2].");
                input.next(); // clear the invalid input
            }
        }
    }

    // public static void gameMenu(Scanner input) { // runs the actual game with selectable menu options
    //     gameSystems.printWithDelay("\nSelect a game difficulty: \n", 0);
    //     gameSystems.gameDifficulty(input);
    // }
}
