import java.util.*;

class Question3
{
	public static void main(String args[])
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to be checked: ");
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Number entered is even");
		}

		else
		{
			System.out.println("Number entered is odd");
		}		
}
}