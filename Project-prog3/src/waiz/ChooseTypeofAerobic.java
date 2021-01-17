
package waiz;

//this is my abstract
abstract public class ChooseTypeofAerobic {
 
    //This is my polymorphisim Part
}
class AtHomeAerobic1{
    String TypeAerobic;
    int price;
    public void AtHomeAerobic(){
    this.TypeAerobic=" At Home Aerobic that will included: Jump rope, Aerobic strength circuit and\n";
    System.out.println("You will learn about "+TypeAerobic);
    this.price=150;
    System.out.println("And the price is: RM"+price);
    
        
    }
}
class AtGymAerobic1{
    String TypeAerobic;
    int price;
    public void AtGymAerobic(){
    this.TypeAerobic=" At Gym Aerobic that will included: You will learn about Swimming, Stationary bike\n"; 
    System.out.println("You will learn about "+TypeAerobic);
    this.price=280;
    System.out.println("And the price is: RM"+price);
    } 
}
