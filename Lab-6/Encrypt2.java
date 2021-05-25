import java.io.*;
class Encrypt2
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("enc.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("enc2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s="";
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		bw.close();
		fw.close();
	}
	
}
