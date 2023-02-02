package entities.concretes;

import java.util.List;

public class LastStatuses {

    private int id;
    private String lastStatus; //devam ediyor, islem tamamlandi
    private List<Patients> patientsList;

    public LastStatuses() {
    }

    public LastStatuses(int id, String lastStatus, List<Patients> patientsList) {
        this.id = id;
        this.lastStatus = lastStatus;
        this.patientsList = patientsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
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
                ", lastStatus='" + lastStatus + '\'' +
                ", patientsList=" + patientsList ;
    }
}
