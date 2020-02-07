package javaprog;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(3,"Rajani");
hm.put(4, "Boddu");
hm.put(5, "QA");
System.out.println(hm.get(3));

for(Entry<Integer,String> m:hm.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}
HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
	Employee emp1=new Employee("Rajani",34,"QA");
	Employee emp2=new Employee("pavani",34,"QA");
	Employee emp3=new Employee("chandu",34,"QA");
	emp.put(1,emp1);
	emp.put(2,emp2);
	emp.put(3,emp3);
	for(Entry<Integer,Employee> e:emp.entrySet())
	{
		int k=e.getKey();
		Employee e1=e.getValue();
		System.out.println("info"+e1.name+e1.age+e1.role);
	}


	}

}
