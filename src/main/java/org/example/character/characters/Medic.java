package org.example.character.characters;

import org.example.character.Character;
import org.example.character.characters.actions.medics.AllMedics;

import java.time.LocalDate;

public abstract class Medic extends Character implements AllMedics {

    private String nameHospital;
    private String schedule;
    private String shift;

    private int numberColegial;
    private int salary;
    private int hoursWorkWeek;

    private LocalDate dateAdmission;

    public Medic(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String nameHospital, String schedule, String shift, int numberColegial, int salary, int hoursWorkWeek, LocalDate dateAdmission) {
        super(name, dni, address, email, phone, gender, birthdate);
        this.nameHospital = nameHospital;
        this.schedule = schedule;
        this.shift = shift;
        this.numberColegial = numberColegial;
        this.salary = salary;
        this.hoursWorkWeek = hoursWorkWeek;
        this.dateAdmission = dateAdmission;
    }

    @Override
    public String displayInfoCharacter(){
        return super.displayInfoCharacter() +
                "\nNombre del hospital: " + nameHospital +
                "\nHorario: " + schedule +
                "\nTurno de trabajo: " + shift +
                "\nSalario: " + salary +
                "\nHoras de trabajo a la semana: " + hoursWorkWeek;
    }

    @Override
    public void hoursWorkWeek(){
        System.out.println("El médico/estudiante trabaja " +  hoursWorkWeek + " horas a la semana");
    }

    @Override
    public void eat(){
        System.out.println("El médico/estudiante está comiendo");
    }
    public String getNameHospital() {
        return nameHospital;
    }

    public void setNameHospital(String nameHospital) {
        this.nameHospital = nameHospital;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getNumberColegial() {
        return numberColegial;
    }

    public void setNumberColegial(int numberColegial) {
        this.numberColegial = numberColegial;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(LocalDate dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public int getHoursWorkWeek() {
        return hoursWorkWeek;
    }

    public void setHoursWorkWeek(int hoursWorkWeek) {
        this.hoursWorkWeek = hoursWorkWeek;
    }
}
