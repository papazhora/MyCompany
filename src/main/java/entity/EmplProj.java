package entity;


import java.util.Objects;

public class EmplProj {

    private final int employee_id;
    private final int project_id;

    public EmplProj(int employee_id, int project_id) {
        this.employee_id = employee_id;
        this.project_id = project_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getProject_id() {
        return project_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmplProj emplProj = (EmplProj) o;
        return employee_id == emplProj.employee_id &&
                project_id == emplProj.project_id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(employee_id, project_id);
    }

    @Override
    public String toString() {
        return "EmplProj{" +
                "employee_id=" + employee_id +
                ", project_id=" + project_id +
                '}';
    }
}
