import java.util.Scanner;


// Save code could be something like:
// Random number - Level amount - attack level - random number - defense level - random number - items (could so something like item ID - amount) - random number - progression


public class SaveCode {
	
	// Main method calling method
	public static void checkCode(String input) {
		int level = checkForLevel(input);
		int attackLevel = checkForAttackLevel(input);
		
		// Have the rest of the methods be called here and set them to a variable
		// I am planning on having a method connected to another class and file to where I can transport these values into the game
		
	}
	
	
	public static int checkForLevel(String input) {
		int level = 0;
		
		// Thinking we could add more levels
		// Around 15-20 maybe?
		
		if (input.contains("264")) {
			level = 1;
		} else if (input.contains("741")) {
			level = 2;
		} else if (input.contains("891")) {
			level = 3;
		} else if (input.contains("610")) {
			level = 4;
		} else if (input.contains("772")) {
			level = 5;
		} else if (input.contains("553")) {
			level = 6;
		} else if (input.contains("332")) {
			level = 7;
		} else if (input.contains("757")) {
			level = 8;
		} else if (input.contains("112")) {
			level = 9;
		} else if (input.contains("958")) {
			level = 10;
		}
		
		return level;
	}
	
	public static int checkForAttackLevel(String input) {
		int level = 0;
		
		// Thinking we could for sure add higher attack levels
		// Somewhere around 30?
		
		if (input.contains("663")) {
			level = 1;
		} else if (input.contains("776")) {
			level = 2;
		} else if (input.contains("492")) {
			level = 3;
		} else if (input.contains("401")) {
			level = 4;
		} else if (input.contains("394")) {
			level = 5;
		}
		
		return level;
	}
	
	public static int checkForDefenseLevel(String input) {
		int level = 0;
		
		// Same thing as attack level, we could add a lot more
		// Somewhere around 30 might be perfect
		
		return level;
	}
	
	public static int checkForItems(String input) {
		int items = 0;
		
		// Still kind of unsure about this one, but I have a general idea
		// Thinking I could do a code equivalent to the number of items someone has
		// Might add multiple different type of items (boosters, etc) but I think I will stick with heals for now
		
		return items;
	}
	
	public static double checkForLevelProgression(String input) {
		int progression = 0;
		
		// Thinking we could just have numbers divide here
		// Something like number in code / some other number idk
		
		return progression;
	}
}