package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	public static void main(String[] args)
	{
		LinkedHashSet  lhs=new LinkedHashSet();
		lhs.add(101);
		lhs.add("Divya");
		lhs.add(102);
		lhs.add('O');
		lhs.add(90);
		lhs.add(null);
		lhs.add("Nirmal");
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(101));
		
		System.out.println("Print info using Iterator Cursor");
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print info using for each loop");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
	}

}
