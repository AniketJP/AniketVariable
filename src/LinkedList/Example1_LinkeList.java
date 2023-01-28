package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1_LinkeList 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("Divya");
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(12));
		
		//add or insert info in between from linkedlist
		ll.add(3, 'A');
		System.out.println(ll);
		
		//remove or delete info in between from linkedlist
		ll.remove(0);
		System.out.println(ll);
		
		//update or modify info in between from linkedlist
		ll.set(0, "DIVYA");
		System.out.println(ll);
		
		System.out.println("Print info using iterator cursor ");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Print info using Listiterator cursor");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
		System.out.println(litr.next());
		}
		System.out.println("print info using for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("print info using each loop");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
	}
}