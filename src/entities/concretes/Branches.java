package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Branches {

    private int id; //100,101,102
    private String branch;

    public List<Branches> branchesList= new ArrayList<>();

    private List<Doctors> doctorsList=new ArrayList<>();

    public Branches() {
    }

    public Branches(int id, String branch, List<Doctors> doctorsList) {
        this.id = id;
        this.branch = branch;
        this.doctorsList = doctorsList;
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
                ", branch='" + branch + '\'' +
                ", doctorsList=" + doctorsList ;
    }

    public  void  fillBranchList(){
        Branches branch1 = new Branches(100,"KBB");
        Branches branch2 = new Branches(101,"Genel Cerrahi");
        Branches branch3 = new Branches(102,"Fizyo Terapi");
        Branches branch4 = new Branches(103,"Ortopedi");
        Branches branch5 = new Branches(104,"Nöroloji");

        branchesList.add(branch1);
        branchesList.add(branch2);
        branchesList.add(branch3);
        branchesList.add(branch4);
        branchesList.add(branch5);
    }

    public Branches getBranchById (int id){
        for (Branches w: branchesList){
            if (w.id==id){
                return w;
            }
        }
        return null;
    }
}
