package generics;

import java.util.ArrayList;
import java.util.List;

import oops.inheritance.Person;
import oops.inheritance.Student;

public class SubsitutionPrinciple {

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
		List<Student> employeeList = new ArrayList<Student>();
		employeeList.add(new Student(null, null, null));
		employeeList.add(new Student(null, null, null));
		// printPerson(employeeList);
	}

	private static void printPerson(List<Person> list) {
		System.out.println(list);
	}

}
