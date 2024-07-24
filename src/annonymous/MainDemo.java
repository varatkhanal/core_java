package annonymous;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting grm =  new Greeting();
			grm.english("aditya");
				
		Greeting gr = new Greeting() {
			public void english(String name) {
				System.out.println("Namaste "+name);
			}	
		};
		gr.english("nisha");
		
		
		//this in java 7 style 
		Greet greet = new Greet() {			
			public void morningGreet(String when) {
				System.out.println(when+" good morning");
			}
		};
		greet.morningGreet("sunday");
		
		//java 8 and beyond lamda function : interface must contain only one method
		Greet gre = (b)->{
			System.out.println(b+" good night");
		};
		
		gre.morningGreet("monday");
		
		
		
	}

}
