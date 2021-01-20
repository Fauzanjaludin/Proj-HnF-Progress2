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
public class stationarybike extends AtGymAerobic1 {
    String equipment, benefits, safety, about;
    String duration, frequency;
    
    public void stationarybike(){
        this.about=" If your gym has a pool, try swimming as aerobic exercise. \nIt’s a nonimpact workout, so it’s a good choice if you’re prone to injury. \nYou’re also increasing your heart rate, toning your muscles, and building strength and endurance — \nall without adding additional strain to your body.";
        System.out.println("About (Stationary bike): "+about);
    }
    public void equipment(){
        this.equipment=" Stationary bike";
        System.out.println("Equipment(Stationary bike): "+equipment);
    
    }
    public void benefits(){
        this.benefits=" Swimming is a low-impact exercise, so it’s good for people prone to or recovering from an injury or living with limited mobility. It can help you tone your muscles and build strength and endurance.";
        System.out.println("Benefits (Stationary bike): "+benefits);
    }
    public void safety(){
        this.safety="  Avoid swimming alone and, if possible, choose a pool with a lifeguard on duty. If you’re new to swimming, begin by enrolling in swim lessons.";
        System.out.println("Safety (Stationary bike): "+safety);
    }
    public void duration(){ 
    this.duration=" 10 to 30 minutes";
    System.out.println("Duration (Stationary bike): "+duration);
    }
    public void frequency(){
     this.frequency=" 2 to 5 times a week";   
     System.out.println("frequency (Stationary bike): "+frequency);
    }
    
}
