import java.lang.*;
import java.util.Scanner;
class perf{
public static void main(String args[]){
	int a=1,n;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	n=k.nextInt();
	while(a*a<=n)	
	{
		System.out.println(a*a);
		a=a+1;
	}
}
}





























