package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Branches {

    private int id;
    private String branch;

    private List<Doctors> doctorsList=new ArrayList<>();

    public Branches() {
    }

    public Branches(int id, String branch, List<Doctors> doctorsList) {
        this.id = id;
        this.branch = branch;
        this.doctorsList = doctorsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", branch='" + branch + '\'' +
                ", doctorsList=" + doctorsList ;
    }
}
