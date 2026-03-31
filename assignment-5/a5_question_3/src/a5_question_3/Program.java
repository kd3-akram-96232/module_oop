package a5_question_3;

public class Program {
	
	public static int countWord(String str) {
		
		String[] arr = str.trim().split(" ");
		
		return arr.length;
	}
	
	public static void main(String[] args) {
		
		String str = "hello world hello worldl";
		
		System.out.println(countWord(str));
		
	}

}
