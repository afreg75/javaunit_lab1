package javalab1;

import java.util.Scanner;

public class JavaLab {
	
	public static void main (String [] args) {
		int number1 = 0;
        int number2 = 0;
		String numberString1 = null;
        String numberString2 = null;

        Scanner scnr = new Scanner(System.in);   //allows to capture user entry
        boolean isvalid = false;

        //Loop will run while the input is not valid.
        while (!isvalid) {
            System.out.println("Enter two three digit numbers, hitting enter after each. "); //asking user to enter numbers.
            number1 = scnr.nextInt();     // allows to capture user entry.123
            number2 = scnr.nextInt();    // allows to capture second user entry.

            System.out.println("You have entered: " + number1 + " and " + number2);  // validates entry to user.

            //Convert integers to strings
            numberString1 = Integer.toString(number1);
            numberString2 = Integer.toString(number2);

            //Check input is valid matching string to 3 occurrences of an number 0-9
            if (numberString1.matches("[0-9]{3}") && numberString2.matches("[0-9]{3}")) {
                //Split strings into sting arrays
                String[] numberArray1 = numberString1.split("");
                String[] numberArray2 = numberString2.split("");

                //Check whether individual ints sum to the same value, i
                if ((Integer.valueOf(numberArray1[0]) + Integer.valueOf(numberArray2[0]) == Integer.valueOf(numberArray1[1]) + Integer.valueOf(numberArray2[1]))
                        && (Integer.valueOf(numberArray1[0]) + Integer.valueOf(numberArray2[0]) == Integer.valueOf(numberArray1[2]) + Integer.valueOf(numberArray2[2]))) {
                    System.out.println("True");
                    isvalid = true;
                    
                } else {
                    System.out.println("False");
                }
                
            } else {
                System.out.println("Please enter two valid 3 digit integer");
            }
        }
    }
}
