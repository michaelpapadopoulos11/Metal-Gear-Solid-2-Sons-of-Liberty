// import java.io.IOException;
// import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // gameIntro(input); // game menu function
        // gameSystems.gameDifficulty(input);

        // // game contents:
        // Cutscene.gameLoading(); // fake intro

        // Cutscene.hudsonRiverIntro(); // testing the first cutscene
        // CODEC.otaconIntro();
        // Cutscene.hudsonRiverPostIntro();

        // CODEC.otaconImageID();
        // gameplayChoices.firstPlayerChoice();
        gameplayChoices.secondPlayerChoice();

        input.close();  // Close the scanner once all input operations are done
    }

    public static void gameIntro(Scanner input) { // runs the pre-game contents + difficulty selection
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        String introText = "       Mike presents...";
        int padding = (80 - introText.length()) / 2; // calculate padding
        String paddedIntro = String.format("%" + padding + "s%s", "", introText); // apply padding
        gameSystems.printWithDelay("\033[0;37m" + paddedIntro + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        // Print "A Hideo Kojima Original Game..." centered with delay
        String hideoGame = "A Hideo Kojima Original Game...";
        padding = (80 - hideoGame.length()) / 2;
        String paddedHideo = String.format("%" + padding + "s%s", "", hideoGame);
        gameSystems.printWithDelay("\033[0;37m" + paddedHideo + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        // Print "Metal Gear Solid 2: Sons of Liberty" centered with delay
        String mgsTitle = "Metal Gear Solid 2: Sons of Liberty";
        padding = (80 - mgsTitle.length()) / 2;
        String paddedTitle = String.format("%" + padding + "s%s", "", mgsTitle);
        gameSystems.printWithDelay("\033[1;36m" + paddedTitle + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        System.out.println("\033[1;32m\n                      ------- THE TANKER INCIDENT -------\033[0m");
        gameSystems.pauseText(2000);
    
        // Continue with the game or exit option
        System.out.println("\033[32m\n\n\n\n\n\n\n                   Select [ENTER] to continue or [0] to exit\033[0m");
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
        gameSystems.readInput();        
        gameSystems.clearConsole();
        }
    }
