package entities.concretes;

import entities.abstracts.Users;
import entities.concretes.enums.Gender;

import java.time.LocalDate;

public class Patients extends Users {

    private String tcNo;
    private LocalDate birthDate;
    private Gender gender;

    private Priorities priority;
    private Complaints complaint;
    private LastStatuses lastStatus;

    public Patients(){

    }

    public Patients(String tcNo, LocalDate birthDate, Gender gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priority = priority;
        this.complaint = complaint;
        this.lastStatus = lastStatus;
    }

    public Patients(String id, String firstName, String lastName, String tcNo, LocalDate birthDate, Gender gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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
                "tcNo='" + tcNo + '\'' +
                        ", birthDate=" + birthDate +
                        ", gender=" + gender +
                        ", priority=" + priority +
                        ", complaint=" + complaint +
                        ", lastStatus=" + lastStatus
                ;
    }
}

