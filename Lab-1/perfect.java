import java.lang.*;
import java.util.Scanner;
class perfect
{
public static void main(String args[])
{
int n,x=1,j=0;
Scanner k=new Scanner(System.in);
n=k.nextInt();
while(x<=n/2)
{
	if(n%x==0)
	{
		j=j+x;
	}
	x=x+1;
}
if(j==n)
{
	System.out.println("This is perfect number");
}
else{
		System.out.println("This is not perfect number");
}
}
}
