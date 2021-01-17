package sasikala;

public class Participant {
	private String firstName;
	private String lastName;
	private String address;
	
	public Participant (String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
		}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String toString() {
		return firstName + lastName;
		
	}
	public String getaddress() {
		return address;
	}

}
