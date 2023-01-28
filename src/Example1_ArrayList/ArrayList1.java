package Example1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayList1
{
	public static void main(String[] args) 
	{
		//initial capacity=10
		ArrayList al=new ArrayList(10);
		al.add("Divya");
		al.add("Laxman");
		al.add("Nirmal");
		al.add(1);
		al.add(45.2f);
		al.add(90.6f);
		al.add(23);
		al.add("Vaijapur");
		al.add('O');
		al.add(9.11f);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.contains(23));
		System.out.println(al.isEmpty());
		
		//right shift operation 
		al.add(2, 12);
		System.out.println(al);
		
		//left shift operation
		al.remove(3);
		System.out.println(al);
		
		//update info 
		al.set(1,'A');
		System.out.println(al);
		System.out.println("------");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------");
		ListIterator List=al.listIterator();
		while(List.hasNext())
		{
			System.out.println(List.next());
		}
		System.out.println("---foreach loop----");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	
		
																																																																																																																																																																																																
		
		
		
	
	}

}
