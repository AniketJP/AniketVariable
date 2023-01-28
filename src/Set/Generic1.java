package Set;

import java.util.TreeSet;

public class Generic1
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(19);
		tr.add(102);
		tr.add(103);
		tr.add(67);
		tr.add(10);
		tr.add(106);
		
		System.out.println(tr);
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
		
		
	}

}
