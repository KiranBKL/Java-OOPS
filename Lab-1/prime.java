import java.lang.*;
import java.util.Scanner;
class prime{
public static void main(String args[]){
int x=2,y,n;
System.out.println("Enter two integers to calculate");
Scanner k =new Scanner(System.in);
n=k.nextInt();
while(x<=n){
y=2;
while(y!=x)
{
	if(x%y==0)
	{
		break;
	}
	y=y+1;
}
if(y==x)
{
		System.out.println(y);
}x=x+1;
}}
}
