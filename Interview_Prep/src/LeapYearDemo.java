import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LeapYearDemo {

	public static void main(String[] args) {
		// Leap year demo
		
		//User need to enter input year
		
		Scanner scr = new Scanner(System.in);
		int year;
		System.out.print("Enter a year  = ");
		year=scr.nextInt();
		scr.close();
		
	//modified test scripts from eclipse and commit==========
		
		//update from Github and commit-------3rd time
		
		if (year % 4 == 0 && year % 100 !=0){
			
			System.out.println(year + "  Is a Leap Year" + "  ");
		}
		else if (year % 400 == 0){
			
			System.out.println(year + "   Is a leap year" + "   ");
		}
		
	else {
			System.out.println(year + "   Is not a leap year" + "   ");
		}
	}

}
