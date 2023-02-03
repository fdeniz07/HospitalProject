package entities.concretes;

import core.Helpers.Gender;
import entities.abstracts.Users;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patients extends Users {

    private String tcNo;
    private LocalDate birthDate;
    private String  gender;
    private Priorities priority;
    private Complaints complaint;
    private LastStatuses lastStatus;
    //private LocalDate appointmentDate;
    public static List<Patients> patientsList = new ArrayList<>();

    public Patients(){
    }
    public Patients(String tcNo, LocalDate birthDate, String gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priority = priority;
        this.complaint = complaint;
        this.lastStatus = lastStatus;
    }
    public Patients(String id, String firstName, String lastName, String tcNo, LocalDate birthDate, String gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
        super(id, firstName, lastName);
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priority = priority;
        this.complaint = complaint;
        this.lastStatus = lastStatus;
    }
    public String getTcNo() {
        return tcNo;
    }
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Priorities getPriority() {
        return priority;
    }
    public void setPriority(Priorities priority) {
        this.priority = priority;
    }
    public Complaints getComplaint() {
        return complaint;
    }
    public void setComplaint(Complaints complaint) {
        this.complaint = complaint;
    }
    public LastStatuses getLastStatus() {
        return lastStatus;
    }
    public void setLastStatus(LastStatuses lastStatus) {
        this.lastStatus = lastStatus;
    }
    @Override
    public String toString() {
        return
                "Randevu No :" + super.getId() +
                        ", Adi :" + super.getFirstName() +
                        ", Soyadi :" + super.getLastName() +
                        ", TC NO :'" + tcNo + '\'' +
                        ", Dogum Tarihi :" + birthDate +
                        ", Cinsiyet :" + gender +
                        ", Aciliyet :" + priority +
                        ", Sikayet : "+ complaint +
                        ", Islem Durumu :" + lastStatus;
    }
    public void fillPatientsList(){
        Patients patient1 = new Patients("HT1001556","Ali","Tekin","11223344556",LocalDate.of(1990,10,19),Gender.getGender(1),Priorities.getPrioritiesById(31),Complaints.getComplaintById(1),LastStatuses.getLastStatusById(2));
        Patients patient2 = new Patients("HT1002667","Ramiz","Karaeski","22334455667",LocalDate.of(1999,6,29),Gender.getGender(1),Priorities.getPrioritiesById(33),Complaints.getComplaintById(2),LastStatuses.getLastStatusById(2));
        Patients patient3 = new Patients("HT1003777","Enes","Durgun","55556666777",LocalDate.of(1970,11,9),Gender.getGender(1),Priorities.getPrioritiesById(32),Complaints.getComplaintById(3),LastStatuses.getLastStatusById(2));
        Patients patient4 = new Patients("HT1004111","Asli","Yilmaz","11111111111",LocalDate.of(1970,11,9),Gender.getGender(1),Priorities.getPrioritiesById(31),Complaints.getComplaintById(4),LastStatuses.getLastStatusById(2));
        Patients patient5 = new Patients("HT1005556","Ali","Tekin","11223344556",LocalDate.of(1990,10,19),Gender.getGender(1),Priorities.getPrioritiesById(32),Complaints.getComplaintById(2),LastStatuses.getLastStatusById(1));
        Patients patient6 = new Patients("HT1006777","Enes","Durgun","55556666777",LocalDate.of(1970,11,9),Gender.getGender(1),Priorities.getPrioritiesById(32),Complaints.getComplaintById(3),LastStatuses.getLastStatusById(1));
        Patients patient7 = new Patients("HT1007556","Ali","Tekin","11223344556",LocalDate.of(1990,10,19),Gender.getGender(1),Priorities.getPrioritiesById(33),Complaints.getComplaintById(3),LastStatuses.getLastStatusById(1));

        patientsList.add(patient1);
        patientsList.add(patient2);
        patientsList.add(patient3);
        patientsList.add(patient4);
        patientsList.add(patient5);
        patientsList.add(patient6);
        patientsList.add(patient7);
    }

    @Override
    public void showUsers() {
        System.out.println();
        System.out.println("////////////////////////////////////// HASTA LISTESI \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
        System.out.printf("%-14s  %-15s  %-15s  %-14s  %-14s  %-9s  %-13s %-14s %-16s\n","Randevu Kodu","Hasta Ad","Hasta Soyad","TC NO","Dogum Tarihi","Cinsiyet","Aciliyet","Sikayet","Islem Durumu");
        System.out.printf("%-14s  %-15s  %-15s  %-14s  %-14s  %-9s  %-13s %-14s %-16s\n","----------","--------","-----------","-----","------------","--------","--------","-------","------------"); for (Patients w :patientsList){
            System.out.printf("%-14s  %-15s  %-15s  %-14s  %-14s  %-9s  %-13s %-14s %-16s\n",w.getId(),w.getFirstName(),w.getLastName(),w.getTcNo(),w.getBirthDate() ,w.getGender(),w.getPriority(),w.getComplaint(),w.getLastStatus());
        }
        System.out.println();

    }

    public static Patients getPatientById(String id){
        for (Patients w:patientsList){
            if (w.getId().equals(id)){
                return w;
            }
        }
        return null;
    }
}

