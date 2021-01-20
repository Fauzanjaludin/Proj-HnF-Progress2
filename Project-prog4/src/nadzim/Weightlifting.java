
package nadzim;

public class Weightlifting extends Gym {

	String caoch,equipment,set,calories;
                
public void infoGym(){
    
    setCoach("En.Alif");
    setEquipment("Dumbell");
    setSet("12x -3set");
    setCalories("300");
    
    System.out.println("\nName: "+getCoach());
    System.out.println("Equipment: "+getEquipment());
    System.out.println("Set: "+getSet());
    System.out.println("Calories: "+getCalories());
}
}