package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Address {
    private SalutationType salutation;
    private String firstName;
    private String surName;
    private String street1;
    private String street2;
    private String street3;
    private String postalCode;
    private String city;
    private String county;
    private String country;
    private String telephoneNumber;
    private String email;
    private String company;
    private AddressLocationType locationType;

    public AddressLocationType getLocationType() {
        return locationType;
    }

    public Address setLocationType(AddressLocationType locationType) {
        this.locationType = locationType;
        return this;
    }

    public SalutationType getSalutation() {
        return salutation;
    }

    public Address setSalutation(SalutationType salutation) {
        this.salutation = salutation;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Address setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public String getStreet1() {
        return street1;
    }

    public Address setStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    public String getStreet2() {
        return street2;
    }

    public Address setStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    public String getStreet3() {
        return street3;
    }

    public Address setStreet3(String street3) {
        this.street3 = street3;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public Address setCounty(String county) {
        this.county = county;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Address setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Address setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Address setCompany(String company) {
        this.company = company;
        return this;
    }

}
