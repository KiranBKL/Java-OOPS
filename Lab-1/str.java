import java.lang.*;
import java.util.Scanner;
class str{
	public static void main(String args[]) {
		String s;int g,i=0,v=0,c=0,n=0;
		System.out.println("Enter");
		Scanner k=new Scanner(System.in);
		s=k.nextLine();
		g=s.length();
		while(i<g){
			char ch=s.charAt(i);
			if(ch== 'a' || ch== 'e' ||ch== 'i'|| ch== 'o'|| ch== 'u' ||ch== 'A'|| ch== 'E' ||ch== 'O'|| ch== 'U'){
				v=v+1;
			}
			else if(ch>='0'&&ch<='9'){
				n++;
			}
			else{
				c++;}
			i++;

		}
		System.out.println("vowels count"+v);
		System.out.println("consonants count"+c);
				System.out.println("numbers count"+n);

	}
}