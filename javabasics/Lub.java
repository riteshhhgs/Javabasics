class Employee{
    private int employeeid;
    private String name;
    private double salary;
    private String department;

    public Employee(int employeeid, String name,double salary,String department){
        this.employeeid = employeeid;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayinfo(){
        System.out.println("Employee ID: " + employeeid +
        ", Name: " + name +
        ", Department: " + department +
        ", Monthly Salary: " + salary);
    }
    public double sal(){
        return salary * 12;
    }
}
public class Lub {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul Sharma", 50000.0, "IT");
        Employee e2 = new Employee(102, "Priya Patel", 45000.0, "HR");
        Employee e3 = new Employee(103, "Vijay Singh", 55000.0, "Finance");

        e1.displayinfo();
        System.out.println("Annual Salary: " + e1.sal());

        e2.displayinfo();
        System.out.println("Annual Salary: " + e2.sal());

        e3.displayinfo();
        System.out.println("Annual Salary: " + e3.sal());
    }
}