package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HAshSet_Example2
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Divya");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}

}
