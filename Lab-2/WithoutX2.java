import java.util.Scanner;
import java.lang.*;
class v1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=str.length();
		if(str.charAt(0)=='x' || str.charAt(1)=='x')
		{
			for(int i=0;i<n;i++)
			{
				if(str.charAt(i)!='x')
				{
					System.out.println(str.charAt(i));
				}
			}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}	
				
