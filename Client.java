package com.zensar.testCode;

public class Client {
	public static void main(String[] args) {
		Addition add = new Addition();
		int result = add.addition(2, 3);
		
		int subtraction = add.addition(2, 3);
		int multiplication=add.mult(6, 3);
		int division=add.div(10, 2);
		System.out.println(result);
		
		int[] arr=add.myArray();
		

	}
}
