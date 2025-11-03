import java.util.Scanner;

public class NewGame {
	
	public static void transition() {
		
		try {
			Thread.sleep(3500);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
	}

	public static void RunAnimation(Scanner scanner, UserInformation pet) {
		String name;
		
		System.out.println("Loading Game");
		
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				
			}
			
			System.out.print(".");
			System.out.print(" ");
		}
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		Menu.newPage();
		
		System.out.println("( ͡° ͜ʖ ͡°)");
		System.out.println("Hello travelor!");
		
		transition();
		
		System.out.println("( ͡ᵔ ͜ʖ ͡ᵔ )");
		System.out.println("Congratulations on graduating from Emberpeak Academy!");
		
		transition();
		
		System.out.println("( ͡° ͜ʖ ͡°)");
		System.out.println("Very few people get accepted yet alone graduate, so congratulations!");
		
		transition();
		
		System.out.println("(^̮^)");
		System.out.println("Just like every other graduate, you will be given your very own pet!");
		
		transition();
		
		System.out.println("(◕‿◕)");
		System.out.println("What would you like your pet to be named? ");
		name = scanner.nextLine();
		pet.setPetName(name);
		
		Menu.newPage();
		
		System.out.println("(^̮^)");
		System.out.println(pet.getPetName() + "! I like that name!");
		
		transition();
		
		System.out.println("( ͡° ͜ʖ ͡°)");
		System.out.println("Let me get you your pet!");
		
		transition();
		
		System.out.println("(^̮^)\n");
		
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				
			}
			
			System.out.print(".");
			System.out.print(" ");
		}
		
		transition();
		
		System.out.println("(◕‿◕)");
		System.out.println("Here is your little " + pet.getPetName() + "! Take good care of him!");
		
		transition();
		
		System.out.println("| ^ - ^ |");
		System.out.print(pet.getPetName());
		
		try {
			Thread.sleep(1400);
		} catch (Exception e) {
			
		}
		
		System.out.print(" Aquired!");
		
		transition();
		
		System.out.println("| ^ - ^ |");
		System.out.println("Hello! Thank you for naming me " + pet.getPetName() + "!");
		
		transition();
		
		System.out.println("| ^ o ^ |");
		System.out.println("I can't wait for the adventures we are going to go on!");
		
		transition();
		
		Menu.hubMenu(scanner, true, pet);
	}

}