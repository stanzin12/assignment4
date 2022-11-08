class Employee {
    String name;
    String year_of_joining;
    int salary;
    String address;

    Employee(String name, String year_of_joining, int salary, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }
}

public class q2 {
    public static void main(String[] args) {
        Employee Robert = new Employee("Robert", "1994", 50000, "64C WS");
        Employee Sam = new Employee("Sam", "2000", 50000, "68D WS");
        Employee John = new Employee("John", "1999", 50000, "26B WS");
        Employee Akshat = new Employee("Akshat", "2018", 50000, "jaipur");

        System.out.println("Name" + "Year of joining" + "address");
        System.out.println(Robert.name + " " + Robert.year_of_joining + " " + Robert.address);
        System.out.println(Sam.name + " " + Sam.year_of_joining + " " + Sam.address);
        System.out.println(John.name + " " + John.year_of_joining + " " + John.address);

    }
}
