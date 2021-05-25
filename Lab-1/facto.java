import java.lang.*;
import java.util.Scanner;
class facto{
public static void main(String args[]){
int n,f=1;
System.out.println("enter the num");
Scanner k=new Scanner(System.in);
n=k.nextInt();
if(n==0)
{
	System.out.println("factorial is 1");
}
else{
while(n>0)
{
	f=n*f;
	n=n-1;
}
System.out.println("factorial is "+f);
}}}
