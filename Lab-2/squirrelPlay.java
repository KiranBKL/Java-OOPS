import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);
		int n=k.nextInt();
		boolean summer=k.nextBoolean();
		if(summer==true)
		{
			if(n<=60 || n<=100)System.out.println(true);
			else System.out.println(false);
		}
		else 
		{
			if(n<=60 || n<=90)System.out.println(true);
			else System.out.println(false);
		}
	}
}
