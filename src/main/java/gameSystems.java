import java.io.IOException;
import java.util.ArrayList;

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

//    public static void clearConsole() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }

    public static void gameDifficulty() {
            ArrayList<String> gameDifficulty = new ArrayList<String>();
            gameDifficulty.add("Liquid Easy");
            gameDifficulty.add("Naked Normal");
            gameDifficulty.add("Solid Normal");
            gameDifficulty.add("Big Boss Hard");

            System.out.println("1) " + gameDifficulty.get(0));
            System.out.println("2) " + gameDifficulty.get(1));
            System.out.println("3) " + gameDifficulty.get(2));
            System.out.println("4) " + gameDifficulty.get(3));

            System.out.println("\n\nSelect a difficulty: ");
        }

        public static void main(String[] args) {
    //        printWithDelay("[You sneak past the guards and move deeper into the tanker]", 50); // Adjust the delay to control the speed of typing
    //        pauseText(1500);
    //        printWithDelay("CODEC: Snake!", 50);
            gameDifficulty();
        }
}
