package week1.assignments;

public class Fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int range = 8;
		int first_number, second_number;
		first_number = 0;
		second_number = 1;
		int third_number;
		for ( int i = 1; i<=range; i++)
		{
		System.out.println(first_number);
		third_number = first_number + second_number;
		first_number = second_number;
		second_number = third_number;
		
		}
	}

}
