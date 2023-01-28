package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 
{
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(101);
		ar.add(102);
		ar.add('o');
		ar.add(90);
		ar.add("Divya");
		ar.add(null);
		ar.add(45.9f);
		ar.add(null);
		
		System.out.println(ar);
		
		HashSet hs=new HashSet(ar);
		System.out.println(hs);
	}

}
