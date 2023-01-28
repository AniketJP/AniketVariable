package ListArrays;

import java.util.ArrayList;

public class Example4
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add('D');
		al.add("Divya");
		al.add(102);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.contains('D'));
		System.out.println(al.size());
		System.out.println(al.indexOf(1));
		System.out.println(al.isEmpty());
		System.out.println(al.get(5));
		
		
	}

}
