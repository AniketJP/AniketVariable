package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class Vector5 
{
	public static void main(String[] args)
	{
	
		Vector v=new Vector();
		v.add(0);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(1));
		System.out.println(v.contains(4));
		
		System.out.println("--add -->right shift opertion--");
		v.add(0,"Divya");
		System.out.println(v);
		
		//update info-->left shift operation
		v.set(1, 'A');
		System.out.println(v);
		
		//remove 
		v.remove(3);
		System.out.println(v);
		
		System.out.println("iterator cursor");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("ListIterator cursor");
		ListIterator litr=v.listIterator();
		while(litr.hasNext())
		{
		System.out.println(litr.next());
		}
		System.out.println("Enumeration cursor ");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		}
}
