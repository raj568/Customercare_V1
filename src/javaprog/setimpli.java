package javaprog;

import java.util.HashSet;
import java.util.TreeSet;

public class setimpli {

	public static void main(String[] args) {

HashSet<Integer> set=new HashSet<Integer>();
set.add(10);
set.add(12);
set.add(20);
System.out.println("values of set"+set);
TreeSet<Integer> a=new TreeSet<Integer>(set);
a.add(2);
System.out.println(a);

	}

}
