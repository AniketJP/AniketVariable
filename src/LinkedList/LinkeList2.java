package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkeList2
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);
		ll.add(17);
		ll.add(18);
		
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(2));
		System.out.println(ll.contains(18));
		
		//add
		ll.add(1, 17);
		System.out.println(ll);
		//update
		ll.add(2, 24.5f);
		System.out.println(ll);
		
		//remove
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("---Print info in iterator cursor ");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---Print info in Listiterator cursor ");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("Print info in for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("---for each loop---");
		for(Object s1:ll)
		{
		System.out.println(s1);	
		}
	}

}
