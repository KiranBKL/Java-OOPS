import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[])throws IOExceptions
	{
		Scanner br=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=br.nextLine();
		BobThere(str);
	}
	static void BobThere(String str)
	{
		int n=str.length();
		int found=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='b' && str.charAt(i+2)=='b')
			{
				found=1;
				break;
			}
		}
		if(found==1)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
class b{}