package sasikala;
import java.io.*;
import java.util.Scanner;

public class StressRelief extends Obesity{
	
	
		
		private String benefits;
		private String poses;
		
			
			
		public void benefits() {
			System.out.println("Do you have stress problems?");
	    	Scanner in = new Scanner(System.in);
	    	String benefits = in.next();  
	    	System.out.println("Then, you will know how to calm your body and mind");
	    	
		 }

	    public String getposes() {
	    	return poses;   	
	    }
	    	
	 
	    public void setposes(String poses) {
	    	this.poses = poses;
	    }
	    public String getbenefits() {
	    	return benefits;
	    }
	    public void setbenefits (String benefits) {
	    	this.benefits = benefits;
	    }
	    
	    public void steps() {
	    	try {
	    BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\USER\\Desktop\\StressRelief\\output.txt"));
		bw.write("How to do it ? There you go step by step :");
		System.out.println("\t");
		bw.write("\nSukhasana(Easy Pose) :- \n"
				+ " 1. Start by sitting down with your spine straight and legs extended in front of you. \n"
				+ " 2. Now, bend your knees and bring you left foot under your right knee and your right foot under your left knee. \n"
				+ " 3. Keep your palms on your knees. \n"
				+ " 4. Align your head, neck and spine. \n"
				+ " 5. Gaze ahead and pay attention to your breathing. \n"
				+ " 6. Stay in this position for 60 seconds and then change the crossed legs.\n");
		bw.write("\n Balasana(Child's pose) :- \n"
				+ " 1. Start by kneeling down and sitting on your heels.\n"
				+ " 2. Now, bend forward till your chest touches your thighs. \n"
				+ " 3. Let your hands rest on the side.\n"
				+ " 4. Hold this position as long as possible and breathe deeply.\n");
		bw.write("\n Ananda Balasana (Happy baby pose) :- \n"
				+ " 1. Lie down on your back with your legs extended and arms on your side.\n"
				+ " 2. Now, bend your knees towards your belly.\n"
				+ " 3. Stretch your hands and hold your feet.\n"
				+ " 4. Open your knees wide and stay in this position for 60 seconds.\n");
		bw.write("\n Uttanasana (Standing forward bend) :- \n"
				+ " 1. Stand straight and bend forward.\n"
				+ " 2. Stretch your body to touch your palms to the ground.\n"
				+ " 3. Straighten your legs for deeper stretch.\n"
				+ " 4. Hold this position for three to four deep breaths and then return to the original position.\n");
		bw.close();
	    	}
	    
	    catch(Exception ex) {
			return;}
	    
	   
	    try {
	    	 BufferedReader br = new BufferedReader (
	    			new FileReader("C:\\Users\\USER\\Desktop\\StressRelief\\output.txt"));
	    	 String s;
	    	 while((s = br.readLine()) !=null) {
	    		 System.out.println(s);
	    		 
	    	 }
	    	br .close();
	    }catch(Exception ex) {
	    	return;}
	    	
	    }
	    
	    	
	    void health() {
	    System.out.println("You'll be healthy and fine.");
	    super.health();
			
	
			
		

	

		
		
	}
}

