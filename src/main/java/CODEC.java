import java.util.Random;

public class CODEC {

    // CODEC FREQUENCIES :
    // OTACON - 140.85

    public static void codecCalling() { // codec ringtone function  
        gameSystems.clearConsole();
        System.out.println("\n");
        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              CODEC CONNECTION              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);

        System.out.println("\n");
        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              CODEC CONNECTION              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);
    
        gameSystems.clearConsole();
        System.out.println("\n");
        System.out.println("\033[0;32m┌──────────────────────────────────────────────────┐\033[0m");
        System.out.println("\033[0;32m│                                                  │\033[0m");
        System.out.println("\033[0;32m│              CONNECTION ESTABLISHED              │\033[0m");
        System.out.println("\033[0;32m│                                                  │\033[0m");
        System.out.println("\033[0;32m└──────────────────────────────────────────────────┘\033[0m");
        gameSystems.pauseText(1500);
    }

    public static void codecEnd() { // end call function for codec calls
        gameSystems.clearConsole();
        gameSystems.pauseText(500);
        System.out.println("\n");
        System.out.println("\033[0;31m┌──────────────────────────────────────────────────┐\033[0m");
        System.out.println("\033[0;31m│                                                  │\033[0m");
        System.out.println("\033[0;31m│               CONNECTION TERMINATED              │\033[0m");
        System.out.println("\033[0;31m│                                                  │\033[0m");
        System.out.println("\033[0;31m└──────────────────────────────────────────────────┘\033[0m");
        gameSystems.pauseText(1000); 
        gameSystems.clearConsole(); 
    }

    public static void codecTopBorder() {
        System.out.println("\033[1;30m" + " ======================================================" + "\033[1;30m"); 
        System.out.println("\033[1;30m" + "  CODEC  |                |  FREQ: 140.85  |  < TUNE > \033[1;30m");
        System.out.println("\033[1;30m" + " ======================================================" + "\033[1;30m\n");
            }

    public static void codecBottomContinueBorder() {
        System.out.println("\n\033[1;30m" + " ======================================================" + "\033[1;30m"); 
        System.out.println("\033[1;30m" +   "  PTT: ON  |                 |  CONTINUE CALL: [ENTER]  " + "\033[1;30m");
        System.out.println("\033[1;30m" +   " ======================================================" + "\033[1;30m\n");
    }

    public static void codecBottomBorder() {
        System.out.println("\n\033[1;30m" + " ======================================================" + "\033[1;30m"); 
        System.out.println("\033[1;30m" +   "  PTT: ON  |                      |  END CALL: [ENTER]  " + "\033[1;30m");
        System.out.println("\033[1;30m" +   " ======================================================" + "\033[1;30m\n");
    }               
        
    public static void otaconIntro() {
        codecCalling();
        gameSystems.clearConsole();

        codecTopBorder();
        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("This is Snake, do you read me Otacon?\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Loud and clear, Snake.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Kept you waiting, huh?\n", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("         I'm at the 'sneak point'.\n\n", 40);
        gameSystems.pauseText(2000);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Everything going okay?\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("The stealth camos busted. Landing impact.\n\n", 40);
        gameSystems.pauseText(2000);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("We must have overused it. Sorry, but you're \n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" gonna have to deal with it.\n\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" You're not in the military anymore.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Right, I didn't plan on relying on this gadget\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" anyway.\n", 40);

        gameSystems.pauseText(1000);

        codecBottomContinueBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();

        codecTopBorder();
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("The private sector's not too bad is it?\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Privacy guarenteed...\n\n", 40);
        gameSystems.pauseText(1500);
    
        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("I'm happy as long as no one gives me any more\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" unwanted gifts.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("You mean that thing with Naomi?\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("And I can't say I miss that chattering nanny.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Mei Ling's not so bad. That reminds me,\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" I have to get in touch with her again about\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" that new Natik flashware.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE: \033[0m");
        gameSystems.printWithDelay(" Diverting toys from the SSCEN (U.S Army\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Soldier System Center) again? Give her a\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" message from me: \n\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Someone will find out sooner or later. She's\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" better off assuming it's sooner and quit\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" while she's safe.\n", 40);
        gameSystems.pauseText(1500);

        codecBottomContinueBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();

        codecTopBorder();
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Too true. Okay Snake, let's get to work.\n\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" You know how the technical specs of Metal Gear\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" were sold on the black market after Shadow\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Moses?'\n\n", 40);

        System.out.print("\033[0;32m SNAKE: \033[0m");
        gameSystems.printWithDelay(" All Ocelot's doing...\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Exactly.", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" And now every state, group and\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" dotcom has its own version of Metal Gear.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Not Exactly a classified weapon for today's\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" nuclear powers.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("This new one seems to have been designed to\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" wipe the floor with all the other models.\n\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" The only consistent description is that it's \n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" an amphibious, anti Metal Gear vehicle...\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("That explains why this one is under Marine\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Corp jurisdiction.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomContinueBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole(); 

        codecTopBorder();
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Snake, your mission objectives are to make\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" visual confirmation with the new Metal Gear\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay(" being transported by that Tanker and bring\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" back photographic evidence. But I want you\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" first to go up to the top level of the\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" infrastructure, to the bridge.\n\n", 40);

        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay(" We need to find out where the Tanker is\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" headed.\n\n", 40);

        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("A little reconnaissance huh?\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("There's too much we don't know about this\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" new prototype: capabilities, deployment\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" method, we don't even know how close it\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" is to completion...\n\n", 40);

        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay(" If we know where the testing arena is, I\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" can start to draw some reasonable\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" conclusions.\n\n", 40);

        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Alright, I'll head to the bridge ASAP.\n", 40);
        gameSystems.pauseText(500);
        codecBottomContinueBorder();
        gameSystems.readInput();  

        gameSystems.clearConsole();          
        codecTopBorder();

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Try to avoid confrontations, our goal is to\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" collect evidence on Metal Gear development\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" and expose it to the world.\n\n", 40);
        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay(" It would be best if you could get out of\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" there without alerting anyone.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Don't worry, I know the drill.", 40);
        gameSystems.pauseText(250);
        gameSystems.printWithDelay(" We're not\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Terrorists\n\n", 40);

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Very good. ", 40);
        gameSystems.pauseText(200);
        gameSystems.printWithDelay("Don't you forget that you're a\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" part of Philanthropy now, an ani-\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" Metal Gear Organisation and officially\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay(" recognized by the UN.\n\n", 40);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Recognized, but still fringe Otacon.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();            
        codecEnd();
    }

    public static void otaconImageID() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("I've transmitted the photo, let's get an ID on\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("him ASAP.\n\n", 40);
        gameSystems.pauseText(1000);
    
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("I'm on it!\n\n", 40);
        gameSystems.pauseText(1500);
        
        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Looks like the tanker's theirs now.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" We need to \n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("get a fix on who they are.\n\n", 40);
        gameSystems.pauseText(2000);
    
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Look, Snake, all we need is the photographic\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("evidence of Metal Gear.\n\n", 40);
        gameSystems.pauseText(2000);
    
        System.out.print("         ");
        gameSystems.printWithDelay("As long as we have those, we can put it online\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("and blow the whole thing wide open. ", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("So no\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("pyrotechnics, okay?\n\n", 40);
        gameSystems.pauseText(500);
    
        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("All right. ", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("I'll do my best.\n", 40);
        gameSystems.pauseText(1000);
        
        codecBottomBorder();

        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
    }
    
    // public static void otaconRNG() {}
    // chinese proverb lines .......
    // need an RNG codec function where the player can randomly call otacon and have a bunch of different call options.
    public static void callOtaconSCREENONE() {
    Random rand = new Random();
    int choice = rand.nextInt(3); 

    switch (choice) {
        case 0:
            codecCall_1();
            break;
        case 1:
            codecCall_2();
            break;
        case 2:
            codecCall_3();
            break;
    }
}

    public static void codecCall_1() { // bird gluttony call
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Okay...\n", 40);
        gameSystems.pauseText(400);
        System.out.print("         ");
        gameSystems.printWithDelay("There's a saying that goes-\n\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("'Even a bird on high dies a glutton's \n         death, as do the fish of The Deeps.'\n\n", 40);
        gameSystems.pauseText(1500);
        System.out.print("         ");
        gameSystems.printWithDelay("The lesson is --er,", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" don't be greedy.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("...Okay, if you say so.\n\n", 40);
        gameSystems.pauseText(1500);    

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("I do Snake.", 40);
        gameSystems.pauseText(600);
        gameSystems.printWithDelay(" don't take on unnecessary\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("risks just because you're greedy for more\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("items\n\n", 40);
        gameSystems.pauseText(1500);
        System.out.print("         ");
        gameSystems.printWithDelay("Remember the Deep family's fish.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("...\n", 20);
        gameSystems.pauseText(1000);    

        codecBottomBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
        gameplayChoices.firstPlayerChoice();
    }
    
    public static void codecCall_2() {
        System.out.println("option 2");

        gameSystems.readInput();            
        gameplayChoices.firstPlayerChoice();

    }
    
    public static void codecCall_3() {
        System.out.println("option 3");

        gameSystems.readInput();            
        gameplayChoices.firstPlayerChoice();

    }
}