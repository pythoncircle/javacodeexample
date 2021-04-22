import java.util.*;

class Question2
{
	public static void main(String[] args)
{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scn.nextInt();

		int sum = 0;
  		for(int k = 0; k <= num; k++)
		{
			sum += k;
		} 

		System.out.println("Sum of all the numbers in this range: " + sum);
}
}