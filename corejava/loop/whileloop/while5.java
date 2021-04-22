import java.util.*;



class While5
{

public static void main(String args[])
{

Scanner abc=new Scanner(System.in);

int k=15;

while(k>0 && k<20)
{
System.out.println(" enter a number in the rane of 1-20 ");
k=abc.nextInt();
System.out.println(" u just entered "+k);
}


}
}