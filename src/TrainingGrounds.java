import java.util.Scanner;
import java.util.Random;

public class TrainingGrounds {
	static Random random = new Random();
	
	public static void menu(Scanner scanner, UserInformation pet, boolean isInsufficient) {
		String userInput;
		int gains;
		
		System.out.println("Training Grounds");
		System.out.println("===================");
		System.out.println("");
		System.out.println("What would you like to train today?");
		System.out.println("");
		System.out.println("1. Attacking");
		System.out.println("2. Defending");
		
		if (isInsufficient) {
			System.out.println("\n3. NOW AVAILABLE: Stamina");
			System.out.println("\n4. Exit");
		} else {
			System.out.println("3. Exit");
		}
		
		System.out.println("\nEnter option:");
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		if (userInput.contains("1")||userInput.contains("attack")) {
			// Attacking option
			Menu.newPage();
			
			System.out.println("Getting the attack dummies ready");
			
			Menu.transition();
			attack(scanner, pet);
		} else if (userInput.contains("2")||userInput.contains("defend")) {
			// Defending option
			
		} else if (userInput.contains("3")||userInput.contains("stamina")) {
			// Stamina option
			
			if (isInsufficient) {
				// Run something here if it satisfies the condition
			}
		}
	}
	
	public static void attack(Scanner scanner, UserInformation pet) {
		Menu.newPage();
		
		int randomGame = random.nextInt(1,3);
		int gainValue = 0;
		int staminaValue = 0;
		
		System.out.println("Attack Exercise: ");
		System.out.println("");
		
		if (randomGame == 1) {
			gainValue = randomNumberGuess(scanner, pet);
		} else if (randomGame == 2) {
			// One game here
		} else if (randomGame == 3) {
			// Another game here
		}
		
		gainValue += pet.getAttackLevel();
		pet.setAttackLevel(gainValue);
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		staminaValue = pet.getStamina();
		int staminaDecreased = random.nextInt(1,7);
		staminaValue -= staminaDecreased;
		pet.setStamina(staminaValue);
		System.out.println("-" + staminaDecreased + " Stamina. You are now at " + pet.getStamina() + " Stamina total.");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		scanner.nextLine();
		menu(scanner, pet, false);
	}
	
	public static int randomNumberGuess(Scanner scanner, UserInformation pet) {
		int value = 0;
		int randomValue = random.nextInt(1,11);
		int userInput;
		
		System.out.println("I am thinking of a number between 1 and 10, what do you think it is?");
		userInput = scanner.nextInt();
		
		if (userInput == randomValue) {
			value = 10;
		} else if (userInput > randomValue) {
			int diff = userInput - randomValue;
			
			if (diff <= 3) {
				value = 5;
			} else {
				value = 1;
			}
		} else if (userInput < randomValue) {
			int diff = randomValue - userInput;
			
			if (diff <= 3) {
				value = 5;
			} else {
				value = 1;
			}
		}
		
		Menu.newPage();
		
		// For the results statement to the user being grammatically correct
		if (value > 1) {
			System.out.println("The number was " + randomValue + " and you guessed " + userInput + ". You are awarded " + value + " points!");
		} else {
			System.out.println("The number was " + randomValue + " and you guessed " + userInput + ". You are awarded " + value + " point!");
		}
		
		return value;
	}
	
}