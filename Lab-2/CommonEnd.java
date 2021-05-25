import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the first array :");
		int n=Integer.parseInt(br.readLine());
		System.out.print("Enter the size of the second array :");
		int n1=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		int array1[]=new int[n1];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element at array["+i+"] :");
			int ele=Integer.parseInt(br.readLine());
			array[i]=ele;
		}
		for(int i=0;i<n1;i++)
		{
			System.out.print("Enter the element at array1["+i+"] :");
			int ele1=Integer.parseInt(br.readLine());
			array1[i]=ele1;
		}
		Boolean bool=CommonEnd(array,array1,n,n1);
		System.out.println(bool);
	}
	static Boolean CommonEnd(int array[],int array1[],int n,int n1)
	{
		if(array[0]==array1[0] || array[n-1]==array1[n1-1])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}