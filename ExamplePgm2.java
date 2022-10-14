import java.util.Scanner;
public class ExamplePgm2  
	{
		public static void main(String[] args) 
		{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the values");
	String str=s.nextLine();
	String str2="";
	for(int i=str.length()-1;i>=0;i--)
	{     
		char ch=str.charAt(i);
		char ch1=0;
		if(i==0)
		{
			ch1=(char) (ch+str.length()-2);
		}
		else if(i==2)
		{
			ch1=(char)((char)ch+1);
			
			}
		else if(i==1)
		{
			ch1=(char)((char)ch+2);
		}
		str2 +=ch1;
	}
	System.out.println("output"+" "+str2);
}
	}


