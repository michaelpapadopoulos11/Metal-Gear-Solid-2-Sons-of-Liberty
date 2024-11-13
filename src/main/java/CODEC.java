
public class CODEC {

    // CODEC FREQUENCIES :
    // OTACON - 140.85

    public static void codecCalling() { // codec ringtone function  
        gameSystems.clearConsole();
        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              CODEC CONNECTION              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);

        System.out.println("   ┌────────────────────────────────────────────┐");
        System.out.println("   │                                            │");
        System.out.println("   │              CODEC CONNECTION              │");
        System.out.println("   │                                            │");
        System.out.println("   └────────────────────────────────────────────┘");
        gameSystems.pauseText(500);
        gameSystems.clearConsole();
        gameSystems.pauseText(500);
    
        gameSystems.clearConsole();
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                                                  │");
        System.out.println("│              CONNECTION ESTABLISHED              │");
        System.out.println("│                                                  │");
        System.out.println("└──────────────────────────────────────────────────┘");
        gameSystems.pauseText(1500);
    }

    public static void codecEnd() { // end call function for codec calls
        gameSystems.clearConsole();
        
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                                                  │");
        System.out.println("│              TERMINATING CONNECTION              │");
        System.out.println("│                                                  │");
        System.out.println("└──────────────────────────────────────────────────┘");
        gameSystems.pauseText(500); 
    
        gameSystems.clearConsole();
        gameSystems.pauseText(500);
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                                                  │");
        System.out.println("│              TERMINATING CONNECTION              │");
        System.out.println("│                                                  │");
        System.out.println("└──────────────────────────────────────────────────┘");
        gameSystems.pauseText(750); 
    
        gameSystems.clearConsole(); 
    }
    
    public static void otaconIntro() {
        codecCalling();
        gameSystems.clearConsole();

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("This is Snake, do you read me Otacon?\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Loud and clear, Snake.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Kept you waiting, huh?\n", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("        I'm at the 'sneak point.'\n\n", 40);
        gameSystems.pauseText(2000);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Everything going okay?\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("The stealth camos busted. Landing impact.\n\n", 40);
        gameSystems.pauseText(2000);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("We must have overused it. Sorry, but you're gonna\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("have to deal with it.\n\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("You're not in the military anymore.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Right, I didn't plan on relying on this gadget anyway.\n\n", 40);
        gameSystems.pauseText(2000);

    gameSystems.clearConsole();
    System.out.print("OTACON: ");
        gameSystems.printWithDelay("The private sector's not too bad is it?\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("Privacy guarenteed...\n\n", 40);
        gameSystems.pauseText(1500);
    
    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("I'm happy as long as no one gives me any more\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("unwanted gifts.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("You mean that thing with Naomi?\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("And I can't say I miss that chattering nanny.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Mei Ling's not so bad. That reminds me,\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("I have to get in touch with her again about\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("that new Natik flashware.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Diverting toys from the SSCEN (U.S Army\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("Soldier System Center) again? Give her a\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("message from me: \n\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("Someone will find out sooner or later. She's\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("better off assuming it's sooner and quit while\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("she's safe.\n\n", 40);
        gameSystems.pauseText(1500);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Too true. Okay Snake, let's get to work.\n\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("You know how the technical specs of Metal Gear\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("were sold on the black market after Shadow Moses?'\n\n", 40);
        gameSystems.pauseText(2000);

        gameSystems.clearConsole();
    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("All Ocelot's doing...\n\n", 40);
        gameSystems.pauseText(1000);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Exactly.", 40);
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay(" And now every state, group and dotcom\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("has its own version of Metal Gear.\n\n", 40);
        gameSystems.pauseText(500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Not Exactly a classified weapon for today's nuclear\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("powers.\n\n", 40);
        gameSystems.pauseText(500);

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("This new one seems to have been designed to wipe\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("the floor with all the other models.\n\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(1000);
        gameSystems.printWithDelay("The only consistent description is that it's an \n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("amphibious, anti Metal Gear vehicle...\n\n", 40);
        gameSystems.pauseText(500);

    System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("That explains why this one is under Marine Corp\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("jurisdiction.", 40);
        gameSystems.pauseText(4000);
        gameSystems.clearConsole(); 

    System.out.print("OTACON: ");
        gameSystems.printWithDelay("Snake, your mission objectives are to make visual\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("confirmation with the new Metal Gear being transported\n", 40);
        System.out.print("        ");
        gameSystems.pauseText(2000);
        gameSystems.printWithDelay("by that Tanker and bring back photographic evidence.\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("But I want you first to go up to the top level of the\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("infrastructure, to the bridge.\n\n", 40);
        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay("We need to find out where the Tanker is headed.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("A little reconnaissance huh?\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("OTACON: ");
        gameSystems.printWithDelay("There's too much we don't know about this new prototype:\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("capabilities, deployment method, we don't even know how\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("close it is to completion...\n\n", 40);
        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay("If we know where the testing arena is, I can start to draw\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("some reasonable conclusions.\n\n", 40);
        gameSystems.pauseText(1500);

        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Alright, I'll head to the bridge ASAP.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("OTACON: ");
        gameSystems.printWithDelay("Try to avoid confrontations, our goal is to collect evidence\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("on Metal Gear development and expose it to the world.\n\n", 40);
        gameSystems.pauseText(500);
        System.out.print("        ");
        gameSystems.printWithDelay("It would be best if you could get out of there without\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("alerting anyone.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Don't worry, I know the drill.", 40);
        gameSystems.pauseText(250);
        gameSystems.printWithDelay(" We're not Terrorists.\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("OTACON: ");
        gameSystems.printWithDelay("Very good. ", 40);
        gameSystems.pauseText(200);
        gameSystems.printWithDelay("Don't you forget that you're a part of.\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("Philanthropy now, an anti-Metal Gear Organisation and \n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("officially recognized by the UN.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Recognized, but still fringe Otacon.", 40);
        gameSystems.pauseText(5000);
        codecEnd();
    }

    public static void otaconImageID() {
        CODEC.codecCalling();

        gameSystems.clearConsole();
        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("I've transmitted the photo, let's get an ID on\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("him ASAP.\n\n", 40);
        gameSystems.pauseText(1000);

        System.out.print("OTACON: ");
        gameSystems.printWithDelay("I'm on it!\n\n", 40);
        gameSystems.pauseText(1500);
        
        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("Looks like the tanker's theirs now.", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay(" We need to \n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("get a fix on who they are.\n\n", 40);

        System.out.print("OTACON: ");
        gameSystems.printWithDelay("Look, Snake, all we need is the photographic\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("evidence of Metal Gear.\n\n", 40);
        gameSystems.pauseText(2000);

        System.out.print("        ");
        gameSystems.printWithDelay("As long as we have those, we can put it online\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("and blow the whole thing wide open. ", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("So no\n", 40);
        System.out.print("        ");
        gameSystems.printWithDelay("pyrotechnics, okay?\n\n", 40);
        gameSystems.pauseText(500);

        System.out.print("SNAKE:  ");
        gameSystems.printWithDelay("All right. ", 40);
        gameSystems.pauseText(500);
        gameSystems.printWithDelay("I'll do my best.\n", 40);
        gameSystems.pauseText(3000);

        CODEC.codecEnd();
    }


    // need an RNG codec function where the player can randomly call otacon and have a bunch of different call options.
}