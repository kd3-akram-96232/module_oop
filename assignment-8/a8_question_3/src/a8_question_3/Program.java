package a8_question_3;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Papaya");
		
		list.set(1, "Update Mongo");
		
		for(String elm : list) {
			System.out.println(elm);
		}
		
	}
	
}
