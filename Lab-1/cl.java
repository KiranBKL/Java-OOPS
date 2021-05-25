import java.lang.*;
import java.util.Scanner;

class cl{
	String name;
	int age;
	String occ;
	float earn;
	cl(String a,int az,String a3,float a4)
	{
		name=a;
		age=az;
		occ=a3;
		earn=a4;
	}
	void display(){
		System.out.println(name);
		System.out.println(age);System.out.println(occ);System.out.println(earn);
	}
}