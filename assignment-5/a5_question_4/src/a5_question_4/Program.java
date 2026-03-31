package a5_question_4;

public class Program {
	
	enum TrafficLight {
		RED,
		GREEN,
		YELLOW
	}
	
	public static void main(String[] args) {
		
		TrafficLight t1 = TrafficLight.RED;
		
		switch(t1) {
			case RED -> System.out.println(TrafficLight.RED);
			case YELLOW -> System.out.println(TrafficLight.YELLOW);
			case GREEN -> System.out.println(TrafficLight.GREEN);
		}
		
	}

}
