public class EmployeeSalary {
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public static void main(String [] args) {
        EmployeeSalary s = new EmployeeSalary();
        s.setSalary(50000);
        System.out.println("Current Salary: " + s.getSalary());
    }
}





