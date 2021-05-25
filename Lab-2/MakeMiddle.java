import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the even length of the array :");
		int n=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element array["+i+"] :");
			int val=Integer.parseInt(br.readLine());
			array[i]=val;
		}
		if(n<=2)
		{
			System.out.print("{");
			for(int i=0;i<n-1;i++)
			{
				System.out.print(array[i]+",");
			}
			System.out.print(array[n-1]);
			System.out.println("}");
		}
		else
		{
			System.out.print("{");
			for(int i=(n/2)-1;i<(n/2);i++)
			{
				System.out.print(array[i]+",");
			}
			System.out.print(array[(n/2)]);
			System.out.println("}");
		}

	}
}