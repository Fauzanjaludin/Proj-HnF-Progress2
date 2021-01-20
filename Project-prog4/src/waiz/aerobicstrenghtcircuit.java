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
public class aerobicstrenghtcircuit extends AtHomeAerobic1 {
    String equipment, benefits, safety, about;
    String duration, frequency;
    
    public void aerobicstrenghtcircuit(){
        
        this.about="This aerobic circuit is designed to get your heart rate up. Perform the following strength exercises for 1 minute:\n" +
"\n" +
"squats\n" +
"lunges\n" +
"pushups\n" +
"dips\n" +
"torso twist\n";
        System.out.println("About Strength: "+about);
    }
    public void equipment(){
        this.equipment=" Gym shoes (sneakers), sturdy chair or couch for dips";
        System.out.println("Equipment(Strength circuit): "+equipment);
    }
    public void benefits(){
        this.benefits=" This exercise increases heart and cardiovascular health, builds up strength, and tones major muscle groups.";
        System.out.println("Benefits (Strength): "+benefits);
    }
    public void safety(){
        this.safety=" Focus on proper form with each exercise to avoid injury.\n Keep your heart rate at a moderate level throughout. \nYou should be able to carry on a brief conversation during this exercise.";
        System.out.println("Safety (Strength circuit): "+safety);
    }
    public void duration(){
        this.duration=" 15 to 25 Minutes";
        System.out.println("Duration (Strength circuit): "+duration);
    }
    public void frequency(){
     this.frequency=" 3 to 5 times per week.";   
     System.out.println("frequency (Strength circuit): "+frequency);
    }
}
