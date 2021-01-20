package sasikala;


abstract class reducepressure {
	//Abstract method (does not have a body)
	public abstract void benefits();
	//Regular method
	public void poses() {
		System.out.println("Shavasana and Bhujangasana");
	}
}
//Subclass (inherit from reducepressure)
class posing extends reducepressure { 
	public void benefits() {
		System.out.println("Shavasana is the easiest poses which you can try to control your blood pressure numbers  "
				+ "Bhujangasana is helpful in circulating blood and oxygen. This pose also relieves stress and promotes heart health. ");
	}
}

 class Bloodpressure {
	void health() {
		System.out.println("You'll be healthy and fine.");

	}

}

