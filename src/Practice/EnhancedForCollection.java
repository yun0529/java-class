package Practice;

import java.util.LinkedList;
import java.util.List;

public class EnhancedForCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String i : list) {
			System.out.print(i + '\t');
		}
		System.out.println();
		list.remove(1);
		for(String i : list) {
			System.out.print(i + '\t');
		}
	}
}
