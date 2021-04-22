import java.io.*;



class While3
{

public static void main(String args[]) throws IOException
{

int n='c';

while(n!='a')
{
System.out.println(" u just entered "+n);
System.out.println(" enter a to stop");
n=System.in.read();
}


}
}