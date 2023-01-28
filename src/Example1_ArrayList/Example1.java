package Example1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 
{
	public static void main(String[] args)
	{
		//initial capacity=8
		ArrayList al=new ArrayList();
		al.add(101);
		al.add(91.6f);
		al.add(102);
		al.add('A');
		al.add("Divya");
		al.add(103);
		al.add("Welcome");
		al.add(8);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Divya"));
		System.out.println(al.isEmpty());
		System.out.println(al.get(5));
		
		//right shift operation
		al.add(3,'A');
		System.out.println(al);
		
		//left shift operation
		al.remove(1);
		System.out.println(al);
		System.out.println("iterator cursor");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("ListIterator cursor");
		ListIterator list=al.listIterator();
		while(list.hasNext())
		{
		System.out.println(list.next());	
		}
		
		System.out.println("print data using foreach lop");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	}

}
