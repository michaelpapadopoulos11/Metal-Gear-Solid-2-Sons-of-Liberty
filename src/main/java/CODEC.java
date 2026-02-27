import java.util.Random;

public class CODEC {

                // this file is for all the codec call dialogue moments in the game

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
        System.out.println("\n\033[1;30m" + " ======================================================" + "\033[1;30m"); 
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
            codecCallSCREENONE_1();
            break;
        case 1:
            codecCallSCREENONE_2();
            break;
        case 2:
            codecCallSCREENONE_3();
            break;
        }
    }

    public static void codecCallSCREENONE_1() { // bird gluttony call
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
        gameSystems.printWithDelay("...\n", 400);
        gameSystems.pauseText(1000);    

        codecBottomBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
    }
    
    public static void codecCallSCREENONE_2() { // cows and UFOs
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("This is my favourite Chinese saying:\n\n", 40);
        gameSystems.pauseText(400);
        System.out.print("        ");
        gameSystems.printWithDelay("'Better to be first among roosters than last\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("among bulls.'\n\n", 40);
        gameSystems.pauseText(2000);
        System.out.print("         ");
        gameSystems.printWithDelay("Of course, the meaning is clear:\n         If you have to choose between being a chicken\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("or a cow, be the chicken.\n\n", 40);
        gameSystems.pauseText(1500);
        System.out.print("         ");
        gameSystems.printWithDelay("Cows are always being messed with by aliens -\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("cattle mutilations are up, you know. ", 40);
        gameSystems.pauseText(1500);
        gameSystems.printWithDelay("Why go \n         looking for trouble, right?\n\n", 40);
        gameSystems.pauseText(2000);

        System.out.print("         ");
        gameSystems.printWithDelay("If an enemy spots you, you'll be in \n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("more trouble than a cow on a UFO. You stay out\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("of their sights!\n", 40);
        gameSystems.pauseText(2000);

        codecBottomContinueBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Why would aliens be in an old Chinese proverb?\n\n", 40);
        gameSystems.pauseText(1500);    

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Everyone knows they've been visiting us for\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("thousands of years.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("...", 100);
        gameSystems.printWithDelay("news to me.\n", 40);
        gameSystems.pauseText(1500);    
        codecBottomBorder();

        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
    }
    
    public static void codecCallSCREENONE_3() { // mei ling
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("What happened to Mei Ling?\n\n", 40);
        gameSystems.pauseText(1500);   
        
        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Hee!", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" She got mad and went offline.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("What did you do?\n\n", 40);
        gameSystems.pauseText(1500);   

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Nothing!", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" Now don't we need to get back to\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("the mission?", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" So much to do, so little time", 40);
        gameSystems.printWithDelay("...\n", 400);
        gameSystems.pauseText(500);

        codecBottomBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
    }

    public static void otaconLockerRoomCODEC() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay("Snake, you're in the ship crews locker room.\n", 40);
        System.out.print("         ");
        gameSystems.printWithDelay("Maybe you can take a look through the lockers \n         and find some useful equipment?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Good call.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" Better to be prepared.\n", 40);
        gameSystems.pauseText(1500);

        codecBottomBorder();
        gameSystems.readInput();            
        gameSystems.clearConsole();
        CODEC.codecEnd();
    }

    public static void codecPornPoster() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " What do you think you're doing. Snake? You\n", 40);
        gameSystems.printWithDelay("         don't have enough to keep yourself busy?\n", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("\n         Try to remember the mission. If you can.\n", 40);
        gameSystems.pauseText(500);

        System.out.print("\n\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("...\n", 400);
        gameSystems.pauseText(1500);   

        codecBottomBorder();
        gameSystems.readInput();
        gameplayChoices.lockerRoomChoice();
    }

    public static void shipPath() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Snake, did you find out where that ship is \n         headed?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("I'm looking at it -- 35 degrees longitude, \n         latitude around 58.\n\n", 40);
        gameSystems.pauseText(1200);   

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " More than 500 miles off the coast of the \n         Bermudas, out in the middle of the Atlantic", 40);
        gameSystems.printWithDelay( "...\n\n", 0);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay( "         So the prototype is ready for solo testing -- \n         it's basically combat-worthy.", 40);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay( "\n\n         That area is outside the Fleet's operational \n         range, too.\n", 40);
        gameSystems.pauseText(1500);

        gameSystems.printWithDelay( "\n         It must be a standalone Marine Corps project \n         -- which means this prototype Metal Gear must \n         be designed for independent deployment, without \n         any Naval assistance...\n", 40);
        gameSystems.pauseText(1500);

        codecBottomContinueBorder();
        gameSystems.readInput();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Anyways, analysis can wait till later.\n\n", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( "         Snake, you need to go down to the holds and \n         locate the actual Metal...\n\n", 40);

        System.out.println("         [Creaking noises from the ship's hull]\n");
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("!?\n", 40);
        gameSystems.pauseText(2000);   

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
        Cutscene.preOlgaFightCutscene();
    }

    public static void olgaFightOne() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("These overhead lights are blinding me.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Then try shooting them out, Snake!\n\n", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( "         They'll reduce her visibility on you if you \n         leave them on. Without the lights, you'll\n         have the advantage in this storm.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
        Combat.enableLightShot();
    }

    public static void olgaFightTwo() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("She's tough.", 40);
        gameSystems.pauseText(400);
        gameSystems.printWithDelay(" Stronger than she looks.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " That's Olga Gurlukovich.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( " She was born in a \n         military camp.", 40);
        gameSystems.pauseText(500);

        gameSystems.printWithDelay( " To her, this isn't just a \n         mission", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( "-it's her life. Don't underestimate \n         her, Snake!\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
    }

    public static void olgaFightThree() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " She's hiding behind those crates!", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( " Wait for\n         her to reload, then strike!\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
    }
    public static void genericCombatTip() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        String[] tips = {
            "...",
            "Use CQC after the enemy misses, it leaves \n         them open.",
            "Don't forget to heal when your health drops \n         below 50%."
        };
        String tip = tips[new Random().nextInt(tips.length)];

        System.out.print("\033[0;32mOTACON:  \033[0m");
        gameSystems.printWithDelay(tip + "\n\n", 50);
        gameSystems.pauseText(1500);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
    }
    public static void postOlgaCall() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Snake.", 40);
        gameSystems.pauseText(400);
        gameSystems.printWithDelay( " I've ID'd the Russian Commander, it \n         appears to be Sergei Gurlukovich.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Gurlukovich..!", 40);
        gameSystems.pauseText(400);
        gameSystems.printWithDelay(" One of Ocelot's allies?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Yeah...", 40);
        gameSystems.pauseText(400);
        gameSystems.printWithDelay( " He's the one Ocelot was supposed to \n         meet up with after Shadow Moses.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("They're after Metal Gear...\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Everything's changed, this is not going to be \n         as simple as we thought.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("You could say that.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" I saw a surveillance \n         remote just now. It looked like Cypher\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " A marine Cypher-T?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("No, Army.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomContinueBorder();
        gameSystems.readInput();

        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " First the Marines, then the Russians -- now \n         the Army...?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("You're right, this isn't going to be simple.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
        Cutscene.preMetalGearRoomContext();
    }

    public static void preMetalGearRoomCODEC() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("I've made it to the Marine Corps speech.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Can you see Metal Gear?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("No,", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" I'll have to go around to the bow.\n\n", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("         They have some serious defenses here though...\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Let's go over this one more time.\n\n", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay( "         You need to use your camera to take photographic\n         evidence of the Metal Gear prototype. Now do \n         your thing and take pictures that speak louder \n         than the government's plausible denials.\n", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay( "\n         We need four shots: Metal Gear from the front, \n         front-right, front-left, and a close-up of the\n         Marine Corps logo.\n", 40);
        gameSystems.pauseText(1000);


        codecBottomContinueBorder();
        gameSystems.readInput();

        gameSystems.clearConsole();
        codecTopBorder();
        
        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " There's actually one more little thing...\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Just spit it out, I'm used to things going \n         wrong.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " It looks like someone is monitoring our \n         transmission.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Who?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " I don't have a clue. All they're doing is \n         watching", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay( " - it would creep me out less if they \n         tried to interfere with our communications.\n\n", 40);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Could it have something to do with that \n         Cypher we saw?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Maybe.", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay( " I've switched the encryption protocol \n         for our burst transmission for now.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomContinueBorder();
        gameSystems.readInput();

        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " What I want to do is use a different method \n         for sending those photos, just in case.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Instead of using a CODEC?\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Exactly, there's a workstation in the \n         southeast corner of the block where the Metal \n         Gear is likely located.\n\n", 40);
        gameSystems.pauseText(1000);

        gameSystems.printWithDelay("         It'll take me a bit of time but I can hack\n         into that terminal where I can then remote-\n         install a little app that I wrote.\n\n", 40);        
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("         From there, the image data will be encrypted \n         and can then be sent securely to me.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Sounds like a plan.\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
        gameplayChoices.choosePostPreMetalGearRole();
    }

    public static void snakeUploadingPics() {
        codecCalling();
        gameSystems.clearConsole();
        codecTopBorder();

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("I'm at that computer terminal now, ready to \n         upload those Metal Gear pics.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Great, the station should be all setup for \n         you to easily upload those files.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("\033[0;32m SNAKE:  \033[0m");
        gameSystems.printWithDelay("Ok, they're uploading now, how long will \n         this ta-\n\n", 40);

        System.out.print("\033[0;32mOTACON: \033[0m");
        gameSystems.printWithDelay( " Gottem now.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay( " Excellent work Snake! \n\n         Now get the hell out of there before \n         anyone spots you!\n", 40);
        gameSystems.pauseText(1000);

        codecBottomBorder();
        gameSystems.readInput();
        codecEnd();
        Cutscene.finalGameCutscene();
    }
}