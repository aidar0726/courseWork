
public class Main {
    public static void main(String[] args) {
        Employee employeeDataArray[] = new Employee[10];

        employeeDataArray = new Employee[]{
                new Employee("Джон Траволта", 120_000, 3),
                new Employee("Брэд Питт", 80_000, 5),
                new Employee("Курт Рассел", 95_000, 2),
                new Employee("Мила Йовович", 75_000, 1),
                new Employee("Эдвард Нортон", 60_000, 4),
                new Employee("Джерард Батлер", 140_000, 2),
                new Employee("Джесика Честейн", 90_000, 3),
                new Employee("Деми Мур", 130_000, 4),
                new Employee("Дэнзел Вашингтон", 110_000, 3),
                new Employee("Рассел Кроу", 70_000, 2),
        };

        EmployeeСlassMethods.printsEmployeeInformation(employeeDataArray);
        System.out.println("Общая сумма потраченная на зарплаты сотрудников - " + EmployeeСlassMethods.printSumEmployeeSalary(employeeDataArray) + " руб.");
        System.out.println("Среднее значение зарплат сотрудников - " + EmployeeСlassMethods.printsAvgEmployeeSalary(employeeDataArray) + " руб.");
        System.out.println("Максимальная заробатная плата составляет - " + EmployeeСlassMethods.findMaxEmployeeSalary(employeeDataArray) + " руб.");
        System.out.println("Минимальная заробатная плата составляет - " + EmployeeСlassMethods.findMinEmployeeSalary(employeeDataArray) + " руб.");
        EmployeeСlassMethods.showsLastNameEmployee(employeeDataArray);

        /*вывод результата методов повышенной сложности*/

        System.out.println("Общая сумма зароботной платы по 3-му отделу составляет - " + EmployeeСlassMethods.printMaxSumSalaryDepartment(employeeDataArray, 3) + " руб.");
        System.out.println("Максимальная зароботная плата по 3-му отделу составляет - " + EmployeeСlassMethods.findMaxDepartmentSalary(employeeDataArray, 3) + " руб.");
        System.out.println("Средняя зароботная плата по 3-му отделу составляет - " + EmployeeСlassMethods.printAvgSalaryDepartment(employeeDataArray, 3) + " руб.");
        EmployeeСlassMethods.printInfoEmployeeDepartment(employeeDataArray, 2);
        EmployeeСlassMethods.printPercentSalary(employeeDataArray, 7);
        EmployeeСlassMethods.printLessNumberSalary(employeeDataArray, 100_000);
        EmployeeСlassMethods.printMoreNumberSalary(employeeDataArray, 100_000);
        EmployeeСlassMethods.printPercentDepartmentSalary(employeeDataArray, 3, 12);

        /* Напишите программу, которая переворачивает массив (задача по билету)*/
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int count = 0;
        for (int i = myArray.length - 1; i >= 0; i--) {
            myArray[count++] = myArray[i];
        }
    }
}