package business.concretes;

import application.console.concretes.Start;
import business.abstracts.MenuManager;
import business.abstracts.MenuService;
import core.Helpers.Slow;
import entities.concretes.Branches;
import entities.concretes.DoctorSituation;
import entities.concretes.Doctors;
import entities.concretes.Titles;

import java.util.InputMismatchException;
import java.util.Scanner;

import static entities.concretes.Branches.branchesList;
import static entities.concretes.DoctorSituation.situationList;
import static entities.concretes.Doctors.doctorsList;
import static entities.concretes.Titles.titlesList;

public class DoctorMenuManager extends MenuManager implements MenuService {

    Scanner inp = new Scanner(System.in);
    Doctors doctors = new Doctors();
    DoctorManager doctorManager = new DoctorManager();
    Titles titles = new Titles();
    public static Branches branches = new Branches();
    DoctorSituation doctorSituation = new DoctorSituation();

    @Override
    public void getSelectionMenu() {


        titles.fillTitles();
        branches.fillBranchList();
        doctorSituation.fillSituation();
        doctors.fillDoctorList();
        do {
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
            System.out.println("\nSeçiminiz: ");

            int select=-1;

            try{
                select = inp.nextInt();
            }
            catch (InputMismatchException ie){
                System.out.println("Lütfen seciminizini asagidaki menü numaralarindan giriniz");
                inp.nextLine();
                getSelectionMenu();
            }

            switch (select) {
                case 1:
                    addUser();
                    break;
                case 2:
                    System.out.println("Doktor silme menüsüne hoşgeldiniz...");
                    doctors.showUsers();
                    removeUser();
                    break;
                case 3:
                    this.getUserList();
                    break;
                case 4:
                    search(1);
                    break;
                case 5:
                    search(2);
                    break;
                case 6:
                    search(3);
                    break;
                case 7:
                    Start.start();
                    break;
                case 0:
                    String s = "İyi günler, saglikli günler dileriz...";
                    Slow.slowPrint(s,30);
                    System.exit(0);
            }
        }while (true);
    }

    @Override
    public void getUserList() {
        doctors.showUsers();
    }

    @Override
    public void search(int choise) {
        inp.nextLine();
        String id = "0";
        int flag = 0;
        if (choise==1){
            System.out.println("Hangi doktor durumuna göre arama yapmak istiyorsunuz?");
            situationList.
                    stream().
                    forEach(t->System.out.println("Id: "+t.getId()+" --> "+t.getSituation()));

            System.out.println("\nDurumun id'sini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]","");

            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "------------", "--------", "------------", "-----", "-----", "-----------");

            for (Doctors w: doctorsList){
                if (w.getDoctorSituation().getId()==Integer.parseInt(id)){
                    flag++;
                    System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
                }
            }
        }else if (choise==2){
            System.out.println("Hangi branşa göre arama yapmak istiyorsunuz?");
            branchesList.
                    stream().
                    forEach(t-> System.out.println("Id:"+t.getId()+" --> "+t.getBranch()));

            System.out.println("\nBranş id'sini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]","");

            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "------------", "--------", "------------", "-----", "-----", "-----------");

            for (Doctors w: doctorsList){
                if (w.getBranch().getId()==Integer.parseInt(id)){
                    flag++;
                    System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
                }
            }


        }else if (choise==3){
            System.out.println("Hangi ünvana göre arama yapmak istiyorsunuz?");
            titlesList.
                    stream().
                    forEach(t-> System.out.println("Id:"+t.getId()+" --> "+t.getTittle()));

            System.out.println("\nÜnvan id'sini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]","");

            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "------------", "--------", "------------", "-----", "-----", "-----------");

            for (Doctors w: doctorsList){
                if (w.getTitle().getId()==Integer.parseInt(id)){
                    flag++;
                    System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
                }
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        if (flag==0){
            System.out.println("Yanlış tuşlama yaptınız veya aradığınız durumda doktor bulunamadı!");
        }else {
            System.out.println("Aradığınız kriterde "+flag+" tane doktor bulundu...");
        }

    }

    @Override
    public void addUser() {
        System.out.println("Doktor ekleme menüsüne hoşgeldiniz...");
        doctorManager.addDoctorToList();
        this.getUserList();
    }

    @Override
    public void removeUser() {
        String select = "q";
        do {
            inp.nextLine();//dummy
            System.out.println("Lütfen silmek istediğiniz doktorun id sini giriniz: ");
            String id = inp.nextLine().replaceAll("[^A-Z0-9]","");

            Doctors doctorToDelete = Doctors.getDoctorById(id);
            if (doctorToDelete==null){
                System.out.println("Geçersiz bir id giriniz!");
                System.out.println("Bir üst menüye çıkmak için 'Q', devam etmek için herhangi bir tuşa basınız: ");
                select = inp.next();
            }else {
                System.out.println("Doktor başarıyla silinmiştir...");
                System.out.println(doctorToDelete);
                doctorsList.remove(doctorToDelete);
                String message = "Güncel doktor listemiz:";
                Slow.slowPrint(message,30);
                this.getUserList();

            }
        }while (!select.equalsIgnoreCase("q"));

    }

}
