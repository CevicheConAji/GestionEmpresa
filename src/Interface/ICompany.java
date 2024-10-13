package Interface;

import Models.Worker;
import Exception.DepartmentNotFoundException;
import java.util.LinkedList;

public interface ICompany {
    LinkedList<Worker> getEmployeeDepartment(String nameDepart) throws DepartmentNotFoundException;
    void getDataDepartment(String nameDepart) throws DepartmentNotFoundException;
}
