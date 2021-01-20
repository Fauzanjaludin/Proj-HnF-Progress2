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
public class jumprope extends AtHomeAerobic1 {
    String equipment, benefits, safety, about;
    String duration, frequency;
    
    public void jumprope(){
        this.about=" Following a jump rope circuit is a great indoor or outdoor activity, though you’ll want to make sure you have plenty of space.";
        System.out.println("About (Jump rope): "+about);
    }
    public void equipment(){
        this.equipment=" gym shoes (sneakers), jump rope";
        System.out.println("Equipment(Jump rope): "+equipment);
    }
    public void benefits(){
        this.benefits=" Jumping rope helps develop better body awareness, hand-foot coordination, and agility.";
        System.out.println("Benefits (Jump rope): "+benefits);
    }
    public void safety(){
        this.safety=" Your jump rope should be adjusted for your height. \nStand with both feet on the middle of the rope and extend the handles to your armpits. \nThat’s the height you’re going for. If it’s too long, cut or tie it to avoid tripping on the rope.";
        System.out.println("Safety (Jump rope): "+safety);
    }
    public void duration(){ 
    this.duration=" 15 to 25 minutes";
    System.out.println("Duration (Jump rope): "+duration);
    }
    public void frequency(){
     this.frequency=" 3 to 5 times per week";   
     System.out.println("frequency (Jump rope): "+frequency);
    }
    
    
}
