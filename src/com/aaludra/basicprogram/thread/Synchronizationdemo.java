package com.aaludra.basicprogram.thread;

public class Synchronizationdemo {
	synchronized void printTable(int n) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(900);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class MyThread1 extends Thread {
	Synchronizationdemo t;

	MyThread1(Synchronizationdemo t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);

	}

}

class MyThread2 extends Thread {

	Synchronizationdemo t;

	MyThread2(Synchronizationdemo t) {
		this.t = t;
	}

	@Override
	public void run() {

		t.printTable(100);
	}
}
