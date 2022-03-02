package Practice;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		list.remove(0);
		
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
