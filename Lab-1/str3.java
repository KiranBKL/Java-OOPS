import java.lang.*;
import java.util.Scanner;
class str3{
	public static void main(String args[]) {
		String s;int i=0,j,w=0;
		System.out.println("Enter");
		Scanner k=new Scanner(System.in);
		s=k.nextLine();
		StringBuffer s1=new StringBuffer(s);
		j=s.length();
		
		while(i<=j){
			char ch=s1.charAt(i);
			if(ch=='c'){
				s1=s1.deletecharAt(i);
			}
			i++;
		}
	System.out.println(s1);

	}
}