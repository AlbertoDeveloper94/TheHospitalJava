package org.example.character.characters.patients;

import org.example.character.characters.Patient;
import org.example.character.characters.actions.patients.PatientsAmbulance;

import java.time.LocalDate;

public class PatientAmbulance extends Patient implements PatientsAmbulance {

    private String levelStatus;

    private int vitalSigns;
    private int numberAmbulance;

    public PatientAmbulance(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String diagnosis, String treatment, String medicAssigned, int numberRoom, boolean isHospitalized, String levelStatus, int vitalSigns, int numberAmbulance) {
        super(name, dni, address, email, phone, gender, birthdate, diagnosis, treatment, medicAssigned, numberRoom, isHospitalized);
        this.levelStatus = levelStatus;
        this.vitalSigns = vitalSigns;
        this.numberAmbulance = numberAmbulance;
    }

    @Override
    public String displayInfoCharacter(){
        return super.displayInfoCharacter() +
                "\nEstado del paciente: " + levelStatus +
                "\nSignos Vitales: " + vitalSigns +
                "\nId de la ambulancia: " + numberAmbulance;
    }

    @Override
    public void medicalOperation() {

        System.out.println("El paciente " + getName() + " se operó exitosamente");
    }

    @Override
    public void rehabilitation() {
        System.out.println("El paciente " + getName() + " se mandó a rehabilitación");
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
