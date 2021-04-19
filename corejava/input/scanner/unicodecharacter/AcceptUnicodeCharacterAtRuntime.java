import java.util.*;

class Solution1
{
public static void main(String[]args) throws Exception
{


Scanner in=new Scanner(System.in);

System.out.println(" Enter a single Unicode Character in format 0xdddd format d for digit");

String unicodeChar=in.next();

int num=Integer.decode(unicodeChar);

char ch=(char)num;

System.out.println(ch);


}

}

