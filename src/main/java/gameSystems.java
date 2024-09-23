import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class gameSystems {
    public static void printWithDelay(String data, long delay) {
        for (char character : data.toCharArray()) {
            System.out.print(character); // prints a single character
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println();
    }

    public static void pauseText(long milliseconds) { // this method will simply pause the line of text so it can stay on screen for a certain amount of time
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Properly handles thread interruption
            System.out.println("Pause was interrupted");
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J"); // clears the terminal for better cutscenes
        System.out.flush();
    }

    public static void gameDifficulty(Scanner input) {
            ArrayList<String> gameDifficulty = new ArrayList<String>();
            gameDifficulty.add("Liquid Easy");
            gameDifficulty.add("Naked Normal");
            gameDifficulty.add("Solid Normal");
            gameDifficulty.add("Big Boss Hard");

        System.out.println("\nSelect a game difficulty: \n");
        for (int i = 0; i < gameDifficulty.size(); i++) {
            System.out.println((i + 1) + ") " + gameDifficulty.get(i));
        }

        int choice;
        do {
            System.out.println("\nSelect [1], [2], [3], or [4]:\n");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number. Please enter a number.");
                input.next(); // this is important!
            }
            choice = input.nextInt();
            if (choice >= 1 && choice <= 4) {
                runGame();
            } else {
                System.out.println("Please select one of the given numbers...");
            }
        } while (choice < 1 || choice > 4);
    }

    public static void runGame() {
        System.out.println("This is where Snake's adventure will start!");
    }
}