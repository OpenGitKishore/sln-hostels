package com.sln.hostels.model;

public class OfficeAddress {

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String zipCode;
    private String state;
    private String country;

    public OfficeAddress() {
    }

    public OfficeAddress(String addressLine1, String addressLine2, String addressLine3,
                         String city, String zipCode, String state, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{\"OfficeAddress\":{"
                + "\"addressLine1\":\"" + addressLine1 + "\""
                + ", \"addressLine2\":\"" + addressLine2 + "\""
                + ", \"addressLine3\":\"" + addressLine3 + "\""
                + ", \"city\":\"" + city + "\""
                + ", \"zipCode\":\"" + zipCode + "\""
                + ", \"state\":\"" + state + "\""
                + ", \"country\":\"" + country + "\""
                + "}}";
    }
}
