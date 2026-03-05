package org.example.character;

import java.util.Date;

public abstract class Character {

    private String name;
    private String dni;
    private String address;
    private String email;

    private int phone;
    private char gender;
    private Date birthdate;

    public Character(String name, String dni, String address, String email, int phone, char gender, Date birthdate) {
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
