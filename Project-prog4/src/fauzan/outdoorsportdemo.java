package fauzan;

public class outdoorsportdemo {

	public static void main(String[] args) {
		part1 pt=new part1("Loan","mayn","Male","French");
	
		print(pt);
	}
	
	public static void print(Object pt) {
		hiking hk=new hiking();
		cycling cy=new cycling();
		surfing sf=new surfing();
		
		System.out.println(pt.toString()+hk);
		hk.experience();
		System.out.println(pt.toString()+cy);
		cy.experience();
		System.out.println(pt.toString()+sf);
		sf.experience();
	}

	String print1(String a) {
		hiking hk=new hiking();
		cycling cy=new cycling();
		surfing sf=new surfing();
		String b="";
		if(a=="Hiking") {
			b=hk.toString();
		}else if(a=="Cycling") {
			b=cy.toString();
		}else if(a=="Surfing") {
			b=sf.toString();
		}
		return b;
	}
}
