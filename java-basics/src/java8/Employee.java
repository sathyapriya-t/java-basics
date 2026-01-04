package java8;

public class Employee {

    private int id;
    private double salary;
    private String depatment;
    private int age;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", depatment='" + depatment + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepatment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, double salary, String depatment, int age) {
        this.id = id;
        this.salary = salary;
        this.depatment = depatment;
        this.age = age;
    }
}
