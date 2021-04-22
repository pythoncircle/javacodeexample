import java.util.*;

class Question1
{
	public static void main(String[] args)

{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number in A: ");
		int a = sc.nextInt();
		
		System.out.print("Enter a number in B: ");
		int b = sc.nextInt();
                
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap A = " + a);
		System.out.println("After swap B = " + b);	
}
}