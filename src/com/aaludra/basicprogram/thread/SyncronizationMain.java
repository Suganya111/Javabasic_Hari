package com.aaludra.basicprogram.thread;

public class SyncronizationMain extends Thread {

	public static void main(String args[]) {
		Synchronizationdemo obj = new Synchronizationdemo();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();

		t2.start();
	}
}
