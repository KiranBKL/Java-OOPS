import java.lang.*;
import java.util.Scanner;
class arm{
public static void main(String args[])
{

	int x,rev,n,m,i,j=0,y,p;
	System.out.println("enter the num");
	Scanner k=new Scanner(System.in);
	x=k.nextInt();
	i=x;
	while(i!=0){
		i=i/10;j++;
	}
	n=x;
	rev=0;
	while(x!=0)
	{
		y=x%10;m=1;
		for (p=0;p<j ;p++ ) {
			m=y*m;
		}
		rev=rev+m;
		x=x/10;
	}
	if(rev==n){
	System.out.println("this is armstrong number");
	}
	else{System.out.println("this is not armstrong");
	}		
}
}