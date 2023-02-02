package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Titles {

    private int id;
    private String title;
    private List<Doctors> doctorsList=new ArrayList<>();

    public Titles() {
    }

    public Titles(int id, String title, List<Doctors> doctorsList) {
        this.id = id;
        this.title = title;
        this.doctorsList = doctorsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                ", title='" + title + '\'' +
                ", doctorsList=" + doctorsList;
    }
}
