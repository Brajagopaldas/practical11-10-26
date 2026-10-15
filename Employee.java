public class Employee {
    int empId;
    String name;

    static String companyName = "ABC Tech";
    static int totalEmp = 0;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
        totalEmp++;
    }
    
    void display() {
        System.out.println("\n----------------------");
        System.out.println("Employee Id : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Company Name : " + companyName);
        System.out.println("----------------------");
    }
    
    static void diplaytotal() {
        System.out.println("\n----------------------");
        System.out.println("Company Name : " + companyName);
        System.out.println("Total Employee : " + totalEmp);
        System.out.println("\n----------------------");
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(501,"Suresh");
        Employee e2 = new Employee(502,"Ram");
        Employee e3 = new Employee(503,"Laxman");
        Employee e4 = new Employee(504,"Sita");

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        Employee.diplaytotal();
    }
}
