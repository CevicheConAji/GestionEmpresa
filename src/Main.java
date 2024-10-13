import Models.Company;
import Models.Department;
import Models.ManagerTest;
import Models.Worker;
import Exception.DepartmentNotFoundException;
import java.util.LinkedList;
import Exception.EmployeeNotFoundException;

public class Main {
    public static void main(String[] args) {
        ManagerTest manager = new ManagerTest();
        manager.setNameDepart("Development");
        manager.setWorkerNIF("121");
        manager.tets();
    }
}