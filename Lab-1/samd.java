import java.lang.*;
import java.util.Scanner;
class samd
{
public static void main(String args[])
{
	int n,m,d=0,j=1,i=1,k=1,g;
	System.out.println("enter the num");
	Scanner p=new Scanner(System.in);
	n=p.nextInt();
	g=n;
	while(n>0)
	{
		d=d+1;
		n=n/10;
	}
	while(i<=d)
	{
		m=1;
		while(m<10)
		{	
			if(m*j>g){ return;}
			System.out.println(m*j);
			m++;
		}	
		k=k*10;
		j=j+k;
		i++;
	}
}
}




