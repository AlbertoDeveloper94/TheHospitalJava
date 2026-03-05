package org.example.character.characters;

import org.example.character.Character;
import org.example.character.characters.actions.patients.AllPatients;

import java.time.LocalDate;



public abstract class Patient extends Character implements AllPatients {

    private String diagnosis;
    private String treatment;
    private String medicAssigned;

    private int numberRoom;

    private boolean isHospitalized;

    public Patient(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String diagnosis, String treatment, String medicAssigned, int numberRoom, boolean isHospitalized) {
            super(name, dni, address, email, phone, gender, birthdate);
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicAssigned = medicAssigned;
        this.numberRoom = numberRoom;
        this.isHospitalized = isHospitalized;
    }


    @Override
    public void admision() {
        System.out.println("El paciente " + getName() + " ha ingresado en el hospital");
    }

    @Override
    public void habitacion() {
        if(numberRoom >= 0){
            System.out.println("El paciente " + getName() + " está ubicado en la habitación " + numberRoom);
        }
        if(numberRoom<0){
            System.out.println("El número de habitación es inválido");
        }

    }

    @Override
    public void treatment() {
        if (treatment.isEmpty() || diagnosis.isEmpty()) {
            System.out.println("Ingresa un diagnóstico o tratamiento");
        }
        if(!treatment.isEmpty()){
            System.out.println("El paciente " + getName() + " ha sido diagnosticado con " + diagnosis + " por parte del doctor " + medicAssigned + ". Se le ha aplicado un tratamiento: " + treatment);
        }

    }

    @Override
    public void exit() {
        System.out.println("El paciente " + getName() + " se ha curado y ha salido del hospital.");
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
