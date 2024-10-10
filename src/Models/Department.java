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

    public int size(){
        return workers.size();
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
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "nameDepartment='" + nameDepartment + '\'' +
                ", size=" + size +
                ", employees=" + workers +
                '}';
    }

}
