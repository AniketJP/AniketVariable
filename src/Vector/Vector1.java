package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println(v.size());
		System.out.println(v.contains(6));
		System.out.println(v.isEmpty());
		
		//add info in between vector -->right shift operation
		v.add(1, "Divya");
		System.out.println(v);
		//remove info in between vector -->left shift operation
		v.remove(1);
		System.out.println(v);
		
		//update or modify info in between vector-->set
		v.set(1, 'O');
		System.out.println(v);
		
		System.out.println("--Print vector data using iterator cursor-- ");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Print all data using ListIterator cursor");
		ListIterator list=v.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("Print all data using for loop");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Print all data using foreach loop");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		System.out.println("print all data using Enumeration cursor");
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
