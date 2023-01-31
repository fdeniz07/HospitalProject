package entities.concretes;

import entities.abstracts.Users;

import java.util.ArrayList;
import java.util.List;

public class Doctors extends Users {

    private List<Titles> titles = new ArrayList<>();
    private List<Branches> branches = new ArrayList<>();
    private List<DoctorSituation> doctorSituations = new ArrayList<>();

    public Doctors() {

    }

    public Doctors(List<Titles> titles, List<Branches> branches, List<DoctorSituation> doctorSituations) {
        this.titles = titles;
        this.branches = branches;
        this.doctorSituations = doctorSituations;
    }

    public Doctors(String id, String firstName, String lastName, List<Titles> titles, List<Branches> branches, List<DoctorSituation> doctorSituations) {
        super(id, firstName, lastName);
        this.titles = titles;
        this.branches = branches;
        this.doctorSituations = doctorSituations;
    }

    public List<Titles> getTitles() {
        return titles;
    }

    public void setTitles(List<Titles> titles) {
        this.titles = titles;
    }

    public List<Branches> getBranches() {
        return branches;
    }

    public void setBranches(List<Branches> branches) {
        this.branches = branches;
    }

    public List<DoctorSituation> getDoctorSituations() {
        return doctorSituations;
    }

    public void setDoctorSituations(List<DoctorSituation> doctorSituations) {
        this.doctorSituations = doctorSituations;
    }

    @Override
    public String toString() {
        return
                "titles=" + titles +
                        ", branches=" + branches +
                        ", doctorSituations=" + doctorSituations +
                        '}';
    }
}
