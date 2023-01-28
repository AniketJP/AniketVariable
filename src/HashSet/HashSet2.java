package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(102);
		al.add("Divya");
		al.add(102);
		al.add(78.5f);
		al.add(null);
		al.add(null);
		al.add("Divu");
		
		System.out.println(al);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}

}
