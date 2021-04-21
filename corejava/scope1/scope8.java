import java.io.*;

//bad programming practice as no prompting

class Scope8
{
public static void main(String args[]) throws IOException
{
DataInputStream abc=new DataInputStream(System.in);

String line=abc.readLine();

int num=Integer.parseInt(line);

if(num>100)
{
int value=num+500;
System.out.printf("value is %d %n",value);
}
else
{
int value=num+200;
System.out.printf("value is %d %n",value);
}

System.out.printf("num is %d %n",num);



}
}