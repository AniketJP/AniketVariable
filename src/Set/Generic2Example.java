package Set;

import java.util.ArrayList;
import java.util.TreeSet;

public class Generic2Example 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(101);
		al.add(109);
		al.add(103);
		al.add(102);
		
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(101);
		tr.add(109);
		tr.add(103);
		tr.add(102);
		System.out.println(tr);
		
		System.out.println("-----");

		System.out.println(al);
		System.out.println("Print data using for each loop");
		for(Integer s1:al)
		{
			System.out.println(s1);
		}
	}

}
