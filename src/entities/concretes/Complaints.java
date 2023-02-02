package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Complaints {

    private int id; //1,2,3
    private String complaint; // Bas agrisi, kusma,bulanti,...
    private List<Patients> patientsList = new ArrayList<>();
    public List<Complaints> complaintsList = new ArrayList<>();

    public Complaints() {
    }

    public Complaints(int id, String complaint, List<Patients> patientsList) {
        this.id = id;
        this.complaint = complaint;
        this.patientsList = patientsList;
    }

    public Complaints(int id, String complaint) {
        this.id = id;
        this.complaint = complaint;
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
                        ", patientsList=" + patientsList;
    }

    public void fillComplaintList() {
        Complaints complaint1 = new Complaints(1, "Bas Agrisi");
        Complaints complaint2 = new Complaints(2, "Kusma");
        Complaints complaint3 = new Complaints(3, "Zehirlenme");
        Complaints complaint4 = new Complaints(4, "Kalp Krizi");
        Complaints complaint5 = new Complaints(5, "Beyin Kanamasi");

        complaintsList.add(complaint1);
        complaintsList.add(complaint2);
        complaintsList.add(complaint3);
        complaintsList.add(complaint4);
        complaintsList.add(complaint5);
    }

    public Complaints getComplaintById(int id) {
        for (Complaints w : complaintsList) {
            if (w.id == id) {
                return w;
            }
        }
        return null;
    }
}
