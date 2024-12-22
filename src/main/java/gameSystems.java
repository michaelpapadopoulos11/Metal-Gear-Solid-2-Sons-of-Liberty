// import java.io.IOException;
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

    private static final Scanner SCANNER = new Scanner(System.in);
        public static String readInput() {
        return SCANNER.nextLine();
    }

    // Method to close the scanner when the application is closing
    public static void closeScanner() {
        SCANNER.close();
    }

    public static void gameDifficulty(Scanner input) {
        ArrayList<String> gameDifficulty = new ArrayList<String>();
        
        gameDifficulty.add("Liquid Easy");
        gameDifficulty.add("Naked Normal");
        gameDifficulty.add("Solid Normal");
        gameDifficulty.add("Big Boss Hard");
    
        // Clear the console and set up the header
        clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;32m\n                             Select a game difficulty: \033[0m\n");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m" + "\n");

        System.out.println(" [1] " + gameDifficulty.get((0)) + "\n");
        System.out.println(" [2] " + gameDifficulty.get((1)) + "\n");
        System.out.println(" [3] " + gameDifficulty.get((2)) + "\n");
        System.out.println("\033[0;31m [4] " + gameDifficulty.get(3) + "\033[0m\n");
        
        int choice;

        do {
            System.out.println("\033[1;30m" + "---------------------------------------------------------------------------------" + "\033[0m");
            System.out.print("\n\033[32mSelect [1], [2], [3] or [4]: \033[0m");
            while (!input.hasNextInt()) {
                clearConsole();
                System.out.println("\033[1;31mThat's not a number. Please enter [1], [2], [3], or [4]: \033[0m");
                input.next(); // Clear incorrect input
            }
            choice = input.nextInt();
            input.nextLine(); // Consume the newline after the number
            if (choice >= 1 && choice <= 4) {
                Cutscene.runGame();
            } else {
                clearConsole();
                System.out.println("\033[1;31mPlease select one of the difficulty options...\033[0m");
            }
        } while (choice < 1 || choice > 4);
    }
}