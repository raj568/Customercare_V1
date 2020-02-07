package javaprog;

import java.util.Scanner;

interface opera{
	void sum(int a,int b);
	void sub(int a,int b);

}
abstract  class student implements opera{
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("addition of 2 numbers is"+c);
	}
	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("addition of 2 numbers is"+c);
	}
	abstract void mul(int a,int b);
	abstract void div(int a, int b);
}
class Record extends student{
	void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("multiplication of 2 numbers"+c);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("division of 2 numbers"+c);
		
	}
}

public class Abstimp  {

	public static void main(String[] args) {
		Record obj=new Record();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		obj.sum(10,20);
		obj.sub(10,20);
		obj.mul(a, b);
		obj.div(a, b);
		
		
	}

}
