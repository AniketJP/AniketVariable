package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args)
	{

		LinkedList ll=new LinkedList();
		ll.add('A');
		ll.add(90.5f);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40.5f);
		ll.add("Divya");
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains('A'));
		
		//add -->right shift operation
		ll.add(1, 34.8f);
		System.out.println(ll);
		
		//remove-->left shift operation
		ll.remove(2);
		System.out.println(ll);
		
		ll.set(1, 'O');
		System.out.println(ll);
		
		System.out.println("--Print info using iterator cursor");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
		
		System.out.println("--Print info using Listiterator cursor");

		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("--Print info using for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("--Print info using foreach loop");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
	
	
	
	}
	
}
