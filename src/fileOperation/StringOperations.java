package fileOperation;

import java.util.ArrayList;



public class StringOperations {
	String strOne="rusty";
	String strTwo="phebs";
	String strThree="melon";
	
	ArrayList<String> al = new ArrayList<String>();
	String[] strArr= new String[25];
	
	public void mixup(String str) {
		for(int i= 0; i<strOne.length();i++) {
			String temp=strThree;
			for(char ch:strOne.toCharArray()) {
				temp=temp.replace(temp.charAt(i),ch);
				al.add(temp);
			}	
			
		}
	}
	
	public static void main(String[] args) {
		
		StringOperations so = new StringOperations();
		
		so.al.add(so.strThree);
		for(int i= 0; i<so.strOne.length();i++) {
			String temp=so.strThree;
			for(char ch:so.strOne.toCharArray()) {
				temp=temp.replace(temp.charAt(i),ch);
				so.al.add(temp);
			}	
			
		}
		for(int i= 0; i<so.strOne.length();i++) {	
			for(char chh:so.strTwo.toCharArray()) {
				so.strThree=so.strThree.replace(so.strThree.charAt(i),chh);
				so.al.add(so.strThree);
			}
		}
		
		for(String str:so.al) {
			System.out.println(str);
		}  
		System.out.println(so.al.size());
	}
}

/*
dcba
edcb
decb

decb
decb
cecb
becb
aecb

*/









