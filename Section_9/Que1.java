package com.Section_9;

public class Que1 {
	static final int limit = 10;
	static int num = 1;
	
	static void number() {
		if (num <= limit) {
			
			System.out.print(num + " ");
			num++;
			Que1.number();
		}
		else return;
		
	}

	public static void main(String[] args) {
		Que1.number();

	}

}
