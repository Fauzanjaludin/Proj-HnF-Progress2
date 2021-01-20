package fauzan;

public class surfing extends outdoorSp{
	String sportname="Surfing";
	String gears="Wetsuit, Helmet, SurfBoard , Goggles";
	double caloriesBurn=300.0;
	String location="Beaches";

	
	public String getLoc() {
		return location;
	}
	public String getSportname() {
		return sportname;
	}
	public String getGears() {
		return gears;
	}
	public double getCalB(){
		return caloriesBurn;
	}
	
	public void experience() {//polymorphism
		super.experience();
		//System.out.println("experiencing the power of the oceans\n");
		exp+="\nexperiencing the power of the oceans\n";
	}
	
	public String toString() {
		experience();
		return part+"\nSport : "+sportname+"\nLocation : "+location+" \nGears :"+gears+" \nCalories burn estimation : "+caloriesBurn+" per km"+"\nExperience :"+exp;
	}
	
}
