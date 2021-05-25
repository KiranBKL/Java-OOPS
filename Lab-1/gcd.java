import java.lang.*;
import java.util.Scanner;
class gcd{
	public static void main(String args[]){
		int n,m,r;
		Scanner k=new Scanner(System.in);
		n=k.nextInt();m=k.nextInt();
		if(n==m){
		System.out.println("gcd is"+n);}
		else {
			if(n>m)
			{
				while(n%m!=0)
				{
					r=n%m;
					n=m;
					m=r;
				}
			System.out.println("gcd is"+m);
			}
			else {
			while(m%n!=0)
			{
				r=m%n;
				m=n;
				n=r;
			}
		System.out.println("gcd is"+n);}}
}}
