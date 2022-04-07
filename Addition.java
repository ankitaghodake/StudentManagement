package com.zensar.testCode;

public class Addition {
	public int addition(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public int[] myArray(){
		return new int[]{10,20,30,40};
		
	}
	
	public String myString(String name){
		if(name.length()!=0){
			return name.toUpperCase();
		}else{
		 throw new IllegalArgumentException();
	}
	}
	
}
