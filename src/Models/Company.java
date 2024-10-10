package Models;

import java.util.LinkedList;

public class Company {
    private String nameCompany;
    private String  companyCIF ;
    private LinkedList<Department> departments = new LinkedList<Department>();

    public Company(String nameCompany, String companyCIF) {
        this.nameCompany = nameCompany;
        this.companyCIF = companyCIF;
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

    @Override
    public String toString() {
        return getClass().getName()+
                " nameCompany='" + nameCompany + '\'' +
                ", companyCIF='" + companyCIF + '\'' +
                ", departments=" + departments +
                "}\n";
    }
}
