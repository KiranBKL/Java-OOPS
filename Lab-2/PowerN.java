import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int base=scan.nextInt();
		int power=scan.nextInt();
		int result=pow(base,power);
		System.out.println(result);
		
	}
	public static int pow(int base,int power)
	{
		if(power==1)
		{
			return base;
		}
		return (base*pow(base,power-1));
	}
}
