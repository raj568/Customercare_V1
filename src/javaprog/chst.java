package javaprog;

interface a{
	public void add(int a);
}
interface b{
	public void mul(int a);
}
interface c extends a{
	public void cin(int b);
}
interface d extends c{
	public void exm(int c);
}
class e implements d{
	public void exm(int c)
	{
		System.out.println("we r in c");
	}
	public void cin(int c)
	{
		System.out.println("we r in b");
	}
	public void mul(int c)
	{
		System.out.println("we r in a");
	}
	public void add(int c)
	{
		System.out.println("we r in d");
	}
	
	
	
	
}
public class chst extends e {

	public static void main(String[] args) {
		
e obj=new e();
obj.add(2);
obj.mul(2);


	}

}
