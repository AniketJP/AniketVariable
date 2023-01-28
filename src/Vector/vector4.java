package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector4 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(2));
		System.out.println(v.contains(20));
		System.out.println(v.isEmpty());
		
		//right shift opertaion
		v.add(0, null);
		System.out.println(v);
		//left shift operation
		v.remove(6);
		System.out.println(v);
		//update operation
		v.set(1, "Divya");
		System.out.println(v);
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator lit=v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
