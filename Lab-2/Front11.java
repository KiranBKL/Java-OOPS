import java.util.Scanner;
import java.lang.*;
class a2{
	public static void main(String[] args) {
		int i;
		System.out.println("Enter the length");
		Scanner k=new Scanner(System.in);
		int m=k.nextInt();
		int arr[]=new int[m];
		int arr2[]=new int[m];
		for(i=0;i<m;i++){
			arr[i]=k.nextInt();
		}
		System.out.println("\n");
		for (i=0;i<m ;i++ ) {
			arr2[i]=k.nextInt();			
		}
		System.out.println(arr[0]+","+arr2[0]);
	}
}