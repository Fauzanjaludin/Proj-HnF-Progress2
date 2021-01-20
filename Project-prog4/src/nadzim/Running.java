
package nadzim;

public class Running extends Gym {

	String caoch,equipment,set,calories;
                
public void infoGym(){
    
    setCoach("En.Sazali");
    setEquipment("Treadmill");
    setSet("30 minutes");
    setCalories("200");
    
    System.out.println("\nName: "+getCoach());
    System.out.println("Equipment: "+getEquipment());
    System.out.println("Set: "+getSet());
    System.out.println("Calories: "+getCalories());
}
}
