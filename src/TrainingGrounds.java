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
		}
		
		System.out.println("\nEnter option:");
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		if (userInput.contains("1")||userInput.contains("attack")) {
			// Attacking option
			
			gains = attack(scanner, pet);
		} else if (userInput.contains("2")||userInput.contains("defend")) {
			// Defending option
			
		} else if (userInput.contains("3")||userInput.contains("stamina")) {
			// Stamina option
			
			if (isInsufficient) {
				// Run something here if it satisfies the condition
			}
		}
	}
	
	public static int attack(Scanner scanner, UserInformation pet) {
		Menu.newPage();
		
		int randomGame = random.nextInt(1,3);
		int value = 0;
		
		System.out.println("Attack Exercise: ");
		System.out.println("");
		
		if (randomGame == 1) {
			value = randomNumberGuess(scanner, pet);
		} else if (randomGame == 2) {
			
		} else if (randomGame == 3) {
			
		}
		
		return value;
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
			System.out.println("The number was " + randomValue + " and you guessed " + userInput + ". You are awarded " + value + "points!");
		} else {
			System.out.println("The number was " + randomValue + " and you guessed " + userInput + ". You are awarded " + value + "point!");
		}
		
		return value;
	}
	
}