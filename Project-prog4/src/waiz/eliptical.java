/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waiz;

/**
 *
 * @author USER
 */
public class eliptical extends AtGymAerobic1 {
    String equipment, benefits, safety, about;
    String duration, frequency;
    
    public void eliptical(){
        this.about=" The elliptical machine may seem intimidating at first, but it’s easy to use once you get the hang of it. After warming up, keep your posture upright while you use your legs in a pedal motion to move the machine.";
        System.out.println("About (Elliptical): "+about);
    }
    public void equipment(){
        this.equipment=" Elliptical machine";
        System.out.println("Equipment(Elliptical): "+equipment);
    
    }
    public void benefits(){
        this.benefits=" Elliptical machines provide a good cardiovascular workout that’s less stressful on the knees, hips, \nand back compared to the treadmill or running on the road or trails.";
        System.out.println("Benefits (Elliptical): "+benefits);
    }
    public void safety(){
        this.safety="  Look forward, not down. Use the handlebars if you feel unsteady or to help you get on and off the machine.";
        System.out.println("Safety (Elliptical): "+safety);
    }
    public void duration(){ 
    this.duration=" 20 to 30 minutes";
    System.out.println("Duration (Elliptical): "+duration);
    }
    public void frequency(){
     this.frequency=" 2 to 3 times per week";   
     System.out.println("frequency (Elliptical): "+frequency);
    }
    
}

    

