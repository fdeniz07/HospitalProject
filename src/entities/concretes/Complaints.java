package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Complaints {

    private int id;
    private String complaint; // Bas agrisi, kusma,bulanti,...
    private List<Patients> patientsList = new ArrayList<>();


    public Complaints() {
    }

    public Complaints(int id, String complaint, List<Patients> patientsList) {
        this.id = id;
        this.complaint = complaint;
        this.patientsList = patientsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
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
                ", complaint='" + complaint + '\'' +
                ", patientsList=" + patientsList ;
    }
}
