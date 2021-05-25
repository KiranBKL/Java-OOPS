import java.io.*;
import java.util.*;
class L10
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String array length:");
		String s=br.readLine();
		int n=Integer.parseInt(s);
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=br.readLine();
		//ArraysToMethod m = new ArraysToMethod();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				System.out.println(arr[j].compareTo(arr[j+1]));
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			disply(n,arr);
			}			
		}
		System.out.println("\n\nAfter Sorting:\n");
		
	}
	public static void disply(int n,String[] arr){
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
