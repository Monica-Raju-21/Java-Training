package Inheritance;

class Employee{
    String name;
    double salary;

    void displayDetails(){
        System.out.println("EmployeeName:" +name);
        System.out.println("BaseSalary:$" +salary);
    }
}

class Manager extends Employee{
    double bonus;

    void showTotalEarnings(){
        double total=salary+bonus;
        System.out.println("Total Earnings (Salary + Bonus): $" + total);

    }
}

public class InheritanceExample3 {
    public static void main(String[] args){
        Manager myManager = new Manager();

        myManager.name="Alice";
        myManager.salary=75000;
        myManager.bonus=5000;
        myManager.displayDetails();
        myManager.showTotalEarnings();
    }
}
