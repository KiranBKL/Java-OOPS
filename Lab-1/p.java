import java.lang.*;
import java.util.Scanner;
class p{
public static void main(String args[]){
int x,y=2;
System.out.println("Enter two integers to calculate");
Scanner k =new Scanner(System.in);
x=k.nextInt();
while(y!=x)
{
	if(x%y==0)
	{
		System.out.println("Given is not");
		break;
	}
	y=y+1;
}
if(y==x)
{
		System.out.println("Given is ");
}}}

