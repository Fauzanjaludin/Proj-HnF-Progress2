package fauzan;

public class hiking extends outdoorSp{
	String sportname="Hiking";
	String gears="Water Bottles, Backpack, Rain wear, Survival kit";
	double caloriesBurn=300.0;
	String location="Mountains";
	String exp="";

	
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
		//System.out.println("Seeing nature's beauty and wildlifes\n");
		exp+="Seeing nature's beauty and wildlifes\n";
	}
	
	public String toString() {
		experience();
		return part+"\nSport : "+sportname+"\nLocation : "+location+" \nGears :"+gears+" \nCalories burn estimation : "+caloriesBurn+" per km"+"\nExperience:"+exp;
	}
	
	
}
