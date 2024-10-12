package Models;

import Interface.ICompany;
import Interface.IWorker;

import java.util.LinkedList;

public class Company implements ICompany, IWorker {
    private String nameCompany;
    private String  companyCIF ;
    private LinkedList<Department> departments = new LinkedList<Department>();

    public Company(String nameCompany, String companyCIF) {
        this.nameCompany = nameCompany;
        this.companyCIF = companyCIF;
    }

    public Company() {
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCompanyCIF() {
        return companyCIF;
    }

    public void setCompanyCIF(String companyCIF) {
        this.companyCIF = companyCIF;
    }

    public LinkedList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(LinkedList<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return getClass().getName()+
                "\nnameCompany='" + nameCompany + '\'' +
                ", companyCIF='" + companyCIF + '\'' +
                ", departments=" + departments +
                "}\n";
    }

    @Override
    public LinkedList<Worker> getEmployeeDepartment(String nameDepart) {
        LinkedList<Worker> employees = new LinkedList<>();

        for (Department department : departments) {
            if (department.getNameDepartment().equals(nameDepart)) {
                for (Worker w : department.getEmployees()){
                    employees.add(w);
                }
            }
        }
        return employees;
    }

    @Override
    public void getDataDepartment(String nameDepart) {
        for (Department department : departments) {
            if (department.getNameDepartment().equals(nameDepart)) {
                System.out.print(department);
            }
        }
    }

    @Override
    public void getDataWorkerNIF(String workerNIF) {
        for(Department department : departments) {
            for(Worker w : department.getEmployees()) {
                if(w.getWorkerNIF().equals(workerNIF)) {
                    System.out.println(w);
                }
            }
        }
    }

    @Override
    public LinkedList<Department> getDepartmentsMostWorkers() {
        LinkedList<Department> mostWorkers = new LinkedList<>();
        int numeroMayor = 0;

        for (Department department : departments) {
            if(department.getEmployees().size() > numeroMayor) {
                mostWorkers.clear();
                mostWorkers.add(department);
                numeroMayor = department.getEmployees().size();
            }else if(department.getEmployees().size() == numeroMayor) {
                mostWorkers.add(department);
            }
        }
        return mostWorkers;
    }

    @Override
    public LinkedList<Department> getDepartmentsFewestWorker() {
        LinkedList<Department> fewestWorkers = new LinkedList<>();
        int fewestNum = departments.size();

        for (Department department : departments) {
            if(department.getEmployees().size() < fewestNum) {
                fewestWorkers.clear();
                fewestWorkers.add(department);
                fewestNum = department.getEmployees().size();
            }else if(department.getEmployees().size() == fewestNum) {
                fewestWorkers.add(department);
            }
        }


        return fewestWorkers;
    }
}
