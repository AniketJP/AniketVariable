package Example1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example2 
{
	public static void main(String[] args)
	{
		//initial capacity=10
		ArrayList al=new ArrayList(10);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(8));
		System.out.println(al.contains(10));
		System.out.println(al.isEmpty());
		//add -->right shift operation
		al.add(0,0);
		System.out.println(al);
		//remove-->left shift operation
		al.add(1, 2);
		System.out.println(al);
		//update
		al.set(0, "Divya");
		System.out.println(al);
		System.out.println("print all data by Iterator ");
		//iterator cursor
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		//Listiterator
		System.out.println("Print all data ");
		ListIterator list=al.listIterator();
		while(list.hasNext())
	{
			System.out.println(list.next());
	}
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	}
	}
