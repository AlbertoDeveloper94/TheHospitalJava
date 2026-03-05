package org.example;

import org.example.character.characters.patients.PatientAmbulance;
import org.example.character.characters.patients.PatientConsult;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        PatientAmbulance patientAmbulance1 = new PatientAmbulance("Alberto", "47887313E", "Av diagonal 491" , "bettogp94@gmail.com", "(+34) 696 618 615", 'h', LocalDate.of(1985, 10, 15), "cancer de páncreas", "quimioterapia", "Ana López", 21, true, "Estado Crítico", 10, 1);
        System.out.println(patientAmbulance1.displayInfoCharacter());
        patientAmbulance1.admision();
        patientAmbulance1.habitacion();
        patientAmbulance1.treatment();
        patientAmbulance1.exit();
        patientAmbulance1.medicalOperation();
        patientAmbulance1.rehabilitation();

        System.out.println();

        PatientAmbulance patientAmbulance2 = new PatientAmbulance("Isabel", "47821313E", "Av maria cristina" , "isa933@gmail.com", "(+34) 656 783 123", 'm', LocalDate.of(1994, 11, 19), "ictus cerebral", "operación de cerebro", "Christian Fernández", 26, true, "Estado Estable", 80, 2);
        System.out.println(patientAmbulance2.displayInfoCharacter());
        patientAmbulance2.admision();
        patientAmbulance2.habitacion();
        patientAmbulance2.treatment();
        patientAmbulance2.exit();
        patientAmbulance2.medicalOperation();
        patientAmbulance2.rehabilitation();

        System.out.println();

        PatientConsult patientConsult1 = new PatientConsult("Cristina", "21521313W", "Francesc Macia" , "cris21@gmail.com", "(+34) 621 987 491", 'm', LocalDate.of(1992, 2, 25), "Lesión en el pie", "Reposo en casa", "Maria Garcia", 34, false, 1,  LocalDate.of(2026, 5, 13), "Pendiente", "Lucía");
        System.out.println(patientConsult1.displayInfoCharacter());
        patientConsult1.admision();
        patientConsult1.habitacion();
        patientConsult1.treatment();
        patientConsult1.exit();
        patientConsult1.nursingSupervisor();
        patientConsult1.nextMedicalAppointment();

        System.out.println();

        PatientConsult patientConsult2 = new PatientConsult("Marcos", "21521481L", "Josep Tarradellas" , "marcos221@gmail.com", "(+34) 631 098 034", 'm', LocalDate.of(1973, 7, 18), "Fiebre alta", "paracetamol", "Carla Reguillo", 56, true, 2, LocalDate.of(2026, 4, 23), "Atendida", "Pepe");
        System.out.println(patientConsult2.displayInfoCharacter());
        patientConsult2.admision();
        patientConsult2.habitacion();
        patientConsult2.treatment();
        patientConsult2.exit();
        patientConsult2.nursingSupervisor();
        patientConsult2.nextMedicalAppointment();

    }
}
