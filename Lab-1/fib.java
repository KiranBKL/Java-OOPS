import java.lang.*;
import java.util.Scanner;
class fib{
	public static void main(String args[]){
	int x=0,y=1,n,z=1;
	System.out.println("Enter two integers to calculate");
	Scanner k =new Scanner(System.in);
	n=k.nextInt();
	while(x<=n){
		System.out.println(x);
		z=x+y;
		x=y;
		y=z;
}
	
}
}
