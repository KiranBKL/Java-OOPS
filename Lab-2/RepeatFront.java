import java.io.*;
import java.util.*;
import java.util.*;
class RepeatFront
{
	public static void main(String args[]) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string :");
		String str=br.readLine();
		System.out.print("Enter the number :");
		int n=Integer.parseInt(br.readLine());
		RepeatFront(str,n);

	}
	static void RepeatFront(String str,int n)
	{
		while(n>0)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(str.charAt(i));
			}
			n--;
		}
	}
}