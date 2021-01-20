package fauzan;

public class outdoorSp {
	String sportname;
	String gears;
	double caloriesBurn;
	String part;
	String location;
	String exp;
	
	
	outdoorSp(){
		this.sportname="";
		this.gears="";
		this.caloriesBurn=0.0;
		this.part="";
		this.location="";
	}
	
	outdoorSp(String spN,String gear,double calB,String part,String Location){
		this.sportname=spN;
		this.gears=gear;
		this.caloriesBurn=calB;
		this.part=part;
		this.location=Location;
	}
	
	public void setSportname(String Sportname){
		this.sportname=Sportname;
	}
	public void setPartname(String Partname) {
		this.part=Partname;
	}
	public void setGears(String gear) {
		this.gears=gear;
	}
	
	public void setCalB(double calB) {
		this.caloriesBurn=calB;
	}
	public void setLoc(String Loc) {
		this.location=Loc;
	}
	
	public String getLoc() {
		return location;
	}
	public String getPartname() {
		return part;
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
	
	public void experience() {
		exp="Thrilling and fun outdoors";
		System.out.println("Thrilling and fun outdoors");
	}
	
	public String toString() {
		experience();
		return part+"\nSport : "+sportname+"\nLocation : "+location+" \nGears :"+gears+" \nCalories burn estimation : "+caloriesBurn+" per km";
	}
}