package Interface;

import Models.Department;
import Models.Worker;

import java.util.LinkedList;

public interface ICompany {
    LinkedList<Worker> getEmployeeDepartment(String nameDepart);
    void getDataDepartment(String nameDepart);
}
