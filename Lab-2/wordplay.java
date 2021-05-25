import java.lang.*;
import java.util.Scanner;
class wordplay{
	public static void main(String[] args) {
		int i;
		System.out.print("enter 1 for iSlower()\n2 for replacevowels\n3 for emphasize");
		Scanner k=new Scanner(System.in);
		i=k.nextInt();
		if(i==1){
			char ch;
			System.out.print("enter the char");
			Scanner p=new Scanner(System.in);
			ch=p.next().charAt(0);
			System.out.println(iSlower(ch));

		}
		else if(i==2)
		{
			String s;
			System.out.println("enter the string");
			Scanner j=new Scanner(System.in);
			s=j.nextLine();
			if(i==2)
			{			
			replacevowels(s,'*');
			}
		}
		else if(i==3)
		{
			String s;
			System.out.println("enter the string");
			Scanner j=new Scanner(System.in);
			s=j.nextLine();
			char ch;
			System.out.print("enter the char");
			Scanner p=new Scanner(System.in);
			ch=p.next().charAt(0);			System.out.print(ch);

			emphasize(s,ch);
		}
		else
			{
				System.out.print("enter the correctly");
			}

	}
	public static String iSlower(char g){
		if(g>='a'&&g<='z'){
			return "true";
		}
		else{
			return "False";
		}
	}
	public static void replacevowels(String s2,char m){
		s2=s2.replace('a',m);
		s2=s2.replace('e',m);s2=s2.replace('i',m);s2=s2.replace('o',m);s2=s2.replace('u',m);s2=s2.replace('A',m);
		s2=s2.replace('U',m);s2=s2.replace('O',m);s2=s2.replace('I',m);s2=s2.replace('E',m);
		System.out.println(s2);
		}
		public static void emphasize(String c,char x)
		{	StringBuilder sb = new StringBuilder(c);
			int h=0,l;
			l=c.length();
			while(h<l){
				if(c.charAt(h)==x)
				{
					if (h%2==0) 
					{
						sb.setCharAt(h,'*');
						c= sb.toString();	
					}
					else
					{
					sb.setCharAt(h,'+');
						c= sb.toString();									

					}
				}
				h++;
			}
			
			System.out.println(c);
		}
}
