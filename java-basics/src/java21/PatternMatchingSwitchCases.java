package java21;

class Person {
    void read() {
        System.out.println("Reading From Person");
    }
}

class Student extends Person {
    void read() {
        System.out.println("Reading From Student");
    }
}

class Teacher extends Person {
    void read() {
        System.out.println("Reading From Teacher");
    }
}

public class PatternMatchingSwitchCases {

    public static void main(String[] args) {
        /*
       Teacher teacher = new Teacher();
        Person person = new Person();
        //Pattern matching switch cases
        switch (person) {
            //Instead of using instance of
            //We can use like this
            //java 21
            //creates object and assigns the value to it
            case Teacher teacher1 -> teacher1.read();
            case Student student -> student.read();
            default -> throw new IllegalStateException("Unexpected value: " + person);
        }
*/
    }
}
