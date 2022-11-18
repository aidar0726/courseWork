public class EmployeeСlassMethods {
    /* метод для получения всех данных о сотрудниках*/
    public static void printsEmployeeInformation(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            System.out.println(arr[i].toString());
        }
    }

    /*метод для нахождения суммы затрат на зарплаты в месяц*/
    public static int printSumEmployeeSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            sum = arr[i].getEmployeesSalary() + sum;
        }

        return sum;
    }

    /*метод для подсчета среднего значения зарплат сотрудников*/
    public static float printsAvgEmployeeSalary(Employee[] arr) {
        return printSumEmployeeSalary(arr) / arr.length;
    }

    /*метод для нахождения максимальной зароботной платы*/
    public static int findMaxEmployeeSalary(Employee[] arr) {
        int max = arr[0].getEmployeesSalary();
        ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getEmployeesSalary() > max) {
                max = arr[i].getEmployeesSalary();
            }
        }

        return max;
    }

    /*метод для нахождения минимальной зароботной платы*/
    public static int findMinEmployeeSalary(Employee[] arr) {
        int min = arr[0].getEmployeesSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getEmployeesSalary() < min) {
                min = arr[i].getEmployeesSalary();
            }
        }

        return min;
    }


    /*метод для вывода списка ФИО сотрудников*/
    public static void showsLastNameEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            System.out.println("ФИО сотрудника: " + arr[i].getEmployeeInformation());
        }
    }

    /*-----------методы задач повышенной сложности------------------------*/


    /*метод для нахождения изменения зарплаты в зависимости от заданного процента*/
    public static void printPercentSalary(Employee[] arr, int percent) {
        float percentageСhange = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            percentageСhange = (arr[i].getEmployeesSalary() * percent) / 100;
            System.out.println("Увеличение % соотношения сотрудника: " + arr[i].getEmployeeInformation() + " изменится на " + percentageСhange);
        }

    }

    /*метод для нахождения  зарплаты меньше заданного числа числа */
    public static void printLessNumberSalary(Employee[] arr, int givenNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getEmployeesSalary() < givenNumber) {
                printEmploeeSalary(arr[i]);
            }
        }

    }

    /*метод для нахождения  зарплаты больше заданного числа числа */
    public static void printMoreNumberSalary(Employee[] arr, int givenNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getEmployeesSalary() >= givenNumber) {
                printEmploeeSalary(arr[i]);
            }
        }

    }

    /*метод для печати данных сотрудника*/
    public static void printEmploeeSalary(Employee object) {
        System.out.println("ID: " +
                object.getEmployeesId() + ", ФИО: " +
                object.getEmployeeInformation() + ", Зарплата: " +
                object.getEmployeesSalary());
    }

    /*метод для нахождения максимальной зароботной платы определенного отдела*/
    public static int findMaxDepartmentSalary(Employee[] arr, int departmentNumber) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getDepartmentEmployee() == departmentNumber && arr[i].getEmployeesSalary() > max) {
                max = arr[i].getEmployeesSalary();
            }
        }

        return max;
    }


    /*Метод для расчета суммы зарплат сотрудников по одтелу*/
    public static int printMaxSumSalaryDepartment(Employee[] arr, int departmentNumber) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getDepartmentEmployee() == departmentNumber) {
                sum = arr[i].getEmployeesSalary() + sum;
            }
        }

        return sum;
    }

    /*Метод для нахождение средней зароботной платы по отделу*/
    public static float printAvgSalaryDepartment(Employee[] arr, int departmentNumber) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getDepartmentEmployee() == departmentNumber) {
                sum = arr[i].getEmployeesSalary() + sum;
                count++;
            }
        }

        return sum / count;
    }

    /* метод для нахождения изменения зарплаты определенного отдела в зависимости от заданного процента*/
    public static void printPercentDepartmentSalary(Employee[] arr, int departmentNumber, int percent) {
        float percentageСhange = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getEmployeesSalary() == departmentNumber) {
                percentageСhange = (arr[i].getEmployeesSalary() * percent) / 100;
                System.out.println("Увеличение % соотношения сотрудника: " + arr[i].getEmployeeInformation() + " изменится на " + percentageСhange);
            }

        }
    }

    /*Метод для вывода всех сотрудников отдела*/
    public static void printInfoEmployeeDepartment(Employee[] arr, int departmentNum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            if (arr[i].getDepartmentEmployee() == departmentNum) {
                System.out.println("ФИО сотрудника " +
                        departmentNum + " отдела: " +
                        arr[i].getEmployeeInformation() + ", ID: " +
                        arr[i].getEmployeesId() + ", Зарплата сотрудника:" +
                        arr[i].getEmployeesSalary());
            }
        }
    }

}
