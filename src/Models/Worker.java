package Models;

import Interface.IWorker;

import java.util.LinkedList;

public class Worker implements Comparable<Worker>{
    private String workerNIF;
    private String firstName;
    private String lastName;
    private String position;

    public Worker(String workerNIF, String firstName, String lastName, String position) {
        this.workerNIF = workerNIF;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Worker() {
    }

    public String getWorkerNIF() {
        return workerNIF;
    }

    public void setWorkerNIF(String workerNIF) {
        this.workerNIF = workerNIF;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public int compareTo(Worker o) {
        int positionDiff = this.position.compareTo(o.position);
        int lastNameDiff = this.lastName.compareTo(o.lastName);
        int workerNIFDiff = this.workerNIF.compareTo(o.workerNIF);

        if (positionDiff != 0) {
            return positionDiff;
        }
        if (lastNameDiff != 0) {
            return lastNameDiff;
        }

        return workerNIFDiff;
    }


    @Override
    public String toString() {
        return getClass().getName() +
                "employeeNIF=" + workerNIF +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", position='" + position +
                "}\n";
    }

}
