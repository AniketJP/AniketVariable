package Set;

import java.util.TreeSet;

public class GenericExample1 
{
	public static void main(String[] args)
	{
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("bcd");
		tr.add("Nirmal");
		tr.add("Welcome");
		tr.add("abcd");
		
		for(String s1:tr)
		{
			System.out.println(s1);
		}
	}

}
