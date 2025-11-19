import java.util.Scanner;

public class LevelUp {
	
	public static void checkForLevelUp(Scanner scanner, UserInformation Pet) {
		double attackProgression = Pet.getAttackProgression();
		double defenseProgression = Pet.getDefenseProgression();
		
		// Attacking
		// If the user qualifies for a level up
		if (attackProgression >= 15) {
			Menu.newPage();
			
			Pet.setAttackProgression(0);
			int level = Pet.getAttackLevel() + 1;
			Pet.setAttackLevel(level);
			Pet.setAttackProgression(0);
			
			System.out.println("Level Up!!");
			System.out.println("\nYour little " + Pet.getPetName() + " now has a Attack Level of " + Pet.getAttackLevel() + "!");
			System.out.println("=====================================================");
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				
			}
			
		}
		
		// Defending
		// If the user qualifies for a level up
		if (defenseProgression >= 15) {
			Menu.newPage();
			
			Pet.setDefenseProgression(0);
			int level = Pet.getDefenseLevel() + 1;
			Pet.setDefenseLevel(level);
			Pet.setDefenseProgression(0);
			
			System.out.println("Level Up!!");
			System.out.println("\nYour little " + Pet.getPetName() + " now has a Defense Level of " + Pet.getDefenseLevel() + "!");
			System.out.println("============================================================================================");
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				
			}
			
		}
	}
}
