package sasikala;

public class Obesity extends Insomnia{
	 
	String poses;
	String poses1;
	


	Obesity(){
	this.poses=" Dandasana";
	this.poses1= "Kapal Bhati Pranayama";

	}

	public void posing() {
	System.out.println("First pose : " + poses);
	System.out.println(poses + " : This pose is an excellent abdomen toner. It is good for the upper body as it strengthens the wrists and arms.");
	
	System.out.println("Second pose : " + poses1);
	System.out.println(poses1 + " : This breathing technique increases the rate of metabolism and thus helps in reducing weight. It also improves digestive tract functioning, absorption and assimilation of nutrients.");
	
	
	}

	
	
	void health() {
		System.out.println("You'll be healthy and fine.");
	}

}
