import java.lang.*;
import java.util.Scanner;
class and{
	public static void main(String args[]) {
		String s;
		System.out.println("Enter");
		Scanner k=new Scanner(System.in);
		s=k.nextLine();

		System.out.println(s.replace(" and "," or "));

	}
}