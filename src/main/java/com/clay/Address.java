package com.clay;
import java.lang.ref.SoftReference;

/**
 * Address
 */
public class Address {
    String address;

    String city;

    String state;

    final String ADDRESS_DATA_FILE = "Address.txt";

    public Address(String add, String cty, String st) {
        this.address = add;
        this.city = cty;
        this.state = st;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isValid() {
        if (getState().trim().length() == 2) {
            return false;
        }
        return true;
    }

    public boolean save() {
        return true;
    }
}