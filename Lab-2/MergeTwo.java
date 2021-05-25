import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		int count=0,i,j;
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m=scan.nextInt();
		System.out.println("enter the elements of the 1array without duplicates");
		char[] arr1=new char[m];
		for(i=0;i<m;i++)
		{
			arr1[i]=scan.next().charAt(0);
		}
		System.out.println("enter the elements of the 2array without duplicates");
		char[] arr2=new char[m];
		for(i=0;i<m;i++)
		{
			arr2[i]=scan.next().charAt(0);
		}
		System.out.println("enter the number to print upto that number:");
		int z=scan.nextInt();
		char[] arr3=new char[z];
		//int[] b=new int[];
		for(i=0;i<z;i++)
		{
			arr3[i]=arr1[i];
			for(j=0;j<m;j++){
				if(arr3[i]>arr2[j])
				{
					int h=0;
					for(char b:arr3)
					{
						if(arr2[j]==b)
						{
							h=1;
						}
					}
					if(h==0)
					{
						arr3[i]=arr2[j];
					}
				}
				if(arr3[i]>arr1[j])
				{
					int h=0;
					for(char b:arr3)
					{
						if(arr1[j]==b)
						{
							h=1;
						}
					}
					if(h==0)
					{
						arr3[i]=arr1[j];
					}
				}
			}
		}
		for (i=0;i<z ;i++ ) 
		{
		System.out.println(arr3[i]);
		}
	}
}