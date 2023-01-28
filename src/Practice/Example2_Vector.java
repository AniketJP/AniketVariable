package Practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector
{
	public static void main(String[] args)
	{
		
		Vector al=new Vector();
		al.add("Divya");
		al.add(101);
		al.add(98.2f);
		al.add("Simple");
		al.add("abcdfe");
		al.add("nirmal");
		
		System.out.println(al);
		System.out.println(al.get(5));
		System.out.println(al.contains(101));
		System.out.println(al.get(4));
		System.out.println(al.isEmpty());
		
		Iterator itr=al.iterator();
		
		System.out.println("--print data using iterator cursor--");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--print data using listIterator cursor");
		
		ListIterator list=al.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("--Print data using for loop");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("--Print data using for each loop--");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		System.out.println("Enumeration cursor");
		Enumeration enm=al.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
	}

}
