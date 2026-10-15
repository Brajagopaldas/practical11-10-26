public class Student {
    int rollNo;
    String name;
    int marks;
    static int student = 0;

    Student (int rollNo, String name , int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        student++;
    }
    void display() {
        System.out.println("\n-----------------------");
        System.out.println("Roll No :  " +  rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
    static void diplaytotal() {
        System.out.println("\nTotal Students : " + student);
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ram", 80);
        Student s2 = new Student(102, "Laxman", 77);
        Student s3 = new Student(103, "Bharat", 93);

        s1.display();
        s2.display();
        s3.display();

        Student.diplaytotal();
    }
}
