 import java.util.Scanner;
import java.lang.*;
class a2
{
	public static void main(String[] args) {
		int i,j,l,length,r,c=0,m=0;
		System.out.println("Enter the string length");
		Scanner k=new Scanner(System.in);
		length=k.nextInt();
		int arr[]=new int[length];
		for(i=0;i<length;i++)
		{
			arr[i]=k.nextInt();
		}
		i=0;
		while(i<length){
			r=length-1;
			while(r>=i)
			{
					j=i;
					l=r;
					//System.out.println(arr[j]+"and"+arr[l]);
					c=0;
					for(;arr[j]==arr[l]&&j!=l;j++)
					{
						System.out.println(arr[j]+"and"+arr[l]);
						c++;l--;
						
					}
					System.out.println("\n");
					if(c>=m){
						m=c;
					}
					r--;
			}
			i++;
		}
		System.out.println(m);
	}
}