package exception.ignite;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		ProductApp pa = new ProductApp();
		
		try {
			long pro=pa.product(a,b);
			System.out.println("product is : "+pro);
			
		}catch(InvalidNumberException e) {
			e.printStackTrace();
		}

	}

}
