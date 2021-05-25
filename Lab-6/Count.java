import java.io.*;
import java.util.StringTokenizer;
import java.util.StringTokenizer.*;
class Count
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("input.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		int wc=0,cc=0,lc=0,sc=0,dc=0,spc=0;
		while((s=br.readLine())!=null)
		{
			StringTokenizer obj=new StringTokenizer(s," ");
			int j=0;
			while(obj.hasMoreTokens())
			{	//System.out.println(obj.hasMoreTokens());
				//System.out.println(obj.nextToken());
				obj.nextToken();
				wc++;
			}
			System.out.println(s);
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)>='a' && s.charAt(i)<='z' ) || s.charAt(i)>='A' && s.charAt(i)<='Z')
					cc++;
				else if((s.charAt(i))==' ')
					sc++;
				
				else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
					dc++;
				else
					spc++;
			}
			lc++;
		}
		System.out.println("Word Count : "+wc);
		System.out.println("Character Count : "+cc);
		System.out.println("Line Count : "+lc);
		System.out.println("Digit Count : "+dc);
		System.out.println("Space Count : "+sc);
		System.out.println("Special Characters Count : "+spc);
	}
}
