import java.io.*;
import java.util.*;
import java.lang.*;
class a2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string :");
		String str1=br.readLine();
		StringBuffer str=new StringBuffer(str1);
		int len=str.length();
		ParentBit(str,len);
	}
	static void ParentBit(StringBuffer str,int n)
	{
		
		for(int i=0;i<n;i++)
		{
			int start=0;
			if(str.charAt(i)=='(')
			{
				start=i;
				for(int k=i+1;k<n;k++)
				{
					if(str.charAt(k)==')')
					{
						end=k;
						for(int l=i;l<=k;l++)
						{
							System.out.print(str.charAt(l));
						}
						
						
					}

				}
				
				
			}

		}

	}
}