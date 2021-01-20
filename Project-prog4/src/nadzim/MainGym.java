package nadzim;

public class MainGym {

	public static void main(String[] args) {
            
            System.out.println("Welcome to Gym Service Register System");
            
            Weightlifting w = new Weightlifting();
            Running r = new Running();
            BikeExercise b = new BikeExercise();
            
            w.infoGym();
            r.infoGym();
            b.infoGym();
        }
}