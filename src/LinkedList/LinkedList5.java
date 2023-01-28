package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList5 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(40));
		System.out.println(ll.size());
		
		//info add-->right shift operation
		
		ll.add(2,"Divya");
		System.out.println(ll);
		
		//info remove -->left shift operation
		ll.remove(2);
		System.out.println(ll);
		//info updtae or modify
		ll.set(1, "Divya");
		System.out.println(ll);
		System.out.println("--Print info using  iterator cursor");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print info using ListIterator cursor");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("Print info using for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("Print info using foreach loop");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
	}

}

