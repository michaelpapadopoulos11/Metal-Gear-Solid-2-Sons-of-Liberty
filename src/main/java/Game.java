// import java.io.IOException;
// import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        gameIntro(input); // game menu function
    
        // game contents:
        Cutscene.gameLoading(); // fake intro

        Cutscene.hudsonRiverIntro(); // testing the first cutscene

        input.close();  // Close the scanner once all input operations are done
    }

    public static void gameIntro(Scanner input) { // runs the pre-game contents + difficulty selection
        gameSystems.clearConsole();
        gameSystems.printWithDelay("\n               Mike presents...", 50);
        gameSystems.pauseText(1500);

        gameSystems.clearConsole();
        gameSystems.printWithDelay("\n        A Hideo Kojima Original Game...", 50);
        gameSystems.pauseText(1500);


        gameSystems.clearConsole(); // clear console function does NOT work in IntelliJ !!
        gameSystems.printWithDelay("\n     Metal Gear Solid 2: Sons of Liberty", 50);
        gameSystems.pauseText(1500);
        System.out.println("\n     ------- THE TANKER INCIDENT -------");
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("\n (An interactive text-adventure experience!)\n", 60);
        gameSystems.pauseText(1000);

        int choice = 0; 

        System.out.println("\n    Select [1] to continue or [2] to exit\n");
        String userInput = input.nextLine(); // reads user input
        gameSystems.clearConsole();

    try {
        choice = Integer.parseInt(userInput);
        if (choice == 1) {
            gameSystems.gameDifficulty(input);
        } else if (choice == 2) {
                System.out.println("* exits terminal - functionality not finished *");
        } else {
                System.out.println("must select either [1] or [2]");
                input.next();
            }
        } catch (NumberFormatException e) {
            System.out.println("invalid number, please enter [1] or [2]");
        }
    }
}
