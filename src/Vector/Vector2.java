package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector2 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(10);
		v.add(1);
		v.add(23);
		//updated data
		v.set(2, "velocity");
		System.out.println(v);
		System.out.println("vector using itertor cursor");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
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

