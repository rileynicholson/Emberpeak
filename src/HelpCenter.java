import java.util.Scanner;

public class HelpCenter {
	
	public static void menu(Scanner scanner, UserInformation Pet, boolean firstTime) {
		String input;
		
		if (firstTime) {
			System.out.println("Hello! Welcome to the Help Center!");
			System.out.println("How may I help you?\n");
		} else {
			System.out.println("What else can I help you with?\n");
		}
		
		System.out.println("(=_=)\n");
		
		System.out.println("---------------------------------");
		System.out.println("1. Term Search");
		System.out.println("2. Pet Levels");
		System.out.println("3. Exit");
		
		input = scanner.nextLine();
		input = input.toLowerCase();
		
		// Searching a term
		if (input.contains("1")||input.contains("search")||input.contains("term")) {
			Menu.newPage();
			
			searchTerm(scanner, Pet);
		}
		
		// Displaying Pet levels
		if (input.contains("2")||input.contains("pet")||input.contains("levels")) {
			
		}
		
		// Exit the Help Center
		if (input.contains("3")||input.contains("exit")||input.contains("quit")) {
			System.out.println("Traveling back to Town Center");
			Menu.transition();
			Menu.hubMenu(scanner, false, Pet);
		}
	}
	
	public static void deskPerson() {
		System.out.println("(=_=)\n");
		
		System.out.println("---------------------------------");
	}
	
	public static void searchTerm(Scanner scanner, UserInformation Pet) {
		String term;
		
		System.out.println("You want to know more about something? Sure! I can help you! I have tons of books on information relating to Emberpeak and its secrets!\n");
		deskPerson();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		System.out.println("Enter only the term you would like to search and I will tell you all about it!");
		System.out.println("Enter '1' if you want the list of terms that you can search!\n");
		deskPerson();
		
		term = scanner.nextLine();
		term = term.toLowerCase();
		
		if (term.contains("explor")) { // Explore
			Menu.newPage();
			
			System.out.println("(Press enter to continue)");
			System.out.println("Exploring is a cruitial part to developing your pet, discovering new places, and achieving glory in Emberpeak!");
			System.out.println("Outside of the town, there are only two places you can go to. These include the Frontier and the Great Tower of Keldor!");
			System.out.println("You will also be able to aquire items like heals and other prized items out there!");
			System.out.println("The 'Explore' option can be accessed at the main menu. It is the first option!\n");
			deskPerson();
			
			String enter = scanner.nextLine();
			
			Menu.newPage();
			menu(scanner, Pet, false);
		}
		
		if (term.contains("train")&&!term.contains("ground")) { // Training
			Menu.newPage();
			
			System.out.println("(Press enter to continue)");
			System.out.println("Training is crucial to developing your pet and increasing your pet's skills.");
			System.out.println("Besides battling creatures and leveling up, the only place you can train your pet is the Training Grounds that is found at the main menu!");
			System.out.println("You have two main atributes with your pet, Attacking and Defending.");
			System.out.println("Both of these attributes can be increased in the Training Grounds!\n");
			deskPerson();
			
			String enter = scanner.nextLine();
			
			Menu.newPage();
			menu(scanner, Pet, false);
		}
		
		if (term.contains("train")&&term.contains("ground")) { // Training Grounds
			Menu.newPage();
			
			System.out.println("(Press enter to continue)");
			System.out.println("The Training Grounds is where the pet training happens!");
			System.out.println("The grounds were created during the midst of the Great War of Keldor.");
			System.out.println("The grounds used to be exclusive only to the Elders, but after the war, they were made public to all graduates!");
			System.out.println("You can train your pet's attacking and defending levels here!");
			deskPerson();
			
			String enter = scanner.nextLine();
			
			Menu.newPage();
			menu(scanner, Pet, false);
		}
		
		if (term.contains("something")&&term.contains("something else")) {
			
		}
		
		if (term.contains("1")) { // List of terms
			
		}
	}
}