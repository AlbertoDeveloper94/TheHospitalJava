package org.example.character.characters.patients;

import org.example.character.characters.Patient;
import org.example.character.characters.actions.patients.PatientsConsult;

import java.time.LocalDate;

public class PatientConsult extends Patient implements PatientsConsult {

    private int numberWaitingRoom;
    private LocalDate appointmentDate;
    private String appoinmentStatus;
    private String nameNurse;

    public PatientConsult(String name, String dni, String address, String email, String phone, char gender, LocalDate birthdate, String diagnosis, String treatment, String medicAssigned, int numberRoom, boolean isHospitalized, int numberWaitingRoom, LocalDate appointmentDate, String appoinmentStatus) {
        super(name, dni, address, email, phone, gender, birthdate, diagnosis, treatment, medicAssigned, numberRoom, isHospitalized);
        this.numberWaitingRoom = numberWaitingRoom;
        this.appointmentDate = appointmentDate;
        this.appoinmentStatus = appoinmentStatus;
    }

    @Override
    public void nursingSupervisor(){
        System.out.println("El paciente " + getName() + " le esta cuidando la enfermera " + nameNurse);
    }
    @Override
    public void nextMedicalAppointment(){
        System.out.println("El paciente " + getName() + "Fecha de la cita: " + appointmentDate);
    }

    public int getNumberWaitingRoom() {
        return numberWaitingRoom;
    }

    public void setNumberWaitingRoom(int numberWaitingRoom) {
        this.numberWaitingRoom = numberWaitingRoom;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppoinmentStatus() {
        return appoinmentStatus;
    }

    public void setAppoinmentStatus(String appoinmentStatus) {
        this.appoinmentStatus = appoinmentStatus;
    }
}
