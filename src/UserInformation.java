import java.util.Scanner;

public class UserInformation {
	
	private String petName;
	private int level;
	private int attackLevel;
	private int defenseLevel;
	private int items;
	private double attackProgression;
	private double defenseProgression;
	private int stamina;
	
	UserInformation(String petName, int level, int attackLevel, int defenseLevel, int items, double attackProgression, double defenseProgression, int stamina) {
		this.petName = petName;
		this.level = level;
		this.attackLevel = attackLevel;
		this.defenseLevel = defenseLevel;
		this.items = items;
		this.attackProgression = attackProgression;
		this.defenseProgression = defenseProgression;
		this.stamina = stamina;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttackLevel() {
		return attackLevel;
	}

	public void setAttackLevel(int attackLevel) {
		this.attackLevel = attackLevel;
	}

	public int getDefenseLevel() {
		return defenseLevel;
	}

	public void setDefenseLevel(int defenseLevel) {
		this.defenseLevel = defenseLevel;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public double getAttackProgression() {
		return attackProgression;
	}

	public void setAttackProgression(double attackProgression) {
		this.attackProgression = attackProgression;
	}
	
	public double getDefenseProgression() {
		return defenseProgression;
	}

	public void setDefenseProgression(double defenseProgression) {
		this.defenseProgression = defenseProgression;
	}

	public int getStamina() {
		return stamina;
	}
	
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}