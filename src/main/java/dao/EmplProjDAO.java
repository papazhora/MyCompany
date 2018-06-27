package dao;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDAO {

    //create
    void add(EmplProj emplProj);

    //read
    List<EmplProj> getAll(int id);

    EmplProj getByEmployeeIdAndProjectId(int employee_id, int project_id);

    //update
    void update(EmplProj emplProj);

    //delete
    void remove(EmplProj emplProj);
}
