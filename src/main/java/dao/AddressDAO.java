package dao;

import entity.Address;

import java.util.List;

public interface AddressDAO {

    //create
    void add(Address address);

    //read
    List<Address> getAll();

    Address getById(int id);

    //update
    void update(Address address);

    //delete
    void remove(Address address);
}
