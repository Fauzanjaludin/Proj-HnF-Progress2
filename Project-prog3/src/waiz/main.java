
package waiz;

public class main extends ChooseTypeofAerobic {
    public static void main(String[] args){
        
        System.out.println("Welcome to the AerobicDotMy service Register System,\nPlease put your name and choose type of aerobic you want \nalso if you want to know about each of aerobic just type for example: swimming and s.swimming ");
        //Choose Type of aerobic
        
        //At Home Aerboics all activity:
        AtHomeAerobic1 H = new AtHomeAerobic1();
        jumprope j = new jumprope();
        aerobicstrenghtcircuit e = new aerobicstrenghtcircuit();
        runningorjogging r = new runningorjogging();
        
        //At Gym Aerboics all activity:
        AtGymAerobic1 G = new AtGymAerobic1();
        swimming s = new swimming();
        stationarybike st = new stationarybike();
        eliptical el = new eliptical();
        
        
        Participant a = new Participant();
        //Set name for the Participant
        a.setFirstname("Abu");
        a.setLastname("Labu");
        System.out.println("Participant 1 name: "+a.getFirstname()+" "+a.getLastname());
        System.out.println("You want to learn about: ");
        H.AtHomeAerobic();
        r.runningorjogging();
        r.duration();
        
        
        
        System.out.println("\n");
        
     
        //Set name for the Participant
        a.setFirstname("Ain");
        a.setLastname("Elisha");
        System.out.println("Participant 2 name: "+a.getFirstname()+" "+a.getLastname());
        System.out.println("You want to learn about: ");
        G.AtGymAerobic();
        System.out.println("\n");
        s.swimming();
        s.frequency();
    }
}
