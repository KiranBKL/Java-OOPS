import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m=k.nextInt();
		String[] arr=new String[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("enter the number of words to be printed");
		int n=k.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
