package entities.concretes;

import core.helpers.Gender;
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
    public List<Patients> patientsList = new ArrayList<>();

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
                "id=" + super.getId() +
                        ",adi=" + super.getFirstName() +
                        ",soyadi=" + super.getLastName() +
                        "tcNo='" + tcNo + '\'' +
                        ", birthDate=" + birthDate +
                        ", gender=" + gender +
                        ", priority=" + priority +
                        ", complaint=" + complaint +
                        ", lastStatus=" + lastStatus;
    }
    public void fillPatientsList(){
        Patients patient1 = new Patients("PT1001","Ali","Tekin","11223344556",LocalDate.of(1990,10,19),Gender.getGender(1),priority.getPrioritiesById(31),complaint.getComplaintById(1),lastStatus.getLastStatusById(1));
        Patients patient2 = new Patients("PT1002","Ramiz","Karaeski","22334455667",LocalDate.of(1999,6,29),Gender.getGender(1),priority.getPrioritiesById(31),complaint.getComplaintById(2),lastStatus.getLastStatusById(2));
        Patients patient3 = new Patients("PT1003","Enes","Durgun","55556666777",LocalDate.of(1970,11,9),Gender.getGender(1),priority.getPrioritiesById(31),complaint.getComplaintById(3),lastStatus.getLastStatusById(2));
        Patients patient4 = new Patients("PT1004","Asli","Yilmaz","11111111111",LocalDate.of(1970,11,9),Gender.getGender(1),priority.getPrioritiesById(31),complaint.getComplaintById(3),lastStatus.getLastStatusById(2));

        patientsList.add(patient1);
        patientsList.add(patient2);
        patientsList.add(patient3);
        patientsList.add(patient4);
    }

    @Override
    public void showUsers() {
        System.out.println();
        System.out.println("////////////////////////////////////// HASTA LISTESI \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
        System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n","Hasta Kodu","Hasta Ad","Hasta Soyad","TC NO","Dogum Tarihi","Cinsiyet","Aciliyet","Sikayet","Islem Durumu");
        System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n","---------","--------------------","--------------------","-----------","----------","------------","------------","------------","------------");
        for (Patients w :patientsList){
            System.out.printf("\"\"%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n",w.getId(),w.getFirstName(),w.getLastName(),w.getTcNo(),w.getBirthDate() ,w.getGender(),w.getPriority(),w.getComplaint(),w.getLastStatus());
        }
        System.out.println();

    }
}

