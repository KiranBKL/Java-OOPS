import java.io.*;
class WordPlay
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("Char.txt");
		BufferedReader br=new BufferedReader(fr);
		String s="";
		while((s=br.readLine())!=null)
		{
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='a' || (ch)=='e'  || (ch)=='i'  || (ch)=='o'  || (ch)=='u'  || (ch)=='A'  || (ch)=='E'  || (ch)=='I'  || (ch)=='O'  || (ch)=='U' )
					System.out.println("True");
				else
					System.out.println("False");
			}	
		}
	}
	
}

