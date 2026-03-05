package org.example.character.characters.medics;

import org.example.character.characters.Medic;
import org.example.character.characters.actions.medics.Specialists;

import java.time.LocalDate;

public class Specialist extends Medic implements Specialists {

    private String speciality;
    private int experienceYears;
    private LocalDate dateStartHolidays;

    public Specialist(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String nameHospital, String schedule, String shift, int numberColegial, int salary, int hoursWorkWeek, LocalDate dateAdmission, LocalDate dateStartHolidays, int experienceYears, String speciality) {
        super(name, dni, address, email, phone, gender, birthdate, nameHospital, schedule, shift, numberColegial, salary, hoursWorkWeek, dateAdmission);
        this.dateStartHolidays = dateStartHolidays;
        this.experienceYears = experienceYears;
        this.speciality = speciality;
    }

    @Override
    public String displayInfoCharacter() {
        return super.displayInfoCharacter() +
                "\nEspecialidad: " + speciality +
                "\nAños de experiencia:  : " + experienceYears +
                "\nFecha que inicia las vacaciones: " + dateStartHolidays;
    }

    @Override
    public void dateStartHolidays(){
        System.out.println("El médico " + getName() + " empieza las vacaciones a partir del " + dateStartHolidays);
    };
    @Override
    public void speciality(){
        System.out.println("El médico " + getName() + " se especializa en " + speciality);
    };

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public LocalDate getDateStartHolidays() {
        return dateStartHolidays;
    }

    public void setDateStartHolidays(LocalDate dateStartHolidays) {
        this.dateStartHolidays = dateStartHolidays;
    }
}
