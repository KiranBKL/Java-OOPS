
import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		kner k=new kner(System.in);
		int a=k.nextInt();
		int b=k.nextInt();
		int c=k.nextInt();
		boolean equalOk=k.nextBoolean();
		if(equalOk==true)
		{
			if((a==b && b==c) || (a==b && b<c) || (a<b && b==c) || (a<b && b<c))
					System.out.println(true);
			else
					System.out.println(false);
		}
		else
		{
			if(a<b && b<c)
				System.out.println(true);
			else
				System.out.println(false);
		}
	}
}
