import java.util.Scanner;
import java.lang.*;
class a2{
	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner br=new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=br.nextLine();
		int i=0,n=str.length(),j=100;
		while(i<n){
			if(str.charAt(i)=='*')
				j=i;
			i++;
		}
		i=0;
		while(i<n){
			if(i!=j && i!=j+1 && i!=j-1){
		System.out.println(str.charAt(i));}i++;
		}
	}
}