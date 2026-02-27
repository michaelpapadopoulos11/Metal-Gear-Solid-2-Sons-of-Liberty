// import java.io.IOException;
// import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private final Scanner input;

    public Game() {
        this.input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Game game = new Game();                     
        game.run();                                
        game.shutdown();                           
    }

    public void run() {
        gameIntro();                               
        gameSystems.gameDifficulty(input);

        Cutscene.runGame();
    }

    private void shutdown() {
        input.close();                             
        gameSystems.closeScanner();                
    }

    public void gameIntro() { 
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        String introText = "       Mike presents...";
        int padding = (80 - introText.length()) / 2; 
        String paddedIntro = String.format("%" + padding + "s%s", "", introText); 
        gameSystems.printWithDelay("\033[0;37m" + paddedIntro + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        String hideoGame = "A Hideo Kojima Original Game...";
        padding = (80 - hideoGame.length()) / 2;
        String paddedHideo = String.format("%" + padding + "s%s", "", hideoGame);
        gameSystems.printWithDelay("\033[0;37m" + paddedHideo + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        gameSystems.clearConsole();
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
    
        String mgsTitle = "Metal Gear Solid 2: Sons of Liberty";
        padding = (80 - mgsTitle.length()) / 2;
        String paddedTitle = String.format("%" + padding + "s%s", "", mgsTitle);
        gameSystems.printWithDelay("\033[1;36m" + paddedTitle + "\033[0m", 50);
        gameSystems.pauseText(1500);
    
        System.out.println("\033[1;32m\n                      ------- THE TANKER INCIDENT -------\033[0m");
        gameSystems.pauseText(2000);
    
        System.out.println("\033[32m\n\n\n\n\n\n\n                   Select [ENTER] to continue or [0] to exit\033[0m");
        System.out.println("\n" + "\033[1;30m" + "================================================================================\n" + "\033[0m");
        gameSystems.readInput();        
        gameSystems.clearConsole();
    }
}
