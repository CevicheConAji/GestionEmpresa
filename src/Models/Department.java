package Models;

import java.util.LinkedList;

public class Department {
    private String nameDepartment;
    private int size;
    private LinkedList<Employee> employees = new LinkedList<Employee>();

    public Department(String nameDepartment, int size) {
        this.nameDepartment = nameDepartment;
        this.size = size;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "nameDepartment='" + nameDepartment + '\'' +
                ", size=" + size +
                ", employees=" + employees +
                '}';
    }
}
