package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Titles {

    private int id; //10,11,12
    private String tittle;
    private List<Doctors> doctorsList = new ArrayList<>();

    public List<Titles> titlesList = new ArrayList<>();

    public Titles() {
    }

    public Titles(int id, String tittle, List<Doctors> doctorsList) {
        this.id = id;
        this.tittle = tittle;
        this.doctorsList = doctorsList;
    }

    public Titles(int id, String tittle) {
        this.id = id;
        this.tittle = tittle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
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
                        ", tittle='" + tittle + '\'' +
                        ", doctorsList=" + doctorsList;
    }

    public void fillTitles() {
        Titles title1 = new Titles(10,"Pratisyen");
        Titles title2 = new Titles(11,"Uzman");
        Titles title3 = new Titles(12,"Operatör");
        Titles title4 = new Titles(13,"Yardimci Docent");
        Titles title5 = new Titles(14,"Doçent");
        Titles title6 = new Titles(15,"Profesör");
    }

    public Titles getTitleById (int id){
        for (Titles w: titlesList){
            if (w.id==id){
                return w;
            }
        }
        return null;
    }
}
