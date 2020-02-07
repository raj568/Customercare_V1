package javaprog;
import java.util.Scanner;
class mathopera{
	
	void sum(int a,int b)
	{
		int c=(a+b);
		System.out.println("sum of two integers is "+c );
	}
	void  mul(int a,int b)
	{
	int c=(a*b);
	System.out.println("multiplication of two integers is "+c );
	}
	
	void div(float a,float b)
	{
	float c=(a/b);
	System.out.println("multiplication of two integers is "+c );
	
	}
	
}
class Chilc extends mathopera{
	void sub(int a,int b){
		int c=a-b;
	System.out.println("sum of two integers is "+c );
	}
	
	
}
public class Inextend extends Chilc {

	public static void main(String[] args) {
		System.out.println("pleas enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Chilc obj=new Chilc();
		obj.sum(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		obj.sub(a, b);
		sc.close();
		

	}

}
