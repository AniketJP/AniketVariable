package Set;

import java.util.ArrayList;
import java.util.TreeSet;

public class Generic2ex2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Divya");
		ar.add("Mine");
		ar.add("VEl");
		ar.add("WEl");
		ar.add("Nik");
		ar.add("Weop");
		
		System.out.println(ar);
		System.out.println("Print data using for each loop");
		for(String s1:ar)
		{
			System.out.println(s1);
		}
		System.out.println("TreeSet");
		TreeSet <String> tr=new TreeSet<String>();
		tr.add("Divya");
		tr.add("Mine");
		tr.add("VEl");
		tr.add("WEl");
		tr.add("Nik");
		tr.add("Weop");
		System.out.println(tr);
		System.out.println("Print data using for Each loop");
		for(String s2:tr)
		{
			System.out.println(s2);
		}
	}

}
