package com.aaludra.basicprogram.revision;

public class IfelseCondition5 {
	public IfelseCondition5(int i) {
		if ((i == 0) || (i < 0)) {
			System.out.println("Negative number");
		} else {
			System.out.println("Positive number");
		}
	}

	public static void main(String[] args) {
		new IfelseCondition5(-32);

	}

}
