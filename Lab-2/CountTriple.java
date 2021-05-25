import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String :");
		String str=br.readLine();
		int c=CountTriple(str);
		System.out.println("The Triple count is :"+c);
		
	}
	static int CountTriple(String str)
	{
		int n=str.length();
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			if(str.charAt(i)==str.charAt(i+1)&& str.charAt(i+1)==str.charAt(i+2))
			{
				count++;
			}
		}
		return count;
	}
}