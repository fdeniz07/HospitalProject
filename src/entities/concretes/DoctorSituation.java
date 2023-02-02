package entities.concretes;


import java.util.ArrayList;
import java.util.List;

public class DoctorSituation {

    private int id; //20,21,22
    private String situation; //Izinli,Ameliyatta,Müsait,Muayenede
    private List<Doctors> doctorsList = new ArrayList<>();

    public List<DoctorSituation> situationList = new ArrayList<>();

    public DoctorSituation() {
    }

    public DoctorSituation(int id, String situation, List<Doctors> doctorsList) {
        this.id = id;
        this.situation = situation;
        this.doctorsList = doctorsList;
    }

    public DoctorSituation(int id, String situation) {
        this.id = id;
        this.situation = situation;
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

    public void fillSituation(){
        DoctorSituation ds1 = new DoctorSituation(20,"Izinli");
        DoctorSituation ds2= new DoctorSituation(21,"Ameliyatta");
        DoctorSituation ds3 = new DoctorSituation(22,"Müsait");
        DoctorSituation ds4 = new DoctorSituation(23,"Muayenede");

        situationList.add(ds1);
        situationList.add(ds2);
        situationList.add(ds3);
        situationList.add(ds4);
    }

    public DoctorSituation getDoctorSituationById(int id) {
        for (DoctorSituation w : situationList) {
            if (w.id == id) {
                return w;
            }
        }
        return null;
    }
}
