public class Employee {
    private String employeeInformation;
    private int employeesSalary;
    private int departmentEmployee;

    private static int count;

    private int id;

    public Employee(String employeeInformation, int employeesSalary, int departmentEmployee) {
        this.employeeInformation = employeeInformation;
        this.employeesSalary = employeesSalary;
        this.departmentEmployee = departmentEmployee;
        count++;
        this.id = count;
    }

    public int getEmployeesSalary() {
        return employeesSalary;
    }

    public String getEmployeeInformation() {
        return employeeInformation;
    }

    public int getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setEmployeesSalary(int employeesSalary) {
        this.employeesSalary = employeesSalary;
    }


    public void setDepartmentEmployee(int departmentEmployee) {
        if (departmentEmployee <= 5 && departmentEmployee >= 0) {
            this.departmentEmployee = departmentEmployee;
        } else {
            System.out.println("Некооректное значение! Номер одтела должен находиться в пределах от 1 до 5");
        }

    }

    /* метод для получения всех данных о сотрудниках*/
    public static void printsEmployeeInformation(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    /*метод для нахождения суммы затрат на зарплаты в месяц*/
    public static int printSumEmployeeSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
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
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEmployeesSalary() > max) {
                max = arr[i].getEmployeesSalary();
            }
        }

        return max;
    }


    /*метод для вывода списка ФИО сотрудников*/
    public static void showsLastNameEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ФИО сотрудника: " + arr[i].getEmployeeInformation());
        }
    }


    @Override
    public String toString() {
        return "ФИО: " + employeeInformation + " , ID " + id + ", Отдел: " + departmentEmployee + ", Зарплата " + employeesSalary;
    }


}
