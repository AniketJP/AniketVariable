package ListArrays;

import java.util.ArrayList;

public class Example5 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(1001);
		al.add("Divya");
		al.add(12);
		al.add("Div");
		al.add("Nirmal");
		al.add('C');
		al.add(231);
		al.add(null);
		al.add(34);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(34));
		System.out.println(al.isEmpty());
		System.out.println(al.get(5));
		
		
	}

}
