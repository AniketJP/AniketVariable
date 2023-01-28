package ListArrays;

import java.util.ArrayList;

public class Example2 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(101);
		al.add("Divya");
		al.add(56.9f);
		al.add(65.9f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Divya"));
		System.out.println(al.isEmpty());
		System.out.println(al.get(6));
		
	}

}
