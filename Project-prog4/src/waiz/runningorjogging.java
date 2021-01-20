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
 public class runningorjogging extends AtHomeAerobic1 {
    String equipment, benefits, safety, about;
    String duration, frequency;
    
    public void runningorjogging(){
        this.about="If you’re a beginner, run for 20 to 30 minutes twice a week. \nYour pace should be conversational during the run. \nYou can alternate between 5 minutes of running and 1 minute of walking to start.\n To stay injury-free, always stretch after your run.";
        System.out.println("About (Running or jogging): "+about);
    }
    public void equipment(){
        this.equipment=" Running shoes";
        System.out.println("Equipment(Running or jogging): "+equipment);
    }
    public void benefits(){
        this.benefits=" Running is one of the most effective forms of aerobic exercise. It can improve heart health, burn fat and calories, and lift your mood, just to name a few.";
        System.out.println("Benefits (Running or jogging): "+benefits);
    }
    public void safety(){
        this.safety=" Choose well-lit, populated running routes. Let someone know where you’ll be.";
        System.out.println("Safety (Running or jogging): "+safety);
    }
    public void duration(){
        this.duration=" 20 to 30 minutes";
        System.out.println("Duration (Running or joggingt): "+duration);
    }
    public void frequency(){
     this.frequency=" 2 to 3 times per week";   
     System.out.println("frequency (Running or joggingt): "+frequency);
    }
}
