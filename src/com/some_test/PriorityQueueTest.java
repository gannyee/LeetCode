package com.some_test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	//Name
	private String name;
	//Age
	private int age;
	
	public PriorityQueueTest(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + "-----" + getAge();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<PriorityQueueTest> order = new Comparator<PriorityQueueTest>() {

			public int compare(PriorityQueueTest o1, PriorityQueueTest o2) {
				// TODO Auto-generated method stub
				int age = o1.getAge();
				int age1 = o2.getAge();
				
				return age - age1;
			}
			
		};
		PriorityQueue<PriorityQueueTest> priorityQueue = new PriorityQueue<PriorityQueueTest>(11,order);
		
		PriorityQueueTest t1 = new PriorityQueueTest("t1", 20);
		PriorityQueueTest t2 = new PriorityQueueTest("t2", 22);
		PriorityQueueTest t3 = new PriorityQueueTest("t3", 13);
		PriorityQueueTest t4 = new PriorityQueueTest("t4", 23);
		PriorityQueueTest t5 = new PriorityQueueTest("t5", 2);
		PriorityQueueTest t6 = new PriorityQueueTest("t6", 28);
		PriorityQueueTest t7 = new PriorityQueueTest("t7", 43);
		PriorityQueueTest t8 = new PriorityQueueTest("t8", 25);
		
		priorityQueue.add(t1);
		priorityQueue.add(t2);
		priorityQueue.add(t3);
		priorityQueue.add(t4);
		priorityQueue.add(t5);
		priorityQueue.add(t6);
		priorityQueue.add(t7);
		priorityQueue.add(t8);
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll().toString());
		}
		
	}

}
