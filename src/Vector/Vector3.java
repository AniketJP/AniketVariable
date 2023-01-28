package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector3
{

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Divya");
		v.add(100);
		v.add(12);
		v.add("Nirmal");
		v.add('A');
		v.add('O');
		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.isEmpty());
		System.out.println(v.contains(100));
		System.out.println(v.size());
		
		//right shift
		v.add(1, 'o');
		System.out.println(v);
		
		//left shift
		v.remove(1);
		System.out.println(v);
		//update
		v.set(1, "Nutika");
		System.out.println(v);
		
		System.out.println("--iterator cursor---");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("ListIterator cursor");
		ListIterator list=v.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("Enumeration cursor");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		System.out.println("---for loop---");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("foreach loop");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
	}
}
