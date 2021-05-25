import java.lang.*;
import java.util.Scanner;
class sumofdigit{
public static void main(String args[])
{
	int x,y,sum=0;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	x=k.nextInt();;
	
	while(x!=0)
	{
		y=x%10;
		sum=y+sum;
		x=x/10;
	}
	System.out.println("the sum is"+sum);
}}
