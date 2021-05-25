import java.lang.*;
import java.util.Scanner;
class str2{
	public static void main(String args[]) {
		String s;int i=0,j,w=1,m=1;
		System.out.println("Enter");
		Scanner k=new Scanner(System.in);
		s=k.nextLine();
		j=s.length();
		while(i<j&& m<j){
			char ch=s.charAt(i);
			char ch1=s.charAt(m);
			if(ch==' '&&ch1!=' '){
				w++;
			}
			i++;m++;
		}
		System.out.println("word count"+w);

	}
}