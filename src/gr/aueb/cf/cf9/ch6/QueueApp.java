package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * Queues are FIFO (First In First Out) logic
 * Implemented with:
 * enqueue()
 * enqueue()
 */
public class QueueApp {
	static int[] queue = new int[10];
	static  int top = -1;

	public static void main(String[] args) {

	}

	public static void enqueue(int val){
		queue[++top] = val;
	}

	public static int dequeue(){

		int num = queue[0];
		queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
		top --;
		return num;
	}

}
