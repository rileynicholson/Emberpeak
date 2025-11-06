import java.util.Scanner;
import java.util.Random;

public class TrainingGrounds {
	static Random random = new Random();
	
	// The Main Menu of the Training Grounds
	public static void menu(Scanner scanner, UserInformation pet, boolean isInsufficient) {
		String userInput;
		
		System.out.println("Training Grounds");
		System.out.println("===================\n");
		System.out.println("What would you like to train today?\n");
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
		
		if (userInput.contains("1")&&isInsufficient == false||userInput.contains("attack")&&isInsufficient == false) {
			// Attacking option
			Menu.newPage();
			
			System.out.println("Getting the Attack Dummies Ready");
			
			Menu.transition();
			attack(scanner, pet);
		} else if (userInput.contains("2")&&isInsufficient == false||userInput.contains("defend")&&isInsufficient == false) {
			// Defending option
			Menu.newPage();
			
			System.out.println("Getting Baby " + pet.getPetName() + " into Armor");
			
			Menu.transition();
			defend(scanner, pet);
		}
		
		if (isInsufficient) {
			
			if (userInput.contains("3")||userInput.contains("stamina")) {
				// Stamina output
				Menu.newPage();
				
				stamina(scanner, pet);
			} else if (userInput.contains("4")||userInput.contains("exit")) {
				// Exit output
				Menu.newPage();
				
				System.out.println("Traveling back to Town Center");
				Menu.transition();
				Menu.hubMenu(scanner, false, pet);
			}
		} else if (!isInsufficient) {
			
			if (userInput.contains("3")||userInput.contains("exit")) {
				// Exit output
				Menu.newPage();
				
				System.out.println("Traveling back to the Town Center");
				Menu.transition();
				Menu.hubMenu(scanner, false, pet);
			}
		}
		
		 if (!userInput.contains("1")||!userInput.contains("2")||!userInput.contains("3")||!userInput.contains("stamina")||!userInput.contains("exit")||!userInput.contains("attack")||!userInput.contains("defend")) {
				// Runs if the input is not recognized
				Menu.newPage();
				
				System.out.println("Error: Input not recognized, please try again.");
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					
				}
				
				Menu.newPage();
				
				if (isInsufficient) {
					menu(scanner, pet, true);
				} else {
					menu(scanner, pet, false);
				}
			}
	}
	
	// Attacking Training
	public static void attack(Scanner scanner, UserInformation pet) {
		Menu.newPage();
		
		int randomGame = random.nextInt(1,4);
		int gainValue = 0;
		int staminaValue = 0;
		
		System.out.println("Attack Exercise: ");
		System.out.println("");
		
		if (randomGame == 1) {
			gainValue = randomNumberGuess(scanner, pet);
		} else if (randomGame == 2) {
			// Different game here
			// Random Number Guess will be here for now
			gainValue = randomNumberGuess(scanner, pet);
		} else if (randomGame == 3) {
			// Another game here
			// Random Number Guess will be here for now
			gainValue = randomNumberGuess(scanner, pet);
		}
		
		gainValue += pet.getAttackLevel();
		pet.setAttackLevel(gainValue);
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		staminaValue = pet.getStamina();
		int staminaDecreased = random.nextInt(1,12);
		staminaValue -= staminaDecreased;
		pet.setStamina(staminaValue);
		System.out.println("-" + staminaDecreased + " Stamina. You are now at " + pet.getStamina() + " Stamina total.");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		scanner.nextLine();
		
		if (pet.getStamina() <= 11) {
			menu(scanner, pet, true);
		} else {
			menu(scanner, pet, false);
		}
	}
	
	// Defending Training
	public static void defend(Scanner scanner, UserInformation pet) {
		Menu.newPage();
		
		int randomGame = random.nextInt(1,4);
		int gainValue = 0;
		int staminaValue = 0;
		
		System.out.println("Defence Exercise:");
		System.out.println("");
		
		if (randomGame == 1) {
			gainValue = randomNumberGuess(scanner, pet);
		} else if (randomGame == 2) {
			// Different game here
			// Random number guess will be here for now
			gainValue = randomNumberGuess(scanner, pet);
		} else if (randomGame == 3) {
			// Another game here
			// Random number guess will be here for now
			gainValue = randomNumberGuess(scanner, pet);
		}
		
		gainValue += pet.getDefenseLevel();
		pet.setDefenseLevel(gainValue);
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		staminaValue = pet.getStamina();
		int staminaDecreased = random.nextInt(1,12);
		staminaValue -= staminaDecreased;
		pet.setStamina(staminaValue);
		System.out.println("-" + staminaDecreased + " Stamina. You are now at " + pet.getStamina() + " Stamina total.");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		scanner.nextLine();
		
		if (pet.getStamina() <= 11) {
			menu(scanner, pet, true);
		} else {
			menu(scanner, pet, false);
		}
	}
	
	// Stamina regeneration
	public static void stamina(Scanner scanner, UserInformation pet) {
		Menu.newPage();
		
		System.out.println("Sending Baby " + pet.getPetName() + " to the Napping Quarters");
		Menu.transition();
		Menu.newPage();
		
		System.out.println("The process takes about half a minute!");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("      Z");
			System.out.println("   Z");
			System.out.println("| - - - |");
			System.out.println("Baby " + pet.getPetName() + " is sleeping!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			Menu.transition();
		}
		
		pet.setStamina(50);
		System.out.println("The stamina of " + pet.getPetName() + " is now full!");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		menu(scanner, pet, false);
	}
	
	// Random Number Guesser Game
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
			
			if (diff <= 2) {
				value = 5;
			} else {
				value = 1;
			}
		} else if (userInput < randomValue) {
			int diff = randomValue - userInput;
			
			if (diff <= 2) {
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