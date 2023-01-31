package entities.concretes;

public class Branches {

    private int id;
    private String branch;

    public Branches() {
    }

    public Branches(int id, String branch) {
        this.id = id;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", branch='" + branch + '\'';
    }
}
