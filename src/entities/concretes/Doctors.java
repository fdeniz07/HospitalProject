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



        Doctors doctor1 = new Doctors("DR500", "Ayhan", "Kaya", Titles.getTitleById(10), Branches.getBranchById(101), DoctorSituation.getDoctorSituationById(22));
        Doctors doctor2 = new Doctors("DR501", "Selma", "Can", Titles.getTitleById(10), Branches.getBranchById(102), DoctorSituation.getDoctorSituationById(22));
        Doctors doctor3 = new Doctors("DR502", "Kerim", "Atilgan", Titles.getTitleById(11), Branches.getBranchById(103), DoctorSituation.getDoctorSituationById(22));
        Doctors doctor4 = new Doctors("DR503", "Selim", "Uygun", Titles.getTitleById(12), Branches.getBranchById(104), DoctorSituation.getDoctorSituationById(23));
        Doctors doctor5 = new Doctors("DR504", "Fatma", "Tasdemir", Titles.getTitleById(13), Branches.getBranchById(100), DoctorSituation.getDoctorSituationById(21));

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
        System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
        System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "------------", "-------------", "-------------", "-----------------", "---------------", "-----------");
        for (Doctors w : doctorsList) {
            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
        }
        System.out.println();

    }

}
