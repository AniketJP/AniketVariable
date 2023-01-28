package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList6
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("Divya");
		ll.add("Laxman");
		ll.add("Nirmal");
		ll.add(101);
		ll.add(102);
		ll.add(103);
		ll.add(104);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(01));
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(5));
		
		//add-->right shift Operation
		ll.add(0,'A');
		System.out.println(ll);
		//remove/delete -->left Shift Operation
		ll.remove(1);
		System.out.println(ll);
		//update/modify 
		ll.set(0, "divya");
		System.out.println(ll);
		
		System.out.println("---Print info using iterator cursor");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---Print info using Listiterator cursor");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("Print info using For Loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("Print info using  for each loop");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}

		
	}

}
