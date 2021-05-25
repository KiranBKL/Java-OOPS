import java.util.Scanner;
class a2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int bune=scan.nextInt();	
		int result=bunny(bune);
		System.out.println(result);
		
	}
	public static int bunny(int bune)
	{
		if(bune==0)
			return 0;
		else if(bune%2==0)
			return 3 +bunny(bune-1);
		else
			return 2 +bunny(bune-1);
	}
}
class b{}
