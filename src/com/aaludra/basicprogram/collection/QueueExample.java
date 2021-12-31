package com.aaludra.basicprogram.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(8);
		qu.add(2);
		qu.add(23);
		qu.add(14);
		qu.add(55);
		qu.add(61);

		System.out.println(qu);
		System.out.println("Head of the queue is : " + qu.peek());
		System.out.println("Head is removed : " + qu.remove());// poll also does the same work but there s small
																// different
		System.out.println("Head of the queue is : " + qu.peek());

		PriorityQueue<Object> qu1 = new PriorityQueue<>();// This priority queue will assign the inputs in ascending
															// order
		qu1.addAll(qu);
		System.out.println("\nThis is priorityQueue : " + qu1);

	}

}
