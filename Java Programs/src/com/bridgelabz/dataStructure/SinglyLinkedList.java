package com.bridgelabz.dataStructure;

public class SinglyLinkedList<T> implements List<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	private int pos=size-1;
	
	@Override
	public boolean isEmpty() {
		
		return(size==0);
	}
	@Override
	public void add(T item)
	{
		
		Node<T> n=new Node<T>(item);
		if((first==null)&&(last==null))
		{
			first=last=n;
		}
		else
		{
			last.next=n;
			last=n;
		}
		size++;
		//pos++;
	}

	@Override
	public void print() {
		System.out.println("Printing SLL contents");
		Node<T> temp=first;
		while(temp!=null)
		{
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println("");
	}
	@Override
	public boolean remove(T item) {
	
		Node<T> temp=first,prev=null;
		
		while(temp!=null)
		{
			if(temp.data.equals(item))
			{
				if(prev==null)
				{
					first=temp.next;
				}
				else
				{
					prev.next=temp.next;
					temp.next=null;
				}
				size--;
				//pos--;
				return true;
			}
			else
			{
				prev=temp;
				temp=temp.next;
			}
		}
		return false;
		
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean search(T item) {
		Node<T> temp=first;
		while(temp!=null)
		{
			if(temp.data.equals(item))
				return true;
			
			temp = temp.next;
		}
		return false;
		
	}
	@Override
	public void append(T item) {
		Node<T> n=new Node<T>(item);
		if((first==null)&&(last==null))
		{
		System.out.println("First add the item to list");
		return;
		}
		else
		{
			last.next=n;
			last=n;
		}
		size++;
		//pos++;
	}
	@Override
	public int index(T item) {
		Node<T> temp=first;
		while(temp!=null)
		{
			
			if(temp.data.equals(item))
			{
				return pos;
			}
			pos++;
			temp=temp.next;
		}
		return -1;
	}
	@Override
	public T pop() {
		Node<T> temp=last;
		T data=temp.data;
		if(remove(data))
		{
			return data;
		}
		return null;
		
	}
	@Override
	public void insert(int pos,T item) {
		Node<T> n=new Node<T>(item);
		Node<T> temp=first;
		Node<T> prev=null;
		int find=0;
		while(temp!=null)
		{
			find++;
			if(find==pos)
			{
				n.next=temp.next;
				temp.next=n;
				size++;

			}
		}
	}


	@Override
	public List<T> list() {

		return this;
	}
	@Override
	public T pop(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

}