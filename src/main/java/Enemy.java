import java.util.Random;

public class Enemy {
    private int enemyHealth;
    private int maxHealth;
    private int attackPower;
    private String enemyType;
    private Random random = new Random();

    public Enemy(String type) {
        this.enemyType = type;
        initializeEnemy();
    }

    private void initializeEnemy() {
        if (enemyType.toLowerCase().contains("guard")) {
            this.maxHealth = 50;
            this.enemyHealth = 50;
            this.attackPower = 8;
        } else if (enemyType.toLowerCase().contains("commander")) {
            this.maxHealth = 80;
            this.enemyHealth = 80;
            this.attackPower = 12;
        }
    }

    public int getHealth() {
        return enemyHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void takeDamage(int damage) {
        enemyHealth -= damage;
        if (enemyHealth < 0) {
            enemyHealth = 0;
        }
    }

    public int attackSnake() {
        int baseDamage = attackPower;
        int variance = random.nextInt(5) - 2;
        return Math.max(1, baseDamage + variance);
    }

    public boolean isAlive() {
        return enemyHealth > 0;
    }

    public void displayHealthBar() {
        int healthPercent = (enemyHealth * 100) / maxHealth;
        String healthBar = "";
        
        if (healthPercent >= 90) {
            healthBar = "[██████████]";
        } else if (healthPercent >= 80) {
            healthBar = "[█████████ ]";
        } else if (healthPercent >= 70) {
            healthBar = "[████████  ]";
        } else if (healthPercent >= 60) {
            healthBar = "[███████   ]";
        } else if (healthPercent >= 50) {
            healthBar = "[██████    ]";
        } else if (healthPercent >= 40) {
            healthBar = "[█████     ]";
        } else if (healthPercent >= 30) {
            healthBar = "[████      ]";
        } else if (healthPercent >= 20) {
            healthBar = "[███       ]";
        } else if (healthPercent >= 10) {
            healthBar = "[██        ]";
        } else {
            healthBar = "[█         ]";
        }
        
        System.out.println("\033[1;31m" + enemyType + " Health - " + healthBar + " " + healthPercent + "%" + "\033[0m");
    }
}
