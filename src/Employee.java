import java.util.Objects;

public class Employee {
    private String employeeInformation;
    private int employeesSalary;
    private int departmentEmployee;
    private static int count = 1;
    private int id;

    public Employee(String employeeInformation, int employeesSalary, int departmentEmployee) {
        this.employeeInformation = employeeInformation;
        this.employeesSalary = employeesSalary;
        this.departmentEmployee = departmentEmployee;
        this.id = count++;
    }

    public int getEmployeesSalary() {
        return employeesSalary;
    }

    public int getEmployeesId() {
        return id;
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


    @Override
    public String toString() {
        return "ФИО: " + employeeInformation + " , ID " + id + ", Отдел: " + departmentEmployee + ", Зарплата " + employeesSalary;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return employeeInformation.equals(c2.employeeInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
