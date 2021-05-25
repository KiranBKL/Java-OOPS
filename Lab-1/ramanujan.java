import java.lang.*;
import java.util.Scanner;
class ramanujan{
	public static void main(String[] args) {
		int n,m=1,j=2,k;
		System.out.println("enter the number");
		Scanner p=new Scanner(System.in);
		n=p.nextInt();
		while(true)
		{
			k=m*m*m+j*j*j;
			if(k>n){return;}
			System.out.println(k);
			m=j;
			j=j+1;
		}
	}
}