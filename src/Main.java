import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        String arrayFirstLastNames[] = new String[10];
        Employee employeeDataArray[] = new Employee[10];

        arrayFirstLastNames[0] = "Иванов Иван Петрович";
        arrayFirstLastNames[1] = "Галкин Василий Иванович";
        arrayFirstLastNames[2] = "Ветров Генадий Семенович";
        arrayFirstLastNames[3] = "Руденко Павел Гарикович";
        arrayFirstLastNames[4] = "Шипотько Григорий Владимирович";
        arrayFirstLastNames[5] = "Газманов Олег Петрович";
        arrayFirstLastNames[6] = "Петросян Яков Юрьевич";
        arrayFirstLastNames[7] = "Шугай Леонид Якубович";
        arrayFirstLastNames[8] = "Валуев Николай Джонович";
        arrayFirstLastNames[9] = "Казаков Юрий Степанович";

        /* или лучше не циклом а прописать метод создания в массива в классе ? сделать метод который возвращает массив ?*/
        for (int i = 0; i < arrayFirstLastNames.length; i++) {
            employeeDataArray[i] = new Employee(arrayFirstLastNames[i], random.nextInt(120_000), random.nextInt(6) + 1);
        }

        Employee.printsEmployeeInformation(employeeDataArray);
        System.out.println("Общая сумма потраченная на зарплаты сотрудников - " + Employee.printSumEmployeeSalary(employeeDataArray) + " руб.");
        System.out.println("Среднее значение зарплат сотрудников - " + Employee.printsAvgEmployeeSalary(employeeDataArray) + " руб.");
        System.out.println("Максимальная заробатная плата составляет - " + Employee.findMaxEmployeeSalary(employeeDataArray) + " руб.");
        Employee.showsLastNameEmployee(employeeDataArray);
    }
}