import java.util.Scanner;

public class LabNumber3App {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int userInput;
		String userName;
		
	
			System.out.println("Can you please enter your first name?");
			userName = scnr.next();
		
			System.out.println("Hello " + userName + ", Please enter a Number between 1 and 100.");
			userInput= scnr.nextInt();
			
					if (userInput < 1 || userInput > 100) {
			    System.out.println(userName + ", you have entered "+ userInput + " please enter a Number between 1 and 100");	
		
			}
			
			else if	(userInput % 2 == 0 && userInput <= 25) {
			System.out.println(userName + ", you have entered " + userInput + ",  the number is even and less than 25");
		    }
			else if	(userInput % 2 == 0 && userInput <= 60) {
				System.out.println(userName + ", you have entered " + userInput + ",  the number is even");
			    }
			else if	(userInput % 2 == 0 && userInput > 60) {
				System.out.println(userName + ", you have entered " + userInput + ",  the number and greater than 60");
			    }
			else if (userInput % 2 != 0 && userInput > 60) {
				System.out.println(userName + ", you have entered " + userInput + ", the number is odd and greater than 60");    			
		  }
			else 
				System.out.println(userName + ", you have entered " + userInput + ",  the number is odd");
			
			scnr.close();
	}
			
}
