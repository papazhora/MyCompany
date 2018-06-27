package entity;

import java.util.Objects;

public class Address {

    private final int id;
    private final String country;
    private final String street;
    private final String post_code;

    public Address(int id, String country, String street, String post_code) {
        this.id = id;
        this.country = country;
        this.street = street;
        this.post_code = post_code;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id &&
                Objects.equals(country, address.country) &&
                Objects.equals(street, address.street) &&
                Objects.equals(post_code, address.post_code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, country, street, post_code);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", post_code='" + post_code + '\'' +
                '}';
    }
}
