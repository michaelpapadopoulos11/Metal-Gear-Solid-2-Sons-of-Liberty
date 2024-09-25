// // import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Cutscene {

    public static void runGame() {
    }

    public static void gameLoading() {
        // cosmetic loading lol
        gameSystems.clearConsole();
        gameSystems.printWithDelay("Loading 'Metal Gear Solid 2: Sons of Liberty", 25); 
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
        // // // first game cutscene !!!
        gameSystems.clearConsole();
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("'The Hudson River, ", 50);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("two years ago...", 50);
        gameSystems.pauseText(1500);

        gameSystems.clearConsole();
        gameSystems.printWithDelay("We had classified intelligence that a new type of Metal Gear was \nscheduled for transport. ", 40);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The whole thing stank...", 40);
        gameSystems.pauseText(2000);

        gameSystems.printWithDelay("\n\n...but our noses have been out in the cold too long.'", 40);
        gameSystems.pauseText(3000);
        gameSystems.clearConsole();

        // describing the setting
        gameSystems.clearConsole();
        gameSystems.printWithDelay("\nSetting: ", 50);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("A stormy night. ", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The relentless rain pelts the dark, rough waters of the Hudson River. ", 50);
        gameSystems.pauseText(1500);
        System.out.print("\n         ");
        gameSystems.printWithDelay("Thunder rumbles ominously, echoing through the expanse. ", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The George Washington Bridge \n", 50);
        System.out.print("         ");
        gameSystems.printWithDelay("looms in the background, ", 50);
        gameSystems.printWithDelay("its lights flickering and barely ", 50);
        gameSystems.printWithDelay("cutting through the heavy fog. ", 50);
        gameSystems.pauseText(1500);
        System.out.print("\n         ");
        gameSystems.printWithDelay("A hooded figure emerges, ", 50);
        gameSystems.printWithDelay("the glow of a cigarette briefly illuminating a determined face ", 50);
        System.out.print("\n         ");
        gameSystems.printWithDelay("under the hood.", 50);
        gameSystems.pauseText(4000);
        gameSystems.clearConsole();

        gameSystems.printWithDelay("\nThe hooded figure quickens the pace, breaking into a jog. ", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The jog turns into a sprint. \n\n", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("Suddenly, the figure flickers and becomes invisible, ", 50);
        gameSystems.printWithDelay("Only footsteps can be heard as he \n", 50);
        gameSystems.printWithDelay("sprints through the rain. ", 50);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("The poncho flaps wildly in the wind, ", 50);
        gameSystems.printWithDelay("betraying the figure's swift, \nghost-like movements. ", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("\n\nWith a sudden burst of speed, the figure leaps, ", 50);
        gameSystems.printWithDelay("bungee cord attached, plunging towards the \nHudson River. \n\n", 50);
        gameSystems.pauseText(2500);

        gameSystems.printWithDelay("Below, the dark silhouette of a large cargo freighter comes into view, it's the 'USS Discovery' \nTanker. \n", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("\nMid-air, the figure skillfully executes a flip, ", 50);
        gameSystems.printWithDelay("gracefully adjusting their trajectory onto the\nrear section of the ship. ", 50);
        gameSystems.pauseText(4000);
        gameSystems.clearConsole();

        gameSystems.printWithDelay("As the figure lands, the stealth camo starts zapping...\n\n", 50);
        gameSystems.pauseText(1000);

        gameSystems.printWithDelay("Its technology is beginning to break down, flickering in and out of visibility, \n", 50);
        gameSystems.printWithDelay("until the camo completely breaks.\n\n", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("Amidst the howling winds and pouring rain, the figure rises from a kneel, \n", 50);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("revealing himself as Solid Snake.", 50);
        gameSystems.pauseText(2000);
        System.out.println("\n\n                         'The Hero of Shadow Moses'");
        gameSystems.pauseText(4500);

        gameSystems.clearConsole();
        gameSystems.printWithDelay("The mission begins...", 0);
        gameSystems.pauseText(3000);
        gameSystems.clearConsole();
    }
}