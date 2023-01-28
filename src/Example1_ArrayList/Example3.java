package Example1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example3
{
	public static void main(String[] args) 
	{
		//initial capacity=5;
		ArrayList al=new ArrayList(5);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.contains(4));
		System.out.println(al.isEmpty());
		System.out.println(al.get(4));
		
		//right shift
		al.add(3,23);
		al.add(2, 12);
		System.out.println(al);
		
		//left shift 
		al.remove(2);
		System.out.println(al);
		
		//update info
		al.set(2, "Divya");
		System.out.println(al);
		
		System.out.println("---Print arrayList using iterator cursor");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---Print all data by listIterator---");
		ListIterator list=al.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("---- print data by For each loop -----");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
	}

}
