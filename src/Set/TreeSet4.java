package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4
{
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		tr.add(101);
		tr.add(100);
		tr.add(103);
		tr.add(102);
		tr.add(104);
		tr.add(109);
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.contains(100));
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("Print all data using iterator cursor");
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
