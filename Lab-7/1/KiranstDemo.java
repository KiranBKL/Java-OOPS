import java.io.*;
import java.util.*;
class PercentageException extends Exception{
	double perc;

	PercentageException(double perc)
	{
		this.perc=perc;
	}
	public String toString()
	{
		return "your percentage is below 50"+":"+perc;
	}
}
class AgeException extends Exception{
	public String toString()
	{
		return "your not eligible";
	}
}
class Student{
	String name;int age;double perc;
	Student(String name,int age,double perc)
	{
		this.name=name;
		this.age=age;
		this.perc=perc;
	}
	public String toString()
	{
		return name+";"+age+";"+perc;
	}
}
class KiranstDemo{
	public static void main(String[] args)throws PercentageException,AgeException,IOException
	{	
		String k,f;int age,j;double perc;
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("data.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.print("enter 1 for manual input and \nother for import from file");
		j=sc.nextInt();
		if(j==1)
		{
			System.out.println("enter the file name");
			f=sc.nextLine();
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s="";
			while((s=br.readLine())!=null)
			{
				StringTokenizer obj=new StringTokenizer(s," ");
				int j=0;
				while(obj.hasMoreTokens())
				{		
					obj.nextToken();	
				}
			}
		}
		else
		{
			int i=0;
			while(i<6)
			{
			k=sc.next();
			age=sc.nextInt();
			perc=sc.nextDouble();
			Student s=new Student(k,age,perc);
			this.check();
			i++;
			}
			static void check()throws PercentageException,IOException,AgeException
			{
				try
				{
					if(s.perc<50)
					{
						throw new PercentageException(s.perc);
					}
					else if (s.age<18) 
					{
						throw new AgeException();
					}
					else
					{	
						bw.write(s.name+" "+s.age+" "+s.perc+"\n");	
					}
				}
				catch(PercentageException e)
				{
					System.out.println(e);
				}
				catch(AgeException e)
				{
					System.out.println(e);
				}
			}
		}
		bw.close();
		fw.close();
	}
}

