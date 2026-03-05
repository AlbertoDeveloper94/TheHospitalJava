package org.example;

import org.example.character.characters.medics.Specialist;
import org.example.character.characters.medics.Student;
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

        PatientConsult patientConsult2 = new PatientConsult("Marcos", "21521481L", "Josep Tarradellas" , "marcos221@gmail.com", "(+34) 631 098 034", 'h', LocalDate.of(1973, 7, 18), "Fiebre alta", "paracetamol", "Carla Reguillo", 56, true, 2, LocalDate.of(2026, 4, 23), "Atendida", "Pepe");
        System.out.println(patientConsult2.displayInfoCharacter());
        patientConsult2.admision();
        patientConsult2.habitacion();
        patientConsult2.treatment();
        patientConsult2.exit();
        patientConsult2.nursingSupervisor();
        patientConsult2.nextMedicalAppointment();

        System.out.println();

        Student student1 = new Student ("Enrique", "65123456P", "Plaza España" , "enrique2515gmail.com", "(+34) 698 712 004", 'h', LocalDate.of(2000, 8, 20), "Vall Hebrón" , "Lunes a viernes 9:00 a 14:00", "Mañanas", 23012, 1000, 20, LocalDate.of(2020, 10, 25),"Universidad de Barcelona", "Neurología", "Anatomía del cerebro", 2018, 100, true);

        System.out.println(student1.displayInfoCharacter());
        student1.hoursStudyWeek();
        student1.hoursWorkWeek();
        student1.eat();
        student1.currentCourse();


        System.out.println();

        Student student2 = new Student ("Astrid", "56723456R", "Plaza Cerdá" , "astrid893@gmail.com", "(+34) 673 891 000", 'm', LocalDate.of(1980, 2, 20), "Hospital Clínico" , "Lunes a viernes 16:00 a 21:00", "Tardes", 56129, 1500, 20, LocalDate.of(2000, 10, 25),"Universidad de Madrid", "Cardiología", "Anatomía del corazón", 2000, 150, true);

        System.out.println(student2.displayInfoCharacter());
        student2.hoursStudyWeek();
        student2.hoursWorkWeek();
        student2.eat();
        student2.currentCourse();

        System.out.println();

        Specialist specialist1 = new Specialist("Adrián", "32198765R", "Avenida reina maria cristina", "adrian65@gmail.com", "(+34) 678 987 127", 'h', LocalDate.of(1990, 11, 26), "Hospital de Madrid", "Lunes a Sábado Horario de 9:00h a 18h", "Todo el día", 98731, 2000, 2000, LocalDate.of(2015, 1, 15), LocalDate.of(2026, 4, 5), 10, "Traumatólogo");

        System.out.println(specialist1.displayInfoCharacter());
        specialist1.hoursWorkWeek();
        specialist1.eat();
        specialist1.dateStartHolidays();
        specialist1.speciality();

        System.out.println();

        Specialist specialist2= new Specialist("Marta", "23458765T", "Plaza Cataluña", "marta235@gmail.com", "(+34) 612 945 127", 'h', LocalDate.of(1980, 5, 28), "Hospital de Madrid", "Lunes a Viernes Horario de 9:00h a 20h", "Todo el día", 67812, 1500, 1500, LocalDate.of(2000, 3, 15), LocalDate.of(2000, 8, 25), 5, "Matrona");

        System.out.println(specialist2.displayInfoCharacter());
        specialist2.hoursWorkWeek();
        specialist2.eat();
        specialist2.dateStartHolidays();
        specialist2.speciality();
    }
}
