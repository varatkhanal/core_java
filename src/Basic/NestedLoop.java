package Basic;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){ //0,1,2,3,4,5,6,7,8,9 
			System.out.println("outer for loop"); 
			System.out.println("-----------------------"); 
			for(int j=0;j<5;j++){ //0,1,2,3,4,5,6,7,8,9
				System.out.println("inner for loop"); //100 times
			} 

		}
	}

}
