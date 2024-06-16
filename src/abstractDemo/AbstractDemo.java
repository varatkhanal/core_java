package abstractDemo;

import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApexBOD a = new ApexBOD();
		
		//Scanner scan = new Scanner(System.in);
		PokharaUniversity.display();
		//PokharaUniversity.show();
		
		PokharaUniversity bachelorProgram = new BCSITDepartment();
		bachelorProgram.attendance();
		//bcsitDepart.labEvaluation();
		bachelorProgram.summerProject();
		bachelorProgram.show();
		//bcsitDepart.toString();
		
		bachelorProgram = new BBADepartment();
		bachelorProgram.attendance();
		//bbaDepart.internalAssesment();
		bachelorProgram.summerProject();
	}

}
