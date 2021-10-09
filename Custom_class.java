class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee kalash = new Employee(); // Instantiating a new Employee Object
        Employee akku = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for kalash
        kalash.id = 12;
        kalash.salary = 34;
        kalash.name = "Kalash tyagi";

        // Setting Attributes for akku
        akku.id = 17;
        akku.salary = 12;
        akku.name = "Akku tyagi";

        // Printing the Attributes
        kalash.printDetails();
        akku.printDetails();
        int salary = akku.getSalary();
        System.out.println(salary);
        System.out.println(kalash.getSalary());
        // System.out.println(kalash.id);
        // System.out.println(kalash.name);
    }
}
