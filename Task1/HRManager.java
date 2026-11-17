package Task1;

import java.util.Random;

public class HRManager {
    private String name;

    public HRManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int rollDice() {
        Random random = new Random();

        int randInt = random.nextInt(1, 7);
        return randInt;
    }

    public void applySalaryChange(Employee employee) {
        int randInt = rollDice();
        double salary = employee.getSalary();

        if (randInt == 3 || randInt == 6) {
            employee.setSalary(salary * 0.8);
            System.out.printf(
                    "эйчар: %s, сотрудник: %s, результат броска: %d, меняем зарплату: ДА, зарплата сотрудника: %f%n",
                    name, employee.getName(), randInt, salary * 0.8);
        } else {
            System.out.printf(
                    "эйчар: %s, сотрудник: %s, результат броска: %d, меняем зарплату: НЕТ, зарплата сотрудника: %f%n",
                    name, employee.getName(), randInt, salary);
        }
    }
}
