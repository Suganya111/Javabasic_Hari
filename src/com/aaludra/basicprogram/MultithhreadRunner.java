package com.aaludra.basicprogram;

public class MultithhreadRunner {

	public static void main(String[] args) {
		MultithreadExample obj = new MultithreadExample();
		System.out.println(obj.getState());
		obj.start();

		for (int i = 1; i < 5; i++) {
			System.out.println("Main thread : " + i);
			try {
				Thread.sleep(1000);// this method will slow the execution time for 1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(obj.getState());

	}

}
