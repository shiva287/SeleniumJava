package week1.assignments;

import java.util.Arrays;

public class MissingelementsofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] original = {  3, 4, 6, 1, 2};
		Arrays.sort(original);
		
		for(int i=1; i<=original.length ; i++)
		{
			if (i != original[i-1])
			{
				System.out.println("missing number is " + i);
			}
		}
	

	}

}
