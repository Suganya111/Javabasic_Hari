package com.aaludra.basicprogram.thread;

public class MultithreadExample extends Thread {

	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println("Child Thread : " + i);
			try {
				Thread.sleep(200);//
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
