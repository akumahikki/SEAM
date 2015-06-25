package com.example.bps_csp.mycontacts.data;

/**
 * Created by bps_csp on 24/06/15.
 */
public class Contact {
    String name;
    String email;
    String Address;
    Long phone;

    public Contact(String name, String email, String address, Long phone) {
        this.name = name;
        this.email = email;
        Address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
