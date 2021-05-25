import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array :");
		int n=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element at array["+i+"] :");
			int val=Integer.parseInt(br.readLine());
			array[i]=val;
		}
		boolean bool=HaveThree(array,n);
		System.out.println(bool);
	}
	static boolean HaveThree(int array[],int n)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(array[i]==3 && array[i+1]!=3)
			{
				count++;
			}
		}
		if((array[n-3]!=3 && array[n-2]==3 && array[n-1]!=3) || (array[n-3]==3 && array[n-2]!=3 && array[n-1]==3) )
		{
			count++;
		}
		if(count==3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}