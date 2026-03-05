package org.example.character.characters;

import org.example.character.Character;

import java.util.Date;


public abstract class Patient extends Character {

    private String diagnosis;
    private String treatment;
    private String medicAssigned;

    private int numberRoom;

    private boolean isHospitalized;

    public Patient(String name, String dni, String address, String email, int phone, char gender, Date birthdate, String diagnosis, String treatment, String medicAssigned, int numberRoom, boolean isHospitalized) {
        super(name, dni, address, email, phone, gender, birthdate);
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicAssigned = medicAssigned;
        this.numberRoom = numberRoom;
        this.isHospitalized = isHospitalized;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getMedicAssigned() {
        return medicAssigned;
    }

    public void setMedicAssigned(String medicAssigned) {
        this.medicAssigned = medicAssigned;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public boolean isHospitalized() {
        return isHospitalized;
    }

    public void setHospitalized(boolean hospitalized) {
        isHospitalized = hospitalized;
    }
}
