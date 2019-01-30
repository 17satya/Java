package com.bridgelabz.dataStructure;

public interface List<T> {

	public void add(T item);
	public void print();
	public boolean remove(T item);
	public boolean search(T item);
	public boolean isEmpty();
	public int size();
	public void append(T item);
	public int index(T item);
	public T pop();
	public void insert(int pos,T item);
	public T pop(int pos);
	public List<T> list();
	
}




