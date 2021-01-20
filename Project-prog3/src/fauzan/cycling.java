package fauzan;

public class cycling extends outdoorSp{
	
		String sportname="Cycling";
		String gears="Water Bottles, Helmet, Rain wear, Goggles, Bicycles";
		double caloriesBurn=300.0;
		String location="Road and Offroads";

		
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
			//System.out.println("Feeling the rush of speed on a bicycles\n");
			exp=exp+"\nFeeling the rush of speed on a bicycles\n";
		}
		
		public String toString() {
			experience();
			return part+"\nSport : "+sportname+"\nLocation : "+location+" \nGears :"+gears+" \nCalories burn estimation : "+caloriesBurn+" per km"+"\nExperience :"+exp;
		}
		
	

}
