import java.lang.*;
import java.util.Scanner;
class a2{
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		String str=k.nextLine();
		StringX(str);
	}
	public static void StringX(String str2)
	{
		int l=str2.length();
		for(int i=0;i<l;i++)
		{
			if(str2.charAt(i)!='x' || i==0 || i==l-1)
			{
				System.out.print(str2.charAt(i));}
			}
	}
}