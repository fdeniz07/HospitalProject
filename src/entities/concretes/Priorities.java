package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Priorities {

    private int id;
    private String priority; //Acil,poliklinik,Rutin
    private List<Patients> patientsList = new ArrayList<>();

    private List<Priorities> prioritiesList = new ArrayList<>();

    public Priorities() {
    }

    public Priorities(int id, String priority,List<Patients> patients) {
        this.id = id;
        this.priority = priority;
        this.patientsList=patients;
    }

    public Priorities(int id, String priority) {
        this.id = id;
        this.priority = priority;
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

    public void fillPrioritiesList(){
        Priorities priorities1 = new Priorities(31,"Acil");
        Priorities priorities2 = new Priorities(32,"Poliklinik");
        Priorities priorities3 = new Priorities(33,"Rutin");

        prioritiesList.add(priorities1);
        prioritiesList.add(priorities2);
        prioritiesList.add(priorities3);
    }
    public Priorities getPrioritiesById (int id){
        for (Priorities w: prioritiesList){
            if (w.id==id){
                return w;
            }
        }
        return null;
    }
}
