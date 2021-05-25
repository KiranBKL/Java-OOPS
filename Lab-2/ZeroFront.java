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
		ZeroFront(array,n);

	}
	static void ZeroFront(int array[],int n)
	{
		int array1[]=new int[n];
		int k=0;
		for(int a=0;a<n;a++)
		{
			if(array[a]==0)
			{
				array1[k]=0;
				k++;
			}
		}
		for(int b=0;b<n;b++)
		{
			if(array[b]==0)
			{
				continue;
			}
			else
			{
				array1[k]=array[b];
				k++;
			}
		}
		System.out.print("{");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(array1[i]+",");
		}
		System.out.print(array1[n-1]);
		System.out.println("}");
	}
}