package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		tr.add(101);
		tr.add(203);
		tr.add(190);
		tr.add(100);
		tr.add(889);
		tr.add(10);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.contains(10));
		System.out.println(tr.isEmpty());
		
		tr.remove(889);
		System.out.println(tr);
		
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
		
		System.out.println("Print data using For each loop");
		for(Object s2:tr)
		{
			System.out.println(s2);
		}
	}

}
