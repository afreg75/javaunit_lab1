package dateLab;

import java.time.LocalDate; // Importing LocalDate
import java.time.Period;  // Importing Period
import java.util.Scanner; // allows to capture user entry



public class JavaDate {
	static String earliestDateString = null;
	static String newestDateString = null;
	
	
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner (System.in);
		boolean isvalid = false;
				
			// Prompts user entry
		while (!isvalid) {	
		    System.out.println("Enter two dates, earliest then newest date, enter in format yyyy-MM-dd hit enter after each: ");
			earliestDateString = scnr.next();  //Captures first entry
			newestDateString = scnr.next();   //Captures second entry
			
			if(earliestDateString.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}") && newestDateString.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")){ 
				isvalid = true;
			
			
			LocalDate newestDate = LocalDate.parse(newestDateString);  // obtains localDate time formatter
			
			LocalDate earliestDate = LocalDate.parse(earliestDateString); // obtains localDate time formatter
			
												
			System.out.println("You entered " + earliestDate + " for earliest date."); // validates to user input
			System.out.println("You entered " + newestDate + " for newest date.");  // validates to user input
			
				Period difference = newestDate.until(earliestDate); //Do calculations for difference between dates
				int days = difference.getDays();
				int months = difference.getMonths();
				int years = difference.getYears();
				scnr.close();
			
				System.out.println(" It's been: " + years + " Years " + days + " Days " + months + " Months");
			}
			else {
				System.out.println("Please enter correct date format yyyy-MM-dd.");
			}
		}		
	}
}

		 
