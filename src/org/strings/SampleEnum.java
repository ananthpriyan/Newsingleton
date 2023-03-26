package org.strings;

public class SampleEnum {

	
	enum Actors{
		
		AJITH,VIJAY,RAJINI,KAMAL,VIKRAM
		
	}
	public static void main(String[] args) {
		
		Days[] values = Days.values();
		
		Actors[] actor=Actors.values();

		System.out.println(actor[3]+"----->"+actor[3].ordinal());
		
		System.out.println(values[4]);
		
		
		for (Days val : values) {
			
			
			System.out.println(val);
			
		}
		
		for (int i = 2; i < values.length; i++) {
			
			System.out.println(values[i]+"----->"+values[i].ordinal());
			
		}
		
		System.out.println(".......Using Enhanced for loop.......");
		for (Days days : values) {
			
			System.out.println(days);
			
		}
		System.out.println("Actors name list................");
		for (Actors actors : actor) {
			
			System.out.println(actors);
			
		}
	
		
	}

	
	
}
