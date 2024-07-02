package com.java8.defaultstaticmethods.multipleInheritance;

public interface Interface3 extends Interface2{

	default void methodC() {
		System.out.println("Inside method C "+ Interface3.class);
	}
}
