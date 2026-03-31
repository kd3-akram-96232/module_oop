package a5_question_1;

import java.util.Arrays;

public class Program {
	
	public static void main(String[] args) {		
		int arr[] = {10, 20 , 30, 40, 50};
		
		int newArr[] = arr;
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		
		
		
		
		// print
		for(int v : newArr) {
			System.out.print(v + " ");
		}
	}
	

}
