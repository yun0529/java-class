package Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratiorCollection {
	public static void main(String[] args) {
List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Pie");
		list.add("Android");
		list.add("Pie");
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
		
		itr = list.iterator();
		String str;
		while(itr.hasNext()) {
				str = itr.next();
				if(str.equals("Pie")) {
					itr.remove();
				}	
		}
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + '\t');
		}
	}
}
