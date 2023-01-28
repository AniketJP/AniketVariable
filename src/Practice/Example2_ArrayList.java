package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example2_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(101);
		al.add("Diu");
		al.add("nirmal");
		al.add("Vaijapur");
		al.add(null);
		al.add(null);
		
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.contains(101));

		//right shift operation perform-->add info in between
		al.add(5, "Waw");
		System.out.println(al);
		//left shift remove/delete
		al.remove(4);
		System.out.println(al);
		//update /modify info 
		al.set(5,"Velocity");
		System.out.println(al);
		
		System.out.println("____Iterator cursor----");
		Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---print all data using ListIterator---");
		
		ListIterator list=al.listIterator();
	
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("---Print all data using for loop");
	
		for(int i=0 ;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("--Print data using for each loop--");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	}
	

}
