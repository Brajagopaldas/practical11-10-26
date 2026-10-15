public class Student1 {
    int studentId;
    String name;

    static int nextId;
    static String collegeName;

    static {
        collegeName = "ABC College";
        nextId = 35001;
    }
    Student1(String name) {
        this.name = name;
        this.studentId = nextId;
        nextId++;
    }

    void display() {
        System.out.println("\n-------------------------");
        System.out.println("Student Id : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("College Name : " + collegeName);
        System.out.println("-------------------------");
    }

    static void displayCollege() {
        System.out.println("\n-------------------------");
        System.out.println("College Name : " + collegeName);
        System.out.println("Next  Id : " + nextId);
        System.out.println("-------------------------");

    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Ram");
        Student1 s2 = new Student1("Ramesh");
        Student1 s3 = new Student1("Abhishek");
        Student1 s4 = new Student1("Rohit");
        Student1 s5 = new Student1("Vishal");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

        Student1.displayCollege();
    }
}
