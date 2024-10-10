package Interface;

import Models.Department;

import java.util.LinkedList;

public interface IWorker {
    void getDataWorkerNIF(String workerNIF);
    LinkedList<Department> getDepartmentsMostWorkers();
    LinkedList<Department> getDepartmentsFewestWorker(String workerNIF);
}
