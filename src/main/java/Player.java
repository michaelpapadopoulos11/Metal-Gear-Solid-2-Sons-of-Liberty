import java.util.ArrayList;

public class Player {

    private int snakeHealth = 100;
    // private int tranqDmg; // dmg based on snakes m9 tranquilizer gun (% chance for a shot to knock out an enemy or not)
    // private int cqcDmg;

    private ArrayList<String> snakeInventory = new ArrayList<>();

    public Player() {
        initializeInventory();  // inventory needs to be initialized once - otherwise the inventory will get duplicated everytime you check it
    }

    // player health bar indication
    public void checkSnakeHealthBar() {
        if (snakeHealth >= 90 && snakeHealth <= 100) {
            System.out.println(snakeHealth + "% [██████████]");
        } else if (snakeHealth >= 80 && snakeHealth <= 89) {
            System.out.println(snakeHealth + "% [█████████ ]");
        } else if (snakeHealth >= 70 && snakeHealth <= 79) {
            System.out.println(snakeHealth + "% [████████  ]");
        } else if (snakeHealth >= 60 && snakeHealth <= 69) {
            System.out.println(snakeHealth + "% [███████   ]");
        } else if (snakeHealth >= 50 && snakeHealth <= 59) {
            System.out.println(snakeHealth + "% [██████    ]");
        } else if (snakeHealth >= 40 && snakeHealth <= 49) {
            System.out.println(snakeHealth + "% [█████     ]");
        } else if (snakeHealth >= 30 && snakeHealth <= 39) {
            System.out.println(snakeHealth + "% [████      ]");
        } else if (snakeHealth >= 20 && snakeHealth <= 29) {
            System.out.println(snakeHealth + "% [███       ]");
        } else if (snakeHealth >= 10 && snakeHealth <= 19) {
            System.out.println(snakeHealth + "% [██        ]");
        } else if (snakeHealth >= 1 && snakeHealth <= 9) {
            System.out.println(snakeHealth + "% [█         ]");
        } else {
            System.out.println(snakeHealth + "% []"); // you are dead
        }
    }

    public void initializeInventory() {
        snakeInventory.add("M9 Tranquilizer (12/12)");
        snakeInventory.add("Ration (1/5)");
        snakeInventory.add("Cigs");
        snakeInventory.add("Digital Camera");
        snakeInventory.add("Dog Tags (0/?)");

        // snakeInventory.add("Chaff Grenades");
    }

    public void displayInventory() {
        gameSystems.clearConsole();
        if (snakeInventory.isEmpty()) {
            System.out.println("\033[1;31mInventory is empty.\033[0m");
        } else {
            System.out.println("\033[1;30m\n================================================================================\033[0m\n");
            System.out.println("\033[0;90m                                    Inventory\033[0m");
            System.out.println("\033[1;30m\n================================================================================\033[0m");

            System.out.println("\n\033[0;37mSnake is currently holding " + snakeInventory.size() + " items:\033[0m\n");
                for (String item : snakeInventory) {
                    System.out.println("\033[0;32m- " + item + "\033[0m");
                }
                System.out.println("\033[1;30m\n================================================================================\033[0m");
        }
    }        
}
    
