import java.lang.*;
import java.util.Scanner;
class ain
{
public static void main(String args[])
{

	int x=1,rev,n,m,i,y,p,l,j;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	l=k.nextInt();
	while(x<=l)
	{	
		i=x;j=0;
		while(i!=0)
		{
			i=i/10;j++;
		}
		n=x;
		rev=0;
		while(n!=0)
		{
			y=n%10;m=1;
			for (p=0;p<j ;p++ ) 
			{
				m=y*m;

			}
			rev=rev+m;
			n=n/10;
		}
	//	System.out.println(rev+"ac"+x);
		if(rev==x)
		{
		System.out.println(rev);
		}
		x=x+1;
	}		
}
}
