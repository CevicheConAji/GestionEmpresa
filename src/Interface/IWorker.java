package Interface;

import Models.Department;
import Exception.EmployeeNotFoundException;

import java.util.LinkedList;

public interface IWorker {
    void getDataWorkerNIF(String workerNIF) throws EmployeeNotFoundException;
    LinkedList<Department> getDepartmentsMostWorkers();
    LinkedList<Department> getDepartmentsFewestWorker();
}
