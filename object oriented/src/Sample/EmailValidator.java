package Sample;

import java.util.Scanner;

public class EmailValidator { 
	public static void main(String[] args) { 
		String email = "zubair@male.com";  
		int iat=email.indexOf('@');  
		int idot=email.indexOf('.');  
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat > 3 
				&& idot > (iat + 3) && email.length() > (idot + 2)) 
			System.out.println("Valid Email");  
		else  
			System.out.println("Invalid Email");
		} 
}
