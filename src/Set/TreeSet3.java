package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 
{
	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		tr.add(10);
		tr.add(20);
		tr.add(45);
		tr.add(34);
		tr.add(40);
		tr.add(23);
		tr.add(60);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("Print data using iterator cursor");
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print data using for each loop");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
	}

}

