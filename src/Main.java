import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserInformation pet = new UserInformation(null, 0, 0, 0, 0, 0, 50);
		
		//Menu.introductionAnimation();
		Menu.mainMenu(scanner, pet);
	}
}