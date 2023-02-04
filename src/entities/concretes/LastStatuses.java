package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class LastStatuses {

    private int id;//1,2
    private String lastStatus;//taburcu yada devam
    public static List<LastStatuses> lastStatusesList = new ArrayList<>();
    private List<Patients> patientsList = new ArrayList<>();

    public LastStatuses() {
    }

    public LastStatuses(int id, String lastStatus, List<Patients> patientsList) {
        this.id = id;
        this.lastStatus = lastStatus;
        this.patientsList = patientsList;
    }

    public LastStatuses(int id, String lastStatus) {
        this.id = id;
        this.lastStatus = lastStatus;
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
        return lastStatus;
    }

    public void fillLastStatusList() {
        LastStatuses status1 = new LastStatuses(1, "devam ediyor");
        LastStatuses status2 = new LastStatuses(2, "islem tamamlandi");

        lastStatusesList.add(status1);
        lastStatusesList.add(status2);
    }

    public static LastStatuses getLastStatusById(int id) {
        for (LastStatuses w : lastStatusesList) {
            if (w.id == id) {
                return w;
            }
        }
        return null;
    }
}
