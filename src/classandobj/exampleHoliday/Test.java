package classandobj.exampleHoliday;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		Holiday holiday =new Holiday();	 
		holiday.setDay(6);
		holiday.setMonth("Ashoj");
		holiday.setName("constitution day");
		holiday.setHoliday(true);
		
		System.out.println(holiday.getName()+" "+holiday.getMonth());
		System.out.println(holiday.getDay()+" "+holiday.isHoliday());
		
		
	}

}
