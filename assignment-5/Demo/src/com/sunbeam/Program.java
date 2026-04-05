package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		String[] arr = str.split(" "); // { "my", .... }
		
		System.out.println(arr.length);
		
		
		
	}
	
}
