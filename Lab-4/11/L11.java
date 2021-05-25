import java.util.*;
class L11
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number of rows and colomns :");
		int m=obj.nextInt(),n=obj.nextInt();
		int arr1[][]=new arr1[m][n];
		int arr2[][]=new arr2[m][n];
		int arr3[][]=new arr3[m][n];
		System.out.println("Enter the first Matrix :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				arr1[i][j]=obj.nextInt();
		}
		System.out.println("Enter the Second Matrix :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				arr2[i][j]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				arr3[i][j]=arr1[i][j]+arr2[i][j];
		}
		System.out.println("Addition of the Matrix :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(arr3[i][j]);
			System.out.println("");
		}
	}
}
