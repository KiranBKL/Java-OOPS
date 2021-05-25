import java.lang.*;
import java.util.Scanner;
class perinrange
{
public static void main(String args[])
{
int n=6,x=1,j=0,l;
Scanner k=new Scanner(System.in);
l=k.nextInt();
while(n<=l){
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
	System.out.println(j);
}
n=n+1;
}

}
}
