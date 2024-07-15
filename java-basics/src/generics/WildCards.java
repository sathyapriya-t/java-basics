package generics;

import java.util.ArrayList;
import java.util.List;

import oops.inheritance.Person;
import oops.inheritance.Student;

public class WildCards {

	public static void main(String[] args) {

		// Student extends Person class - so here we can use student class as value of
		// object
		// substitution principle applies
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(null, null, null));
		personList.add(new Student(null, null, null));
		printPerson(personList);

		// Here we can't change the type of list to Student - here substitution princple
		// doesn't applies
		// Because the method takes the superclass of type list Person
		// To sovle this we introduce wildcards
		List<Student> employeeList = new ArrayList<Student>();
		employeeList.add(new Student(null, null, null));
		employeeList.add(new Student(null, null, null));

		// this two method won't work if we didn't use wildcards
		// List<? extends T> - whatever extends T
		// List<? super T> - whatever is super class of T
		printPerson(employeeList);
		printStudent(personList);
	}

	// Now whatever extends Preson class can access this
	private static void printPerson(List<? extends Person> list) {
		System.out.println(list);
	}

	// Now whatever is the parent class of Student can access this
	private static void printStudent(List<? super Student> list) {
		System.out.println(list);
	}

}
