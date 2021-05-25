import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		kner k=new kner(System.in);
		int a=k.nextInt();
		int b=k.nextInt();
		int c=k.nextInt();
		if((a-b)%2==0 && (b-c)%2==0 && (a-c)%2==0)
			System.out.println(true);
		else 
			System.out.println(false);
	}
}	
		
