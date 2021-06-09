package com.cdac.Queue_Implementation;

public class Runner {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(15);
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		System.out.println("size "+q.getsize());
		
		System.out.println(q.isEmpty());
		
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(17);
		q.enqueue(18);
		q.enqueue(20);
		
		q.show();

	}

}
