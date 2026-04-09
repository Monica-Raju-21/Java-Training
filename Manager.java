public class Manager extends Employee {
    public Manager(String name, int salaryGrade) {
        super(name, salaryGrade);
    }

    public void calculateBonus() {
        // Accessing the protected variable from the parent class
        double bonus = this.salaryGrade * 1000;
        System.out.println(name + "'s bonus is: $" + bonus);
    }
}