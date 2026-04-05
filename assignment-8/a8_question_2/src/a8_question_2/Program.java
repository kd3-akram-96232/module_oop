package a8_question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Blue");
		
		Collections.sort(list);
		
		for(String elm : list) {
			System.out.println(elm);
		}
		
	}

}
