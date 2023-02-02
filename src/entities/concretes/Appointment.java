package entities.concretes;

//6-Randevu:
//            -id : otomatik üretilsin
//            -hasta adı,Doktor,randevu tarihi
public class Appointment {

    private static int count = 0;
    private int id;
    private Patients patient;
    private Doctors doctor;
    private String appointmentDate;

    public Appointment(Patients patient, Doctors doctor, String appointmentDate) {
        count++;
        this.id = count;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Appointment.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return
                "id=" + id +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", date='" + appointmentDate + '\''
                ;
    }
}
