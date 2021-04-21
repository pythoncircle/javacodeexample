import java.io.*;



class Scope10
{
public static void main(String args[]) throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a value ");

String line=br.readLine();

int num=Integer.parseInt(line);

if(num>1000)
{
int value=num+5000;
System.out.printf("value is %d %n",value);
}
else
{
int value=num+2000;
System.out.printf("value is %d %n",value);
}

System.out.printf("num is %d %n",num);



}
}