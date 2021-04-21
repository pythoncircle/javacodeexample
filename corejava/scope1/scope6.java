import java.io.*;


class Scope6
{
public static void main(String args[]) throws IOException
{
DataInputStream abc=new DataInputStream(System.in);

String line=abc.readLine();

int num=Integer.parseInt(line);

if(num>100)
{
int value=num+500;
}
else
{
int value=num+200;
}

System.out.printf("num is %d %n",num);
System.out.printf("value is %d %n",value);


}
}