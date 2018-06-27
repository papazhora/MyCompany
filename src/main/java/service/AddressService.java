package service;

import bl.Util;
import dao.AddressDAO;
import entity.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressService extends Util implements AddressDAO {

    Connection connection = getConnection();

    @Override
    public void add(Address address) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO address (ID, COUNTRY, CITY, STREET, POST_CODE) VALUES (?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, address.getId());
            preparedStatement.setString(2, address.getCountry());
            preparedStatement.setString(2, address.getCity());
            preparedStatement.setString(2, address.getStreet());
            preparedStatement.setString(2, address.getPost_code());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<Address> getAll() throws SQLException {
        List<Address> addressesList = new ArrayList<>();
        String sql = "SELECT ID, COUNTRY, CITY, STREET, POST_CODE";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Address address = new Address(resultSet.getInt("ID"),
                        resultSet.getString("COUNTRY"),
                        resultSet.getString("CITY"),
                        resultSet.getString("STREET"),
                        resultSet.getString("POST_CODE"));

                addressesList.add(address);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return addressesList;
    }

    @Override
    public Address getById(int id) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void remove(Address address) {

    }
}
