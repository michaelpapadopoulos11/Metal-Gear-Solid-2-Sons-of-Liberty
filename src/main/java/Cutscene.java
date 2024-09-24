// // import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Cutscene {

    public static void runGame() {
    }

    public static void gameLoading() {
        gameSystems.clearConsole();
        gameSystems.printWithDelay("Loading 'Metal Gear Solid 2: Sons of Liberty", 25); // cosmetic loading lol
        gameSystems.printWithDelay("", 1000);
        gameSystems.printWithDelay("'...", 1000);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay(" Load complete!", 25);
        gameSystems.pauseText(2500);

        gameSystems.clearConsole();
        gameSystems.printWithDelay("'Metal Gear Solid 2: Sons of Liberty' will now start.", 25);
        gameSystems.pauseText(2000);
    }

    public static void hudsonRiverIntro() {
        gameSystems.clearConsole();
        gameSystems.pauseText(1500);
        System.out.print("Snake: ");
        gameSystems.printWithDelay("The Hudson River, ", 50);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("two years ago...", 50);
        gameSystems.pauseText(1500);

        gameSystems.clearConsole();
        System.out.print("Snake: ");
        gameSystems.printWithDelay("We had classified intelligence that a new type of Metal Gear was \n       scheduled for transport. ", 40);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The whole thing stank...", 40);
        gameSystems.pauseText(2000);

        gameSystems.printWithDelay("\n\n       ...but our noses have been out in the cold too long.", 40);
        gameSystems.pauseText(3000);
        gameSystems.clearConsole();
    }
}
