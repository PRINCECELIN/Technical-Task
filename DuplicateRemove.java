package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class DuplicateRemove {
	public static <integer> void main(String[]args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println("duplicates"+a1);
		
		LinkedList<integer> set=new LinkedList<integer>();
		a1.clear();
		a1.addAll(set);
		System.out.println(a1);

}
}