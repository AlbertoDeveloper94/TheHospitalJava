package org.example.character.characters.medics;

import org.example.character.characters.Medic;
import org.example.character.characters.actions.medics.Students;

import java.time.LocalDate;

public class Student extends Medic implements Students {

    private String nameUniversity;
    private String nameTrainingSpeciality;
    private String currentCourse;

    private int residenceYear;
    private int hoursStudyWeek;
    private boolean isEarningMoney;

    public Student(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String nameHospital, String schedule, String shift, int numberColegial, int salary, int hoursWorkWeek, LocalDate dateAdmission, String nameUniversity, String nameTrainingSpeciality, String currentCourse, int residenceYear, int hoursStudyWeek, boolean isEarningMoney) {
        super(name, dni, address, email, phone, gender, birthdate, nameHospital, schedule, shift, numberColegial, salary, hoursWorkWeek, dateAdmission);
        this.nameUniversity = nameUniversity;
        this.nameTrainingSpeciality = nameTrainingSpeciality;
        this.currentCourse = currentCourse;
        this.residenceYear = residenceYear;
        this.hoursStudyWeek = hoursStudyWeek;
        this.isEarningMoney = isEarningMoney;
    }

    @Override
    public String displayInfoCharacter() {
        return super.displayInfoCharacter() +
                "\nNombre de la universidad: " + nameUniversity +
                "\nEspecialización : " + nameTrainingSpeciality +
                "\nAño de Residencia: " + residenceYear +
                "\n¿Está ganando dinero?: " + (isEarningMoney ? "Sí" : "No");
    }

    @Override
    public void hoursStudyWeek() {
        System.out.println("El estudiante " + getName() + " estudia " + hoursStudyWeek + " horas por semana");
    }

    @Override
    public void currentCourse() {
        System.out.println("El estudiante " + getName() + " está estudiando actualmente este curso:  " + currentCourse);
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getNameTrainingSpeciality() {
        return nameTrainingSpeciality;
    }

    public void setNameTrainingSpeciality(String nameTrainingSpeciality) {
        this.nameTrainingSpeciality = nameTrainingSpeciality;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public int getResidenceYear() {
        return residenceYear;
    }

    public void setResidenceYear(int residenceYear) {
        this.residenceYear = residenceYear;
    }

    public int getHoursStudyWeek() {
        return hoursStudyWeek;
    }

    public void setHoursStudyWeek(int hoursStudyWeek) {
        this.hoursStudyWeek = hoursStudyWeek;
    }

    public boolean isEarningMoney() {
        return isEarningMoney;
    }

    public void setEarningMoney(boolean earningMoney) {
        isEarningMoney = earningMoney;
    }
}