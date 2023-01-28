package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("Divya");
		hs.add(101);
		hs.add(9.11f);
		hs.add('O');
		hs.add(101);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Divya"));
		//remove 
		hs.remove('O');
		System.out.println(hs);
		System.out.println("print all data using iterator cursor");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print all data using for each loop");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}

}
