package day7assignments;
public class Gamecharacter {
	    String name;
	    private int health;
	    private int attackPower;
	    GameCharacter(String name, int health, int attackPower) {
	        this.name = name;
	        this.health = health;
	        this.attackPower = attackPower;
	    }

	    void attack(GameCharacter enemy) {
	        enemy.health -= this.attackPower;

	        if (enemy.health < 0) {
	            enemy.health = 0;
	        }

	        System.out.println(this.name + " attacked " + enemy.name +
	                " and reduced health by " + this.attackPower);
	    }
	    void heal() {
	        health += 20;
	        System.out.println(name + " healed and gained 20 health.");
	    }
	    void showStats() {
	        System.out.println("Name: " + name);
	        System.out.println("Health: " + health);
	        System.out.println("Attack Power: " + attackPower);
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {

	        GameCharacter player1 = new GameCharacter("Warrior", 100, 25);
	        GameCharacter player2 = new GameCharacter("Dragon", 120, 30);

	        player1.attack(player2);
	        player2.attack(player1);

	        player1.heal();

	        System.out.println("\n--- Character Stats ---");
	        player1.showStats();
	        player2.showStats();
	    }
	}
	
}
}

	