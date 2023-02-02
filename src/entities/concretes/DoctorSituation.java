package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class DoctorSituation {

    private int id;
    private String situation;
    private List<Doctors> doctorsList = new ArrayList<>();


    public DoctorSituation() {
    }

    public DoctorSituation(int id, String situation, List<Doctors> doctorsList) {
        this.id = id;
        this.situation = situation;
        this.doctorsList = doctorsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
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
                ", situation='" + situation + '\'' +
                ", doctorsList=" + doctorsList;
    }
}
