import java.io.*;
import java.util.StringTokenizer;
class kiran
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fr=new FileWriter("jj.txt");
		BufferedWriter br=new BufferedWriter(fr);
		String s="";
		for(int i=2;i<=200;i=i+2)
			br.write(i+"  ");
		br.close();
		fr.close();
	}
	
}
