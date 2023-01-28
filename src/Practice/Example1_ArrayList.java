package Practice;

import java.util.ArrayList;

public class Example1_ArrayList
 
{
	public static void main(String[] args) 
	{
		//arraylist
		ArrayList ar=new ArrayList<>();
		ar.add(001);
		ar.add("Divya");
		ar.add(199);
		ar.add(null);
		ar.add(null);
		ar.add(null);
		
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.contains("Divya"));
		System.out.println(ar.get(2));
		
	}

}
