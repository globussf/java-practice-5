package Task1;

public class Main {
    public void main() {
        Employee emp1 = new Employee("Даня", 20);
        Employee emp2 = new Employee("Артём", 120);
        Employee emp3 = new Employee("Глеб", 500);

        HRManager HR = new HRManager("Васяня");

        HR.applySalaryChange(emp1);
        HR.applySalaryChange(emp2);
        HR.applySalaryChange(emp3);

        System.out.printf(
                "%n=========================================================================================%n%n");

        System.out.println(emp1.getStatus());
        System.out.println(emp2.getStatus());
        System.out.println(emp3.getStatus());
    }
}
