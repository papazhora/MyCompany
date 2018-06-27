package entity;

import java.util.Objects;

public class Address {

    private final int id;
    private final String country;
    private final String street;
    private final String post_code;

    Address address = new Address() {

    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getPost_code() {
        return post_code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return id == address1.id &&
                Objects.equals(country, address1.country) &&
                Objects.equals(street, address1.street) &&
                Objects.equals(post_code, address1.post_code) &&
                Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, country, street, post_code, address);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", post_code='" + post_code + '\'' +
                ", address=" + address +
                '}';
    }
}
