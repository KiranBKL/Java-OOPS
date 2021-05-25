import java.util.Scanner;
import java.lang.*;
class v1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int k;
		int n=str.length();
		int m=n/2;
		k=m-1;
		for(int i=m-1;i<k+2;i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
