package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example1_LinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Divya");
		lhs.add(101);
		lhs.add(98.3f);
		lhs.add('O');
		lhs.add(101);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.contains(101));
		
		lhs.remove('O');
		System.out.println(lhs);
		
		System.out.println("Print data using iterator cursor");
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		System.out.println("Print data using for each loop");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
		
		
	}

}
