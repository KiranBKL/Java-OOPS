import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the array :");
		int n=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element at array["+i+"] :");
			int val=Integer.parseInt(br.readLine());
			array[i]=val;
		}
		boolean bool=Lucky13(array,n);
		System.out.println(bool);
	}
	static boolean Lucky13(int array[],int n)
	{
		int found=1;
		for(int i=0;i<n;i++)
		{
			if(array[i]==1 || array[i]==3)
			{
				found=0;
			}
		}
		if(found==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}