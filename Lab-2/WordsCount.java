import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		System.out.println("enter the length of the array");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();	
		String[] arr=new String[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("enter the length of the strings u want;");
		int n=scan.nextInt();
		WordsCount(arr,n,m);
	}
	public static int WordsCount(String[] ar,int k,int l)
	{
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(ar[i].length()==k)count++;
		}
		System.out.println(count);
		return count;
	}
}
