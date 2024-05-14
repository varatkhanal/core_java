package classandobj.eample_two;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float r;
		Scanner input = new Scanner(System.in);	
		r=input.nextFloat();
		AreaOfCircle puja = new AreaOfCircle();
		puja.setRadius(r);
		puja.computeArea();
		double area=puja.getArea();		
		System.out.print("area :"+area);	
	}

}
