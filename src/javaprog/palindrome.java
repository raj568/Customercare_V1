package javaprog;

public class palindrome {

	public static void main(String[] args) {

String str="mam";
String str3= new StringBuffer(str).reverse().toString();
if(str.equals(str3))
	System.out.println("is palindrome");
StringBuffer newstr=new StringBuffer();
int len=(str.length()-1);
for(int i=len;i>=0;i--)
{
	newstr.append(str.charAt(i));
	
}
String str1=newstr.toString();
System.out.println(newstr);
if(str.equalsIgnoreCase(str1))
{
	System.out.println("palindrome");
	
}
else
	System.out.println("not a palindrome");
	}

	
}
