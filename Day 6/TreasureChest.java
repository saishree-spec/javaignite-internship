package day6assignments;

public class TreasureChest {
	    String playerName;
	    int coinsCollected;
	    String reward;

	    TreasureChest(String playerName, int coinsCollected) {
	        this.playerName = playerName;
	        this.coinsCollected = coinsCollected;

	        if (coinsCollected >= 1000)
	            reward = "Diamond Sword";
	        else if (coinsCollected >= 500)
	            reward = "Gold Sword";
	        else if (coinsCollected >= 100)
	            reward = "Iron Sword";
	        else
	            reward = "Wooden Sword";
	    }

	    void display() {
	        System.out.println("Player Name: " + playerName);
	        System.out.println("Coins Collected: " + coinsCollected);
	        System.out.println("Reward: " + reward);
	    }

	    public static void main(String[] args) {
	        TreasureChest t1 = new TreasureChest("Rahul", 650);
	        t1.display();
	    }
	
}

	
