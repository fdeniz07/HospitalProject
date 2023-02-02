package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Priorities {

    private int id;
    private String priority; //Acil,poliklinik,Rutin
    private List<Patients> patientsList = new ArrayList<>();


    public Priorities() {
    }

    public Priorities(int id, String priority,List<Patients> patients) {
        this.id = id;
        this.priority = priority;
        this.patientsList=patients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<Patients> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patients> patientsList) {
        this.patientsList = patientsList;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", patientsList=" + patientsList ;
    }
}
