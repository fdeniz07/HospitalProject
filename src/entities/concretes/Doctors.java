package entities.concretes;

import entities.abstracts.Users;

public class Doctors extends Users {

    private Titles title;
    private Branches branch;
    private DoctorSituation doctorSituation;

    public Doctors() {

    }

    public Doctors(Titles title, Branches branch, DoctorSituation doctorSituation) {
        this.title = title;
        this.branch = branch;
        this.doctorSituation = doctorSituation;
    }

    public Doctors(String id, String firstName, String lastName, Titles title, Branches branch, DoctorSituation doctorSituation) {
        super(id, firstName, lastName);
        this.title = title;
        this.branch = branch;
        this.doctorSituation = doctorSituation;
    }

    public Titles getTitle() {
        return title;
    }

    public void setTitle(Titles title) {
        this.title = title;
    }

    public Branches getBranch() {
        return branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }

    public DoctorSituation getDoctorSituation() {
        return doctorSituation;
    }

    public void setDoctorSituation(DoctorSituation doctorSituation) {
        this.doctorSituation = doctorSituation;
    }

    @Override
    public String toString() {
        return
                "title=" + title +
                ", branch=" + branch +
                ", doctorSituation=" + doctorSituation;
    }
}
