package com.cdac.Queue_Implementation;

public class Queue {
	int Queue[]=new int[5];
	int size;
	int rear;
	int front;
	
	public void enqueue(int data)
	{
		if(!isFull())
		{
		Queue [rear]=data;
		rear=(rear+1)%5;
		size=size+1;
		}
		else
		{
			System.out.println("Queue is Full");
		}
		
	}
	
	public int dequeue()
	{
		int data=Queue[front];
		if(!isEmpty())
		{
		front=(front+1)%5;
		size--;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
		return data;
	}
	
	public int getsize()
	{
		return size;
	}
	
	public boolean isEmpty() 
	{
		return getsize()==0;
		
	}
	
	public boolean isFull()
	{
		return getsize()==5;
	}
	public void show()
	{
		System.out.print("Elements :");
		for(int i=0;i<size;i++)
		{
			System.out.print(Queue[(front+i)%5]+ " ");
		}
		System.out.println();
		for(int n : Queue)
		{
			System.out.print(n + " ");
		}
	}
		
			
}
