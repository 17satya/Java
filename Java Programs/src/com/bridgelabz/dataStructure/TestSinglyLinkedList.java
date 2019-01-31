package com.bridgelabz.dataStructure;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sll=new SinglyLinkedList<Integer>();
		sll.add(1);
		sll.add(2);
		sll.add(6 );
		sll.append(2);
		sll.print();
		int i=sll.index(2);
		System.out.println("position at "+i);
		System.out.println("popped element"+sll.pop());
		System.out.println("the sll size is"+sll.size());
		sll.print();
		sll.insert(2,10);
		sll.print();
		
	}

}
