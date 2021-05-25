import java.util.Scanner;
class L8
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.print("After Sorting :");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
}
