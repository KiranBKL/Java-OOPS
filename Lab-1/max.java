import java.lang.*;
import java.util.Scanner;
class max{
	public static void main(String args[]){
	int x,y,z;
	System.out.println("enter the numbers");
	Scanner k=new Scanner(System.in);
	x=k.nextInt();
	y=k.nextInt();
	z=k.nextInt();
	if(x>y){
		if(x>z){
			System.out.println("greater is "+x);
		}
		else{
		System.out.println("greater is "+z);
	}}
else{
		if(y>z){
		System.out.println("greater is"+y);
		}
		else{
		System.out.println("greater is"+z);
}
	}
	
}
}
