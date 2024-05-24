package com.java8.defaultstaticmethods.multipleInheritance;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("Inside method B " + Interface2.class);
	}
	//overriding Interface 1
	default void methodA() {
		System.out.println("Inside method B " + Interface2.class);
	}

}
