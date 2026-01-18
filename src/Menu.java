import java.util.Scanner;

public class Menu {
	
	public static void newPage() {
		// Makes a new page by flooding the console with a bunch of empty prints 
		
		for (int i = 0; i <= 20; i++) {
			System.out.println(" ");
		}
		
	}
	
	public static void transition() {
		
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				
			}
			
			System.out.print(".");
			System.out.print(" ");
		}
		
		try {
			Thread.sleep(1400);
		} catch (Exception e) {
			
		}
		
		newPage();
	}
	
	public static void introductionAnimation() {
		System.out.printf("\n%-50s %-26s", "/", "\\");
	
		// WIP
	}
	
	public static void mainMenu(Scanner scanner, UserInformation pet) {
		String userInput;
		
		System.out.println("\n====== 𝓔𝓶𝓫𝓮𝓻𝓹𝓮𝓪𝓴 ======");
		System.out.println("1. New Game");
		System.out.println("2. Load from Save Code");
		
		System.out.println("\nEnter option: ");
		
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		// Possible inputs
		if (userInput.contains("1")||userInput.contains("new")) {
			// New game
			newPage();
			
			NewGame.RunAnimation(scanner, pet);
		} else if (userInput.contains("2")||userInput.contains("load")||userInput.contains("code")||userInput.contains("save")) {
			// Load game
			newPage();
			
			String code;
			
			System.out.println("Enter your save code here: ");
			code = scanner.nextLine();
			
			SaveCode.checkCode(code);
		}
	}
	
	public static void hubMenu(Scanner scanner, boolean isFirstTime, UserInformation pet) {
		boolean firstTime = isFirstTime;
		String userInput;
		
		System.out.println("=================");
		System.out.println("|| The town of ||");
		System.out.println("||  Emberpeak  ||");
		System.out.println("=================");
		System.out.println("        ||");
		System.out.println("\n");
		
		if (firstTime == true) {
			System.out.println("0. Tutorial (OPTIONAL)");
		}
		
		System.out.println("1. Explore");
		System.out.println("2. Training grounds");
		System.out.println("3. Help center");
		System.out.println("4. Get Save Code");
		System.out.println("5. Exit the game");
		System.out.println("\nEnter an option: ");
		
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		if (userInput.contains("0")||userInput.contains("tutorial")) {
			// Tutorial
			
			if (firstTime == true) {
				tutorial(scanner, pet);
			}
		} else if (userInput.contains("1")||userInput.contains("explore")) {
			// Explore
			newPage();
			
			System.out.println("1. Traveling to the Railroad Station");
			
			transition();
			
			Explore.menu(scanner, pet);
		} else if (userInput.contains("2")||userInput.contains("train")||userInput.contains("grounds")) {
			// Training grounds
			newPage();
			
			System.out.println("Traveling to the Training Grounds");
			
			transition();
			TrainingGrounds.menu(scanner, pet, false);
		} else if (userInput.contains("3")||userInput.contains("help")||userInput.contains("center")) {
			// Help center
			newPage();
			
			System.out.println("Traveling to the Help Center");
			
			transition();
			HelpCenter.menu(scanner, pet, true);
		}
	}
	
	public static void displayMenu() {
		System.out.println("");
		System.out.println("");
		System.out.println("1. Explore");
		System.out.println("2. Training grounds");
		System.out.println("3. Help Center");
		System.out.println("4. Get Save Code");
		System.out.println("5. Exit the game");
	}
	
	public static void tutorialHeader() {
		System.out.println("TUTORIAL: (PRESS ENTER TO CONTINUE)");
		System.out.println("");
		System.out.println("");
	}
	
	public static void tutorial(Scanner scanner, UserInformation pet) {
		newPage();
		tutorialHeader();
		System.out.println("Hello and welcome to Emberpeak!");
		displayMenu();
		
		String input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("Option 1 is for exploring the wild world beyond Emberpeak!");
		System.out.println("Be sure to train your pet!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("Option 2 is for training your pet for the outside world!");
		System.out.println("Many great beasts have trained and perfected their craft here!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("Option 3 is for more information just in case you need it!");
		System.out.println("They have information on everything!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("Option 4 is for saving your progress before exiting!");
		System.out.println("You will be able to pick up your progress from right where you left off!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("Option 5 is for leaving the game!");
		System.out.println("Don't forget to save!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		tutorialHeader();
		System.out.println("That's all for the menu! If you need more help or information, go to the Help Center! They will get you squared away!");
		System.out.println("Good luck and have fun exploring, travelor!");
		displayMenu();
		
		input = scanner.nextLine();
		
		newPage();
		hubMenu(scanner, false, pet);
	}
	
}