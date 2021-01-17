package nadzim;

public class BikeExercise extends Gym{
		String caoch,equipment,set,calories;
                
public void infoGym(){
    
    setCoach("En.Samad");
    setEquipment("Bikemill");
    setSet("30 minutes");
    setCalories("400");
    
    System.out.println("\nName: "+getCoach());
    System.out.println("Equipment: "+getEquipment());
    System.out.println("Set: "+getSet());
    System.out.println("Calories: "+getCalories());
}
}