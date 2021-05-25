import java.io.*;
class Encrypt3
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("encrypt.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s="";
		while((s=br.readLine())!=null)
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='w')
				{
					int e=((int)(s.charAt(i)))+3;
					bw.write((char)e);
				}
				else if(s.charAt(i)>='x' && s.charAt(i)<='z')
				{
					int e=((int)(s.charAt(i)))-23;
					bw.write((char)e);
				}
				else
				{
					bw.write(s.charAt(i));
				}
			}
		}
		bw.close();
		fw.close();
	}
	
}
