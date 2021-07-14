package week1.assignments;

import java.io.IOException;
import java.io.InputStream;

public class AmstrongNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.out.println("Enter any random number to check if is an Armstrong Number");
		
		//System.out.println("Enter any random number");
      
        int number = System.in.read();
		int original = number;
        int calculated = 0;
        int remainder;
      	  while (number!= 0)
              {
              	remainder = number%10;
              	calculated = calculated + (remainder * remainder * remainder);
              	number = number/10;
              }
          if (calculated == original)
   		 System.out.println( "It is an Amstrong number");
        else
        	System.out.println( "Is not an Amstrong number");
	}
}


 
