import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int count=1,k;
		int n=scan.nextInt();
		int m=(n*(n+1))/2;
		if(n==0)
		{
			System.out.println();
		}
		else
		{
				for(int j=1;(j<=count && count<=n);j++)
				{
					if(count==j)
					{
						for(k=1;k<=j;k++)
						{
							System.out.println(k);
						}
						k=1;
					}
					count++;
				}
		}
	}
}
