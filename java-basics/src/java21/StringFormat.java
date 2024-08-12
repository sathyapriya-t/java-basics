package java21;

import data.Student;
import data.StudentDataBase;

import java.util.function.Supplier;

public class StringFormat {

    public static void main(String[] args) {
        Supplier<Student> studentList = StudentDataBase.studentSuplier;
        Student student = studentList.get();

        //Other string formatters are hard to read
        //STR." string \{value}";
        //FMT." string %.2f\{value}"; -> decimal formatting

        //StringFormat stringFormat = STR. "This is \{student.getName()}";
        //StringFormat stringFormat1 = FMT. "This is %.2F\{student.getName()}";
    }
}
