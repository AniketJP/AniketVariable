package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs =new LinkedHashSet();
		
		lhs.add("Divya");
		lhs.add(101);
		lhs.add('O');
		lhs.add(99.3f);
		lhs.add(78.4f);
		lhs.add(102);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(null));
		
		//remove
		lhs.remove(null);
		System.out.println(lhs);
		
		System.out.println("Print data using iterator cursor ");
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print data using for each loop ");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
	}

}
