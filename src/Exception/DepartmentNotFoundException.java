package Exception;

public class DepartmentNotFoundException extends Exception {
    private String departmentName;
    public DepartmentNotFoundException(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String getMessage() {
        return "No se encontro el departamento: " + departmentName;
    }
}
