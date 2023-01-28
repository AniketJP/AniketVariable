package Example1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example_ArrayList
{
	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();
		//initial capacity=10
		ArrayList al=new ArrayList(8);//initial capacity=8
		al.add("rahul");
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(106);
		al.add(107);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(6));
		System.out.println(al.contains(106));
		
		//add info in in between arraylist-->right shift operation
		al.add(3,190);
		System.out.println(al);
		
		//remove/delete info in in between arraylist-->left shift operation
		al.remove(0);
		System.out.println(al);
		
		//update or modify info in between arraylist
		al.set(5,"Divya");
		System.out.println(al);
		
		System.out.println("---print all data using iterator cursor--");
		Iterator it=al.iterator();
		while(it.hasNext())//true false
		{
			System.out.println(it.next());
		}
		System.out.println("---Print all data using ListIterator cursor--");
		
		ListIterator list=al.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("--Print all data using foreach loop---");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	}

}
