package exception.intel;

public class IndriveApp {
	
	public void setLocation(String location) throws InvalidLocationException{
		if(location.equals("kathmandu")){
			System.out.println("searching riders.....");
		}else {
			throw new InvalidLocationException("Your location "+location+" is invalid");
		}		
	}
}
