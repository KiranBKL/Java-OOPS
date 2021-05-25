import java.lang.*;
import java.util.Scanner;
class primf
{
	public static void main(String args[])
	{
		int n=2,j,u;
		System.out.println("enter the num");
		Scanner k=new Scanner(System.in);
		j=k.nextInt();
		while(n<=j)
		{
			if(j%n==0)
			{
				u=2;
				while(u!=n)
				{
					if(n%u==0){break;}
					u=u+1;
				}
				if(u==n)
				{
					System.out.println(u);
				}
			}
			n=n+1;
		}
	}
}
				
		
