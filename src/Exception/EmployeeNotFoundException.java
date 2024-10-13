package Exception;

public class EmployeeNotFoundException extends Exception {
    private String employeeNIF;

    public EmployeeNotFoundException(String employeeNIF) {
        this.employeeNIF = employeeNIF;
    }

    public String getEmployeeNIF() {
        return employeeNIF;
    }

    @Override
    public String getMessage() {
        return "Employee with NIF " + employeeNIF + " not found";
    }
}
