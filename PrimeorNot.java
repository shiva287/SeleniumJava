package week1.assignments;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 47;
		int n = number/2;
		boolean flag = false;
		 	
		for (int i = 2 ; i <= n; i++)
		{
			
			if (number%i == 0)
			{
			 flag = true;
			 break;
			}
			
		}
		
		if (flag == true )
			System.out.println("Number is not a prime number");
		else 
			System.out.println("Number is a prime number");
		}
		
	
}
