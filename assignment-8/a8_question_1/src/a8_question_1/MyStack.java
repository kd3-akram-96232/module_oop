package a8_question_1;

public interface MyStack {
	boolean push(Employee e);
	Employee peak();
	boolean pop();
	Employee[] getEmps();
	boolean isFull();
}
