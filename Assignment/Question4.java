import java.util.*;

class Question4
{
	public static void main(String args[])
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		for(int k = 1; k <= 10; k++)
		{
			System.out.println(k*num);
		}
}
}