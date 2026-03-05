package org.example.character;

import java.time.LocalDate;


public abstract class Character {

    private String name;
    private String dni;
    private String address;
    private String email;
    private String phone;

    private char gender;
    private LocalDate birthdate;

    public Character(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate) {
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthdate = birthdate;
    }
    public String displayInfoCharacter(){
        return "Nombre: " + name +
                "\nDNI: " + dni +
                "\nDirección: " + address +
                "\nEmail: " + email +
                "\nTeléfono: " + phone +
                "\nGénero: " + gender +
                "\nFecha de nacimiento: " + birthdate;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


}
