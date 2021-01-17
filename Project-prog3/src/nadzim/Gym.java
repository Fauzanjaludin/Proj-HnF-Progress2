
package nadzim;

public class Gym {
	
	public static void Title() {
		System.out.println("Title");
	}
	
	String coach,equipment,set,calories;
	
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	
	public void setSet(String set) {
		this.set = set;
	}
	
	public void setCalories(String calories) {
		this.calories = calories;
	}
	
	public String getCoach() {
		return this.coach;
	}
	
	public String getEquipment() {
		return this.equipment;
	}
	
	public String getSet() {
		return this.set;
	}
	
	
	public String getCalories() {
		return this.calories;
	}
}

