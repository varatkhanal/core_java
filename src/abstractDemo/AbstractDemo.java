package abstractDemo;

import java.util.Scanner;

import bod.BBADepartment;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApexBOD a = new ApexBOD();
		
		//Scanner scan = new Scanner(System.in);
		
		BCSITDepartment bcsitDepart = new BCSITDepartment();
		bcsitDepart.attendance();
		bcsitDepart.labEvaluation();
		bcsitDepart.summerProject();
		//bcsitDepart.toString();
		
		BBADepartment bbaDepart = new BBADepartment();
		//bbaDepart.attendance();
		bbaDepart.internalAssesment();
		bbaDepart.summerProject();
	}

}
