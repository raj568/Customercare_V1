package javaprog;

interface username{
	void display(String s);
	
}
interface password{
	void displaypassword(String password);
}
 class Login implements username,password
{
	public void display(String s)
	{
		System.out.println("username is"+s);
	}
	public void displaypassword(String password)
	{
	System.out.println("password is"+password);
	}
}
public class extendimplem {

	public static void main(String[] args) {
		System.out.println("control in the main method()");
		Login obj=new Login();
		obj.display("Rajani Boddu");
		obj.displaypassword("Rajani");
		
	}

}
