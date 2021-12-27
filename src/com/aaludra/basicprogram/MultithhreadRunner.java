package com.aaludra.basicprogram;

public class MultithhreadRunner {

	public static void main(String[] args) {
		MultithreadExample obj = new MultithreadExample();
		System.out.println(obj.getState());
		obj.start();

		for (int i = 1; i < 5; i++) {
			System.out.println("Main thread : " + i);
		}

		System.out.println(obj.getState());
	}

}
