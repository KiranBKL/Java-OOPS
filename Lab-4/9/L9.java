import java.util.Scanner;
class L9
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the array length :");
		int n=obj.nextInt();
		int arr[]=new int[n], arr2[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			int c1=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c1++;
				}
				if(c1>=2)
					arr2[i]=arr[i];
			}
			System.out.println(arr[i]+" Count: "+c1);
		}
	}
}
