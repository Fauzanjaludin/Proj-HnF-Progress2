package sasikala;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
public class Main {

	public static void main(String[] args) {
	
		Participant p = new Participant("Shashy ","Gauthaman ","789-G Jalan sungai dua, penang.");
		System.out.println("Participant name : "+p.toString());
		System.out.println("Participant address : "+ p.getaddress());
		
		StressRelief s = new StressRelief();
		s.benefits();
		System.out.println("-Stress Rellief-");
		System.out.println("The poses and benefits of yoga for Stress Relief : ");
		System.out.println("\t");
		s.setposes("Sukhasana(Easy Pose)");
		System.out.println("First pose : " + s.getposes());
		System.out.println("It will help you calm down and eliminate anxiety. It will also reduce mental and physical exhaustion. ");
		System.out.println("\t");
		s.setposes("Balasana(Child's pose)");
		System.out.println("Second pose : " + s.getposes());
		System.out.println("Balasana is beneficial for your lymphatic system and nervous system. It will calm your mind and release stress. It stretches your thighs, hips and ankles. ");
		System.out.println("\t");
		s.setposes("Ananda Balasana (Happy baby pose)");
		System.out.println("Third pose : " + s.getposes());
		System.out.println("Ananda Balasana will help calm you and get rid of fatigue and stress. It will gently stretch your spine and groin.");
		System.out.println("\t");
		s.setposes("Uttanasana (Standing forward bend)");
		System.out.println("Fourth pose : " + s.getposes());
		System.out.println("Uttanasana will relieve mild depression and stress. It will calm your brain and stimulate your kidneys and liver.");
		s.steps();
		s.health();
		System.out.println("\t");
		
		Obesity obs = new Obesity();
		System.out.println("-Obesity-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate your BMI first!");
		System.out.print("Input weight in kilogram: ");
     double weight = sc.nextDouble();
     System.out.print("\nInput height in meters: ");
     double height = sc.nextDouble();
     double BMI = weight / (height * height);
     System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
     System.out.println("\t");
		obs.posing();
		obs.health();
		
		System.out.println("\t");
		System.out.println("-Blood Pressure-");
		posing reducepressure = new posing ();
		reducepressure.poses();
		reducepressure.benefits();
		Bloodpressure bps = new Bloodpressure();
		bps.health();
		
		System.out.println("\t");
		Insomnia i = new Insomnia();
		System.out.println("-Insomnia-");
		System.out.println("The poses and benefits of yoga for Insomnia : ");
		i.setposes("Padangusthasana(Big Toe Pose)");
		System.out.println("First pose : " + i.getposes());
		System.out.println("This pose stimulates the liver and kidneys in the back body, activating the parasympathetic nervous system, which is responsible for releasing tension and putting the body to sleep.");
		i.setbenefits("Agnistambhasana(Fire Log Pose");
		System.out.println("Second pose : " + i.getposes());
		System.out.println("As you actively focus on releasing tension in your hips, your body will respond by releasing tension in other muscle groups, preparing you for a relaxing night’s sleep.");
		i.health();
		
		
		System.out.println("\t");
		System.out.println("-Back Pain-");
		
		ArrayList al = new ArrayList();
		Object cloneList;
		al.add(" Cat-Cow,");
		al.add(" Downward-Facing-Dog, ");
		al.add(" Extended Triangle, ");
		al.add(" Sphinx Pose, ");
		al.add(" Locust Pose, ");
		System.out.println("Size of array list:" + al.size());
		System.out.println("Contents of poses:" +al);
		
		al.remove(" Downward-Facing-Dog, ");
		System.out.println("Size of arraylist after deletion :" + al.size());
		System.out.println("Contents of poses:" +al);
		cloneList = al.clone();
		System.out.println("Elements in the cloned list are: ");
		System.out.println(cloneList);
		Object[] objArray = al.toArray();
		System.out.println("Elements in the carraylist are: ");
		for(int k=0; k<objArray.length; k++)
			System.out.println(objArray[k]);
		poses backpain = new poses();
		backpain.benefits();
		
		
		
		
	
	}

}
