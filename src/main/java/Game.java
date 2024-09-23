import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        gameIntro();
//        gameSystems.gameDifficulty();
    }

    public static void gameIntro() { // runs the pre-game contents + difficulty selection
        gameSystems.printWithDelay("\n               Mike presents...", 50);
        gameSystems.pauseText(1500);
//        gameSystems.clearConsole(); // clear console not working
        System.out.print("\033c");
        gameSystems.printWithDelay("\n     Metal Gear Solid 2: Sons of Liberty", 50);
        gameSystems.pauseText(1500);
        System.out.println("\n     ------- THE TANKER INCIDENT -------");
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("( An interactive text-adventure experience ! )", 50);
        gameSystems.pauseText(1000);

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while(choice != 2) {
            System.out.println("\n          Select [1] to continue");
            choice = input.nextInt();

            if (choice == 1); {
                gameSystems.gameDifficulty();
            }
        }
    }

    public static void gameMenu() { // runs the actual game with selectable menu options
        gameSystems.printWithDelay("\nSelect a game difficulty: \n", 0);
        gameSystems.gameDifficulty();
        }

    // Need a difficulty selector (doesn't make a difference in gameplay) | Solid Normal, Big Boss Hard....
}
