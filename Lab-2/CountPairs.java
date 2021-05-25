import java.util.Scanner;
import java.lang.*;
class a2

{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int count=0;
		String str=scan.next();
		int n=str.length();
		int a=n/2;
		for(int i=0;i<a;i++)
		{
			if(str.charAt(i)==str.charAt(i+2))
			{
				 count++;
			}
		}
		System.out.println(count);
	}
}

		
