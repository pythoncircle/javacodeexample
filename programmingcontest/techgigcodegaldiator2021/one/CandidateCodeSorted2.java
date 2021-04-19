import java.io.*;
import java.util.*;




class CandidateCode2 {


boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1])
            return false;
    }
    return true;
}



public static String sortCharArray(char[]temp)
{
Arrays.sort(temp);
String str=new String(temp);
return str;
}
 
    public static void main(String args[] ) throws Exception {

    	Scanner in=new Scanner(System.in);

	String virusComposition=in.next();
	

	String V=sortCharArray(virusComposition.toCharArray());
        

         int peopleCount=in.nextInt();
      
         
        String []bloodCompositions=new String[peopleCount];
        String []bloodCompositionResults=new String[peopleCount];

       for(int k=0;k<peopleCount;k++)
        {
		
	bloodCompositions[k]=(in.next()).toLowerCase();
	        

	bloodCompositions[k]=sortCharArray(bloodCompositions[k].toCharArray());
         
        }



for(int k=0;k<peopleCount;k++)
{
String tempVirusComposition=virusComposition;
String currentBloodComposition=bloodCompositions[k];
char currentBloodCompositionChars[]=currentBloodComposition.toCharArray();

boolean flag=false;
 for(int m=0;m<currentBloodCompositionChars.length;m++)
   {
    char ch=currentBloodCompositionChars[m];
    int indexOfCh=	tempVirusComposition.indexOf(ch);

    if(indexOfCh==-1)
     {
     flag=true;    
     break;       
     }
     else
     {
     tempVirusComposition=tempVirusComposition.replace(Character.toString(ch),"");
     }
   }
   if(flag)
     bloodCompositionResults[k]="NEGATIVE";
   else
     bloodCompositionResults[k]="POSITIVE"; 
   }

        for(int k=0;k<peopleCount;k++)
        {
        System.out.println(bloodCompositionResults[k]);
        }

   }

}

