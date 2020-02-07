package javaprog;

import java.util.Iterator;
import java.util.LinkedList;

public class Lnkedlist {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Rajani");
		ll.add("Boddu");
		System.out.println("initial linkedlis is "+ll);
		ll.add(1,"lavanya");
		ll.addFirst("videm");
		ll.addLast("plano");
		for(int i=0;i<ll.size();i++)
			System.out.println("for loop["+ll.get(i));
		for(String str:ll)
			System.out.println(str);
		Iterator<String> i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println("iterator values are"+i.next());
		}
	
	}

}
