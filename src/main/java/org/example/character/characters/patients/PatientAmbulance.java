package org.example.character.characters.patients;

import org.example.character.characters.Patient;

import java.time.LocalDate;

public class PatientAmbulance extends Patient {

    private String levelStatus;

    private int vitalSigns;
    private int numberAmbulance;

    public PatientAmbulance(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String diagnosis, String treatment, String medicAssigned, int numberRoom, boolean isHospitalized, String levelStatus, int vitalSigns, int numberAmbulance) {
        super(name, dni, address, email, phone, gender, birthdate, diagnosis, treatment, medicAssigned, numberRoom, isHospitalized);
        this.levelStatus = levelStatus;
        this.vitalSigns = vitalSigns;
        this.numberAmbulance = numberAmbulance;
    }


    public String getLevelStatus() {
        return levelStatus;
    }

    public void setLevelStatus(String levelStatus) {
        this.levelStatus = levelStatus;
    }

    public int getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(int vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public int getNumberAmbulance() {
        return numberAmbulance;
    }

    public void setNumberAmbulance(int numberAmbulance) {
        this.numberAmbulance = numberAmbulance;
    }
}
