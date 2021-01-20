package fauzan;

abstract class participant {//abstract
	abstract void setFirstname(String firstN);
	abstract void setLastname(String lastN);
	abstract void setRace(String race);
	abstract void setgend(String gender);
	abstract String getFirstname();
	abstract String getLastname();
	abstract String getGender();
	abstract String getRace();
}

class part1 extends participant{
	String Firstname;
	String Lastname;
	String Gender;
	String race;

	part1(String firstN,String lastN,String gender,String Race){
		this.Firstname=firstN;
		this.Lastname=lastN;
		this.Gender=gender;
		this.race=Race;
	}
	
	void setFirstname(String firstN) {
		this.Firstname=firstN;
	}
	void setLastname(String lastN) {
		this.Lastname=lastN;
	}
	void setRace(String race) {
		this.race=race;
	}
	void setgend(String gender) {
		this.Gender=gender;
	}
	
	String getFirstname() {
		return Firstname;
	}
	
	String getLastname() {
		return Lastname;
	}
	String getGender() {
		return Gender;
	}
	String getRace() {
		return race;
	}
	
	public String toString() {
		return "Participant name : "+Firstname+" "+Lastname+"\nGender : "+Gender+"\nRace :"+race;
	}
}

