package com.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {
	
	List<T> list = new ArrayList<T>();
	
	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}

	public void addElement(T value) {
		list.add(value);
	}
	
	public void removeElement(T value) {
		list.remove(value);
	}
	
	public T getElement(int index) {
		return list.get(index);
	}

}
