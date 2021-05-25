import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		int result=0,k=0;
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String substr=scan.next();
		int m=str.length();
		int n=substr.length();
		if(m<n || m==0)
		{
			System.out.println('0');
		}
		else
		{
			for(int i=0;i<m;i++)
			{
				if(str.startsWith(substr))
				{
					result=str.lastIndexOf(substr)+n;
				}
				else
				{
					
					str=str.substring(1);
				}
			}
		}
		System.out.println(result);
	}
}
					
				
