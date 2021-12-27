package com.aaludra.basicprogram;

public class MultithreadExample extends Thread {

	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println("Child Thread : " + i);
		}
	}

}
