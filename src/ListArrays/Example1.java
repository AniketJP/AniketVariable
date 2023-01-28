package ListArrays;

import java.util.ArrayList;

public class Example1 
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		//initial capacity=10
		al.add("Rahul");
		al.add(101);
		al.add(64.6f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());//7
		System.out.println(al.isEmpty());//false
		System.out.println(al.contains(101));//true
		System.out.println(al.get(3));//A
	}

}
