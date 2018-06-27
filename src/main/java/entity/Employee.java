package entity;

import java.util.Objects;

public class Employee {

    private final int id;
    private final String first_name;
    private final String last_name;
    private final String birthday;
    private final int address_id;

    public Employee(int id, String first_name, String last_name, String birthday, int address_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.address_id = address_id;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAddress_id() {
        return address_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                address_id == employee.address_id &&
                Objects.equals(first_name, employee.first_name) &&
                Objects.equals(last_name, employee.last_name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, first_name, last_name, birthday, address_id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address_id=" + address_id +
                '}';
    }
}
