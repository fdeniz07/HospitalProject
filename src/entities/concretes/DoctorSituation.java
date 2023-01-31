package entities.concretes;

public class DoctorSituation {

    private int id;
    private String situation;

    public DoctorSituation() {
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

    @Override
    public String toString() {
        return
                "id=" + id +
                ", situation='" + situation + '\'';
    }
}
