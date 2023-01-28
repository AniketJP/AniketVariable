package Set;

import java.util.TreeSet;

public class Genericex1
{
	public static void main(String[] args)
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(102);
		tr.add(101);
		tr.add(104);
		tr.add(103);
		tr.add(109);
		tr.add(100);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		//remove
		tr.remove(100);
		System.out.println(tr);

		System.out.println("Print data using iterator cursor");
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
	}

}
