import Models.Company;
import Models.Department;
import Models.Worker;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        tets();
    }
    public static LinkedList<Worker> workers = new LinkedList<>();
    public static LinkedList<Department> departmentsMost = new LinkedList<>();
    public static LinkedList<Department> departmentsFewest = new LinkedList<>();

    public static void tets(){
        LinkedList<Company> list = new LinkedList<>();

        Company company = new Company("Disney","ABC123");

        Department department01 = new Department("Development");
        Department department02 = new Department("Sales and Marketing");
        Department department03 = new Department("Design");

        Worker worker01 = new Worker("123","Piero","Zavala","Software Development");
        Worker worker02 = new Worker("122","Paco","Perez","DevOp");

        Worker worker03 = new Worker("124","Elon","Musk","Marketing");
        Worker worker04 = new Worker("122","Mark","Zuckenberg","Sales");

        Worker worker05 = new Worker("121","Antonio","Bandera","User Experience (UX) Design");
        Worker worker06 = new Worker("120","Javier","Bardem","User Interface (UI) Design");
        Worker worker07 = new Worker("119","Jorge","George","Payaso");

        list.add(company);

        company.addDepartment(department01);
        company.addDepartment(department02);
        company.addDepartment(department03);

        department01.addWorker(worker01);
        department01.addWorker(worker02);

        department02.addWorker(worker03);
        department02.addWorker(worker04);

        department03.addWorker(worker05);
        department03.addWorker(worker06);
        department03.addWorker(worker07);

        workers = company.getEmployeeDepartment("Sales and Marketing");
        printWorkers();
        company.getDataDepartment("Design");
        company.getDataWorkerNIF("121");

        departmentsMost = company.getDepartmentsMostWorkers();
        printDepartments(departmentsMost);
        departmentsFewest = company.getDepartmentsFewestWorker();
        printDepartments(departmentsFewest);

    }
    public static void printDepartments(LinkedList<Department> departments){
        for(Department department : departments){
            System.out.println(department);
        }
    }

    public static void printWorkers(){
        for(Worker w : workers){
            System.out.println(w.toString());
        }
    }
}