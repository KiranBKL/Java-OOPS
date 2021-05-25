import java.lang.*;
import java.util.Scanner;
class palindrome{
public static void main(String args[])
{
	int x,y,sum=0,rev,n;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	x=k.nextInt();
	n=x;
	rev=0;
	while(x!=0)
	{
		y=x%10;
		rev=y+rev*10;
		x=x/10;
	}
	if(rev==n){
	System.out.println("this is palindrome");
}
	else{System.out.println("this is not palindrome");
}}
}
