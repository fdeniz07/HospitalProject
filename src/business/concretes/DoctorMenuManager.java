package business.concretes;

import application.console.concretes.Start;
import business.abstracts.MenuService;
import core.helpers.Slow;
import entities.concretes.Branches;
import entities.concretes.DoctorSituation;
import entities.concretes.Doctors;
import entities.concretes.Titles;

import java.util.Scanner;

public class DoctorMenuManager extends MenuManager implements MenuService {


    Doctors doctors = new Doctors();
    Titles titles = new Titles();
    Branches branches = new Branches();
    DoctorSituation doctorSituation = new DoctorSituation();

    @Override
    public void getSelectionMenu() {

        int select;
        Scanner inp = new Scanner(System.in);
        System.out.println();
        String message = "========== DOKTOR MENÜSÜ ==========\n";
        Slow.slowPrint(message, 10);
        System.out.println("Lütfen yapmak istediginiz islem türünü seciniz:");
        System.out.println("1-Doktor ekle");
        System.out.println("2-Doktor silme");
        System.out.println("3-Tüm Doktor Listesi");
        System.out.println("4-Duruma Göre Arama"); //(Izinli,Ameliyatta,Müsait,Muayenede)
        System.out.println("5-Bransa Göre Arama "); //(Kardiyoloji,Gastroloji,KBB)
        System.out.println("6-Ünvana Göre Arama "); //(Pratisyen,Uzman,Cerrah)
        System.out.println("7-Ana Menu ");
        System.out.println("0-CIKIS");
        select = inp.nextInt();

        titles.fillTitles();
        branches.fillBranchList();
        doctorSituation.fillSituation();


        switch (select) {
            case 1:
                this.getUserList();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                Start.start();
                break;
            case 0:
                System.exit(0);
        }
    }


    @Override
    public void getUserList() {

        doctors.fillDoctorList();

        doctors.showUsers();

    }

    @Override
    public void search() {

    }

    @Override
    public void addUser() {

    }

    @Override
    public void removeUser() {

    }

}
