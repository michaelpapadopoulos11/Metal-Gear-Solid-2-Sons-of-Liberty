import java.util.Random;

public class Enemy {
    private int enemyHealth;
    private int maxHealth;
    private int attackPower;
    private String enemyType;
    private Random random = new Random();

    // boss-specific fields
    private boolean isBoss;
    private int bossPhase;         // 1 or 2 for Olga, for example

    public Enemy(String type) {
        this.enemyType = type;
        this.isBoss = type.toLowerCase().contains("olga");
        this.bossPhase = 1;
        initializeEnemy();
    }

    private void initializeEnemy() {
        String type = enemyType.toLowerCase();

        if (type.contains("guard")) {
            this.maxHealth = 50;
            this.enemyHealth = 50;
            this.attackPower = 8;

        } else if (type.contains("commander")) {
            this.maxHealth = 80;
            this.enemyHealth = 80;
            this.attackPower = 12;
        }
        
        else if (isBoss) { // olga boss
            this.maxHealth = 120;
            this.enemyHealth = 120;
            this.attackPower = 12; // toned-down damage for boss
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
        if (isBoss) {
            checkPhaseChange();
        }
    }

    public int attackSnake() {
        if (isBoss) {
            int roll = random.nextInt(100);
            if (bossPhase == 1) {
                if (roll < 20) { // knife throw
                    System.out.println("\033[1;33m  [Olga hurls a knife at you!]\033[0m");
                    return attackPower + 8; // less extra damage
                }
            } else if (bossPhase == 2) {
                if (roll < 30) { // enraged flurry
                    System.out.println("\n\033[1;33m  [Olga unleashes a furious flurry of strikes!]\033[0m");
                    return attackPower + 10;
                }
            }
            int baseDamage = attackPower;
            int variance = random.nextInt(5) - 2;
            return Math.max(1, baseDamage + variance);
        }
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
        
        // use purple for boss health bar otherwise red
    String color = isBoss ? "\033[1;35m" : "\033[1;31m";
    String line = color + enemyType + " Health - " + healthBar + " " + healthPercent + "%" + "\033[0m";
        if (isBoss) {
            line += "                        \033[1;33m[Phase " + bossPhase + "]\033[0m";
        }
    System.out.println(line);
    }

    // boss utility
    private void checkPhaseChange() {
        if (!isBoss) return;
        int percent = (enemyHealth * 100) / maxHealth;
        if (percent <= 60 && bossPhase == 1) {
            bossPhase = 2;
            attackPower += 5;
            System.out.println("\n\033[1;31m  [Olga suddenly becomes enraged! Her attacks intensify.]\033[0m");
            gameSystems.pauseText(1500);
        }
    }

    public int getBossPhase() {
        return bossPhase;
    }
}
