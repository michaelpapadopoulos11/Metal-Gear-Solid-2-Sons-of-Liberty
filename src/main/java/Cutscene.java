// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Cutscene {

    public static void runGame() {
    }

    public static void gameLoading() {
        // cosmetic loading lol
        gameSystems.clearConsole();
        gameSystems.printWithDelay("\nLoading 'Metal Gear Solid 2: Sons of Liberty", 25); 
        gameSystems.printWithDelay("", 1000);
        gameSystems.printWithDelay("'...", 1000);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay(" Load complete!", 25);
        gameSystems.pauseText(2500);

        gameSystems.clearConsole();
        gameSystems.printWithDelay("\n'Metal Gear Solid 2: Sons of Liberty' will now start.", 25);
        gameSystems.pauseText(2000);
    }

    public static void topHeader() {
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("" + "\033[1;30m" + "                                        Metal Gear Solid 2: The Tanker Incident" + "\033[0m");
        // System.out.println("" + "\033[1;30m" + "                     Metal Gear Solid 2: The Tanker Incident"                 + "\033[0m");
        // System.out.println("" + "\033[1;30m" + " Metal Gear Solid 2: The Tanker Incident" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
    }

    public static void combatTopHeader() {
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("" + "\033[1;30m" + "[COMBAT VIEWER]                          Metal Gear Solid 2: The Tanker Incident" + "\033[0m");
        System.out.println("\033[1;30m" + "================================================================================" + "\033[0m");
    }

    public static void bottomHeader() {
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\033[1;30m" + "\n         " +"Select [ENTER] to continue." + "\033[1;30m");
        gameSystems.readInput();            
    }

    public static void hudsonRiverIntro() {
        String indent = "\n         ";

        // // first game cutscene !!!
            gameSystems.clearConsole();
            topHeader();

            gameSystems.pauseText(1500);
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay("'The Hudson River, ", 50);
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("two years ago...", 50);
            gameSystems.pauseText(1500);
    
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay("We had classified intelligence that a new type of Metal Gear was", 40);
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay("scheduled for transport. ", 40);
            gameSystems.pauseText(1500);
            gameSystems.printWithDelay("The whole thing stank...", 40);
            gameSystems.pauseText(2000);
    
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.printWithDelay("...but our noses have been out in the cold too long.'\n", 40);
            gameSystems.pauseText(1500);
            bottomHeader();
            gameSystems.printWithDelay(indent, 0);  
            gameSystems.clearConsole();
    
        
        // describing the setting -- add text delay to 50 for all text in this section
        topHeader();
        gameSystems.printWithDelay("\nSetting: ",50);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("A stormy night. ", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("The relentless rain pelts the dark, rough waters of the", 40);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("Hudson River. ", 40);
        gameSystems.pauseText(1500);
    
        gameSystems.printWithDelay("Thunder rumbles ominously, echoing through the expanse. ", 50);
        gameSystems.pauseText(3000);

        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("The George Washington Bridge looms in the background, ", 50);
        gameSystems.printWithDelay("its lights flick-", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("ering and barely cutting through the heavy fog. ", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay(indent, 0);  

        gameSystems.printWithDelay("A hooded figure emerges, ", 50);
        gameSystems.printWithDelay("the glow of a cigarette briefly illuminating a", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("determined face under the hood.", 50);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay(" The hooded figure quickens the pace,", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("breaking into a jog.", 50);
        gameSystems.pauseText(800);
        gameSystems.printWithDelay(" The jog turns into a sprint. Suddenly, the figure", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("flickers and becomes invisible, only footsteps can be heard as he", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("sprints through the rain. ", 50);
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("The poncho flaps wildly in the wind, betraying", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("the figure's swift, ghost-like movements.", 50);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("With a sudden burst of speed, the figure leaps, bungee cord attached, ", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("plunging towards the Hudson River. Below, the dark silhouette of a", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("large cargo freighter comes into view, it's the 'USS Discovery' Tanker.", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.pauseText(2000);

        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("Mid-air, the figure skillfully executes a flip, gracefully adjusting", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("their trajectory onto the rear section of the ship.", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.pauseText(1000);
        bottomHeader();

        gameSystems.clearConsole();
        topHeader();
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("As the figure lands, the stealth camo starts zapping...", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.pauseText(1000);

        gameSystems.printWithDelay("Its technology is beginning to break down, flickering in and out of", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("visibility, until the camo completely breaks.", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay("Amidst the howling winds and the pouring rain, the figure rises from a", 50);
        gameSystems.printWithDelay(indent, 0);  
        gameSystems.printWithDelay("kneel, revealing himself as Solid Snake.", 50);
        gameSystems.pauseText(2000);
        System.out.println("\033[0;34m\n\n                              'The Hero of Shadow Moses'\033[0m");
        gameSystems.pauseText(2500);
        bottomHeader();


        // NEED TO ADD THE OTACON: "HE'LL KNOW SOON ENOUGH" PART

        // gameSystems.printWithDelay(indent, 0);  
        // System.out.println("Press [ENTER] to continue.");
        // new Scanner(System.in).nextLine();
    }

    public static void hudsonRiverPostIntro() {
        gameSystems.clearConsole();
    
        topHeader();
        gameSystems.printWithDelay("\nContext: ", 50);
        gameSystems.pauseText(1500);
    
        String indent = "         ";
    
        gameSystems.printWithDelay("Suddenly, the quiet night erupts into chaos. Without warning, armed\n", 40);
        gameSystems.printWithDelay(indent + "figures storm the USS Discovery. Under the cover of darkness and \n", 40);
        gameSystems.printWithDelay(indent + "driving rain, they assert control with disturbing precision. Armed\n", 40);
        gameSystems.printWithDelay(indent + "with rifles but relying on knives to maintain silence, they quickly\n", 40);
        gameSystems.printWithDelay(indent + "neutralize the ship's guards. Their methodical and disciplined move-\n", 40);
        gameSystems.printWithDelay(indent + "ments suggest military training. Snake overhears their commands sho-\n", 40);
        gameSystems.printWithDelay(indent + "uted in Russian, confirming their identity.\n\n", 40);
        gameSystems.pauseText(3000);
    
        gameSystems.printWithDelay(indent + "Among the shadows, a particular figure stands out, issuing orders.\n", 40);
        gameSystems.printWithDelay(indent + "Snake suspects this man could be the groups leader, judging by his\n", 40);
        gameSystems.printWithDelay(indent + "firm command over the men.\n\n", 40);
        
        // Simulating the capture of the photo
        gameSystems.printWithDelay("        [Snake captures an image of the unknown Russian leader].\n", 40);
        gameSystems.pauseText(1000);
    
        System.out.println("\n" + "\033[1;30m" + "================================================================================" + "\033[0m");
        System.out.println("\n" + "\033[0;32m" + indent + "Press [ENTER] to transmit the image to Otacon.\033[0m");
        gameSystems.readInput();        
    
        // image upload art
        gameSystems.clearConsole();
        topHeader();
        gameSystems.printWithDelay("\n" + indent + "Initiating secure upload protocol...\n", 30);
        System.out.print(indent);
        for (int i = 0; i < 10; i++) {
        System.out.print("█");
        gameSystems.pauseText(500);
        }
    
        System.out.println("\033[1;30m\n" + indent + "Data encryption: 256-bit AES...\033[0m");
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("\033[1;30m" + indent + "Establishing VPN connection...\n\033[0m", 5);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("\033[1;30m" + indent + "Uploading via satellite link...\n\n\033[0m", 10);
        gameSystems.pauseText(1000);
        System.out.println("\033[0;32m" + indent + "Upload successful. Data packet secured.\n\033[0m");
        gameSystems.pauseText(2000);
        }

        public static void lockerRoom() {
        gameSystems.clearConsole();
        Cutscene.topHeader();
            gameSystems.printWithDelay("\n  Snake slips through the open door and finds himself in the Tanker's Crew-A \n  locker room.\n", 30);
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("\n  [In front on Snake are four ship crew member lockers]\n", 30);
            gameSystems.pauseText(1000);
            gameSystems.printWithDelay("\n  [A faint blend of oil, metal, and damp fabric settles over the room]\n", 30);
            gameSystems.pauseText(1000);
        gameplayChoices.lockerRoomChoice();
        Cutscene.bottomHeader();
        }

    }
