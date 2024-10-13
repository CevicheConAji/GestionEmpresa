package Models;

import java.util.LinkedList;

public class Department {
    private String nameDepartment;
    private int size;
    private LinkedList<Worker> workers = new LinkedList<Worker>();

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;

    }

    public Department() {
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

    public LinkedList<Worker> getEmployees() {
        return workers;
    }

    public void setEmployees(LinkedList<Worker> workers) {
        this.workers = workers;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
        size++;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\nnameDepartment='" + nameDepartment +
                ", size=" + size +
                ", employees = " + workers +
                "}\n";
    }

}
