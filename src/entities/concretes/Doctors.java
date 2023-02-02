package entities.concretes;

import entities.abstracts.Users;


import java.util.ArrayList;
import java.util.List;

public class Doctors extends Users {

    private Titles title;
    private Branches branch;
    private DoctorSituation doctorSituation;


    public List<Doctors> doctorsList = new ArrayList<>();

    public Doctors() {

    }


    public Doctors(Titles title, Branches branch, DoctorSituation doctorSituation) {
        this.title = title;
        this.branch = branch;
        this.doctorSituation = doctorSituation;
    }

    public Doctors(String id, String firstName, String lastName, Titles title, Branches branch, DoctorSituation doctorSituation) {
        super(id, firstName, lastName);
        this.title = title;
        this.branch = branch;
        this.doctorSituation = doctorSituation;
    }

    public Titles getTitle() {
        return title;
    }

    public void setTitle(Titles title) {
        this.title = title;
    }

    public Branches getBranch() {
        return branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }

    public DoctorSituation getDoctorSituation() {
        return doctorSituation;
    }

    public void setDoctorSituation(DoctorSituation doctorSituation) {
        this.doctorSituation = doctorSituation;
    }

    @Override
    public String toString() {
        return
                "id=" + super.getId() +
                        ",adi=" + super.getFirstName() +
                        ",soyadi=" + super.getLastName() +
                        ",ünvani=" + title +
                        ", bransi=" + branch +
                        ", doktor durumu=" + doctorSituation;
    }


    //Izinli,Ameliyatta,Müsait,Muayenede

    public void fillDoctorList() {
        Doctors doctor1 = new Doctors("DR500", "Ayhan", "Kaya", title.getTitleById(10), branch.getBranchById(101), doctorSituation.getDoctorSituationById(22));
        Doctors doctor2 = new Doctors("DR501", "Selma", "Can", title.getTitleById(10), branch.getBranchById(102), doctorSituation.getDoctorSituationById(22));
        Doctors doctor3 = new Doctors("DR502", "Kerim", "Atilgan", title.getTitleById(11), branch.getBranchById(103), doctorSituation.getDoctorSituationById(22));
        Doctors doctor4 = new Doctors("DR503", "Selim", "Uygun", title.getTitleById(12), branch.getBranchById(104), doctorSituation.getDoctorSituationById(23));
        Doctors doctor5 = new Doctors("DR504", "Fatma", "Tasdemir", title.getTitleById(13), branch.getBranchById(100), doctorSituation.getDoctorSituationById(21));

        doctorsList.add(doctor1);
        doctorsList.add(doctor2);
        doctorsList.add(doctor3);
        doctorsList.add(doctor4);
        doctorsList.add(doctor5);

    }

    @Override
    public void showUsers() {
        System.out.println();
        System.out.println("////////////////////////////////////// DOKTOR LISTESI \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
        System.out.printf("%-6s  %-20s  %-20s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
        System.out.printf("%-6s  %-20s  %-20s  %-17s  %-15s  %-12s \n", "------", "--------------------", "--------------------", "-----------------", "---------------", "-----------");
        for (Doctors w : doctorsList) {
            System.out.printf("\"%-6s  %-20s  %-20s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
        }
        System.out.println();

    }

}
