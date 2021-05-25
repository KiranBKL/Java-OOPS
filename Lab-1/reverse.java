import java.lang.*;
import java.util.Scanner;
class reverse{
public static void main(String args[])
{
	int x,y,sum=0,rev;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	x=k.nextInt();;
	rev=0;
	while(x!=0)
	{
		y=x%10;
		rev=y+rev*10;
		x=x/10;
	}
	System.out.println("the reverse is"+rev);
}}
