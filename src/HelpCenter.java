import java.util.Scanner;

public class HelpCenter {
	
	public static void menu(Scanner scanner, UserInformation Pet, boolean firstTime) {
		
		if (firstTime) {
			System.out.println("Hello! Welcome to the Help Center!");
			System.out.println("How may I help you?\n");
		} else {
			System.out.println("What else can I help you with?\n");
		}
		
		System.out.println("(=_=)\n");
		
		System.out.println("---------------------------------");
		System.out.println("Enter your search term here: ");
	}
}
