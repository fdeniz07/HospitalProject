package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Branches {

    private int id; //100,101,102
    private String branch;

    public static List<Branches> branchesList = new ArrayList<>();

    private List<Doctors> doctorsList = new ArrayList<>();

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
                branch;
    }

    public void fillBranchList() {
        Branches branch1 = new Branches(100, "KBB");
        Branches branch2 = new Branches(101, "Genel Cerrahi");
        Branches branch3 = new Branches(102, "Fizyo Terapi");
        Branches branch4 = new Branches(103, "Ortopedi");
        Branches branch5 = new Branches(104, "Nöroloji");
        Branches branch6 = new Branches(104, "Nefroloji");
        Branches branch7 = new Branches(104, "Üroloji");
        Branches branch8 = new Branches(104, "Dermatoloji");
        Branches branch9 = new Branches(104, "Cocuk Sagligi");
        Branches branch10 = new Branches(104, "Kadin Hastaliklari");
        Branches branch11 = new Branches(104, "Gastroenteroloji");
        Branches branch12 = new Branches(104, "Göz Hastaliklari");
        Branches branch13 = new Branches(104, "Radyoloji");
        Branches branch14 = new Branches(104, "Agiz,Cene ve Dis Sagligi");
        Branches branch15 = new Branches(104, "Beslenme ve Diyet");
        Branches branch16 = new Branches(104, "Dahiliye");
        Branches branch17 = new Branches(104, "Endoskopi");
        Branches branch18 = new Branches(104, "Psikoloji");
        Branches branch19 = new Branches(104, "Estetik Cerrahi");
        Branches branch20 = new Branches(104, "Gögüs Hastaliklari");

        branchesList.add(branch1);
        branchesList.add(branch2);
        branchesList.add(branch3);
        branchesList.add(branch4);
        branchesList.add(branch5);
        branchesList.add(branch6);
        branchesList.add(branch7);
        branchesList.add(branch8);
        branchesList.add(branch9);
        branchesList.add(branch10);
        branchesList.add(branch11);
        branchesList.add(branch12);
        branchesList.add(branch13);
        branchesList.add(branch14);
        branchesList.add(branch15);
        branchesList.add(branch16);
        branchesList.add(branch17);
        branchesList.add(branch18);
        branchesList.add(branch19);
        branchesList.add(branch20);

    }

    public static Branches getBranchById(int id) {
        for (Branches w : branchesList) {
            if (w.id == id) {
                return w;
            }
        }
        return null;
    }
}
