import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string :");
		String str1=br.readLine();
		StringBuffer str=new StringBuffer(str1);
		int n=str.length();
		RmPattern(str,n);
	}
	static void RmPattern(StringBuffer str,int n)
	{
		
		for(int i=0;i<n-2;i++)
		{
			if(str.charAt(i)=='r' && str.charAt(i+1)!='r' && str.charAt(i+2)=='m')
			{
				str.delete(i+1,i+2);
			}
			
		}
		System.out.println(str);
	}
}
