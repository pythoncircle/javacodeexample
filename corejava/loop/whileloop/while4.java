import java.io.*;



class While4
{

public static void main(String args[]) throws IOException
{

char n='c';

while(n!='a')
{
System.out.println(" u just entered "+n);
System.out.println(" enter a to stop");
n=(char)(System.in.read());

}


}
}