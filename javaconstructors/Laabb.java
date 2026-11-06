class Student{
    private String name;
    private int rollNumber;
    private double marks;
    public Student(){
        name = "unknown";
        rollNumber = 0;
        marks = 0.0;
        System.out.println("Default Constructor called!");
    }
    public void setname(String name){
        this.name = name;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void setmarks(double marks){
        this.marks = marks;
    }
    public void displaymethods(){
        System.out.println("Name:"+ name +", Roll Number: " + rollNumber + ", Marks: " + marks);
    }
}
public class Laabb{
    public static void main(String[] args) {
        System.out.println("initial values");
        Student s1 = new Student();
        Student s2 = new Student();
        s1.displaymethods();
        s2.displaymethods();

        System.out.println("After updating:");

        s1.setname("Amit Kumar");
        s1.setRollNumber(101);
        s1.setmarks(85.5);

        s1.displaymethods();
        s2.displaymethods();
    }
}