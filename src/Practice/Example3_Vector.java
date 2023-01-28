package Practice;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example3_Vector
{
	public static void main(String[] args)
	{
		Vector vc=new Vector();
		vc.add("Divya");
		vc.add(101);
		vc.add("pafh");
		vc.add(121);
		
		System.out.println(vc);
		System.out.println(vc.size());
		System.out.println(vc.isEmpty());
		System.out.println(vc.get(3));
		System.out.println(vc.contains(101));
		
		//add information
		vc.add(2,"PArth");
		System.out.println(vc);
		//remove 
		vc.remove(2);
		System.out.println(vc);
		//update or modify
		vc.set(2, 89.5f);
		System.out.println(vc);
		
		System.out.println("---print all data using ListIterator--");
		
		Iterator itr=vc.iterator();
		
		System.out.println("---print all data using iterator cursor---");

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using listiterator cursor---");

		ListIterator list=vc.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("---print all data using using  for loop---");
		 for(int i=0;i<=vc.size()-1;i++)
		 {
			 System.out.println(vc.get(i));
		 }
			
		 System.out.println("---print all data using  for each loop---");

		 for( Object s1:vc)
		 {
			 System.out.println(s1);
		 }
		
	}
	

}
