package oops.abstracts;

interface Person {

    //Abstract method - method with no implementation
    //All the abstract method should be implemented by the child classes

    //static and default methods can be created in interfaces
    //Default method - can be inherited by all the implementing classes and can be overriden using other access modifiers(private, public,protected)
    //Static method - can not be inherited or overriden cause it belongs to the class
    void read();

    static void write() {
        System.out.println("Writing");
    }

    default void readAndWrite() {
        System.out.println("Reading and Writing");
    }
}

class Students implements Person {

    //Abstract method implemented
    @Override
    public void read() {
        System.out.println("Reading");
    }

    //this gives error because static methods can't be overriden
//    @Override
//    static void write() {
//        System.out.println("Writing");
//    }

    // this can be overidden - by declaring it as public or private protected
    // Because default method only allowed in the interface 
    @Override
    public void readAndWrite(){
        System.out.println("Reading and Writing");
    }
}

public class StaticAndDefaultMethodInheritance {
    public static void main(String[] args) {

        //Object cannot be created using Interface only
        //It can be done only using Implementing classes
        Person person = new Students();
        
        //calling an abstract method which is implemented
        person.read();
        //calling a default method from implementing class object
        person.readAndWrite();

        //static method only should be called By Interface name
        Person.write();
    }
}
