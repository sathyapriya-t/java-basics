package com.java8.defaultstaticmethods.multipleInheritance;

public class MultipleInheritanceImpl implements Interface1,Interface2,Interface3 {

	public static void main(String[] args) {
		
		//multiple Inheritance
		MultipleInheritanceImpl multipleInheritanceImpl = new MultipleInheritanceImpl();
		multipleInheritanceImpl.methodB();
		multipleInheritanceImpl.methodA();
		multipleInheritanceImpl.methodC();
	}

}