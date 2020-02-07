package javaprog;

import java.util.ArrayList;

import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) 
	{
ArrayList<String> a=new ArrayList<String>();
System.out.println("size of the array"+a.size());
a.add("Rajani");
a.add("u");
a.add("boddu");
a.add("teacher");
a.remove("u");
a.add(2,"nagaraju");
System.out.println("printing the values of list"+a);
Iterator<String> i= a.iterator();
System.out.println("printing the values of list using iterator interface");
while(i.hasNext())
{
	System.out.println(i.next());

}



System.out.println("printing the values of list is using size and get method of arraylist class");
for(int j=0;j<a.size();j++)
{
	System.out.println(a.get(j));
}
System.out.println("copying the values of one list to other list by using object.clone() method"+a.clone());
ArrayList<String>a1=new ArrayList<String>();
a1=(ArrayList<String>) a.clone();
Boolean st=a.containsAll(a1);
System.out.println(st);
Employee emp=new Employee("Rajani",34,"QA");
Employee emp1=new Employee("Rajaniv",34,"QAe");

ArrayList<Employee> e1=new ArrayList<Employee>();
e1.add(emp);
e1.add(emp1);
Iterator<Employee> j=e1.iterator();
while(j.hasNext())
{
	Employee first=j.next();
	System.out.println(first.name);
	System.out.println(first.age);
	System.out.println(first.role);
	
	
	
}
	}

}
