package com.space.ajit.universe.model.company;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public Contact(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (getFirstName() != null ? !getFirstName().equals(contact.getFirstName()) : contact.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(contact.getLastName()) : contact.getLastName() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(contact.getAddress()) : contact.getAddress() != null)
            return false;
        return getPhone() != null ? getPhone().equals(contact.getPhone()) : contact.getPhone() == null;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }

}
