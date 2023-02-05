package entities.concretes;

import entities.abstracts.EntityBase;

import java.time.LocalDateTime;

//6-Randevu:
//            -id : otomatik üretilsin
//            -hasta adı,Doktor,randevu tarihi
public class Appointment extends EntityBase {

    private static int count = 0;

    private Patients patient;
    private Doctors doctor;
    private String appointmentDate;
    private String appointmentTime;


    public Appointment(LocalDateTime createdDate) {
        super(createdDate);
    }

    public Appointment(String id, LocalDateTime createdDate, LocalDateTime modifiedDate, String createdByName, String modifiedByName, boolean isDeleted, boolean isActive, Patients patient, Doctors doctor, String appointmentDate, String appointmentTime) {
        super(id, createdDate, modifiedDate, createdByName, modifiedByName, isDeleted, isActive);
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Appointment.count = count;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return  "patient=" + patient +
                ", doctor=" + doctor +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", appointmentTime='" + appointmentTime + '\'';
    }
}
