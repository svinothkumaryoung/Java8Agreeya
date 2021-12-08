package com.agreeya.StudentPojoClass;

public class StudentInfoModel {
    private int RegisterNo;
    private String name;
    private String City;
    private String Country;
    private String Zipcode;

    public StudentInfoModel()
    {

    }
    public StudentInfoModel(int registerNo, String name, String city, String country, String zipcode) {
        RegisterNo = registerNo;
        this.name = name;
        City = city;
        Country = country;
        Zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "StudentInfoModel{" +
                "RegisterNo=" + RegisterNo +
                ", name='" + name + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                '}';
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }
}
