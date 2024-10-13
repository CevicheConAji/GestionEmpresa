package Models;
import Models.Company;
import Models.Department;
import Models.Worker;
import Exception.DepartmentNotFoundException;
import java.util.LinkedList;
import Exception.EmployeeNotFoundException;

public class ManagerTest {

    private  LinkedList<Worker> workers = new LinkedList<>();
    private LinkedList<Department> departmentsMost = new LinkedList<>();
    private LinkedList<Department> departmentsFewest = new LinkedList<>();
    private String nameDepart ;
    private String workerNIF ;

    public ManagerTest() {
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
        this.nameDepart = nameDepart;
    }

    public String getWorkerNIF() {
        return workerNIF;
    }

    public void setWorkerNIF(String workerNIF) {
        this.workerNIF = workerNIF;
    }

    public void tets(){
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

        try {
            workers = company.getEmployeeDepartment(nameDepart);
            printWorkers();
            company.getDataDepartment(nameDepart);

        } catch (DepartmentNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            company.getDataWorkerNIF(workerNIF);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        departmentsMost = company.getDepartmentsMostWorkers();
        printDepartments(departmentsMost);
        departmentsFewest = company.getDepartmentsFewestWorker();
        printDepartments(departmentsFewest);


    }
    private void printDepartments(LinkedList<Department> departments){
        for(Department department : departments){
            System.out.println(department);
        }
    }

    private void printWorkers(){
        for(Worker w : workers){
            System.out.println(w.toString());
        }
    }
}
