package business.concretes;

import application.console.concretes.Start;
import business.abstracts.MenuManager;
import business.abstracts.MenuService;
import core.Helpers.Slow;
import entities.concretes.Complaints;
import entities.concretes.LastStatuses;
import entities.concretes.Patients;
import entities.concretes.Priorities;

import java.util.InputMismatchException;
import java.util.Scanner;

import static entities.concretes.Complaints.complaintsList;
import static entities.concretes.Patients.patientsList;
import static entities.concretes.Priorities.prioritiesList;

public class PatientMenuManager extends MenuManager implements MenuService {

    Scanner inp = new Scanner(System.in);
    Patients patients = new Patients();
    PatientManager patientManager = new PatientManager();
    Priorities priorities = new Priorities();

    Complaints complaints = new Complaints();
    LastStatuses lastStatuses = new LastStatuses();

    @Override
    public void getSelectionMenu() {

        priorities.fillPrioritiesList();
        complaints.fillComplaintList();
        lastStatuses.fillLastStatusList();
        patients.fillPatientsList();
        do {
            System.out.println();
            String message = "========== HASTA MENÜSÜ ==========\n";
            Slow.slowPrint(message, 10);
            System.out.println("Lütfen yapmak istediginiz islem türünü seciniz:");
            System.out.println("1-Hasta ekle");
            System.out.println("2-Hasta silme");
            System.out.println("3-Tüm Hasta Listesi");
            System.out.println("4-Sikayete Göre Arama"); //(Bas Agrisi,bulanti,kusma,Alerji)
            System.out.println("5-Öncelige Göre Arama"); //(Acil,Poliklinik,Rutin)
            System.out.println("6-TC No ya Göre Arama"); // TC No, gecmis tüm kayitlar
            System.out.println("7-Randevu No ya Göre Arama"); //Randevu no sadece o kayit
            //System.out.println("8-Cinsiyete Göre Arama"); //(Erkek,Kadin) //Sonra yapiliacak
            System.out.println("9-Ana Menu ");
            System.out.println("0-CIKIS");
            System.out.println("\nSeçiminiz: ");

            int select = -1;

            try {
                select = inp.nextInt();
            } catch (InputMismatchException ie) {
                System.out.println("Lütfen seciminizini asagidaki menü numaralarindan giriniz");
                inp.nextLine();
                getSelectionMenu();
            }


            switch (select) {
                case 1:
                    addUser();
                    break;
                case 2:
                    patients.showUsers();
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
                    search(4);
                    break;
//                case 8:
//                    search(5);
//                    break;
                case 9:
                    Start.start();
                    break;
                case 0:
                    String s = "İyi günler, saglikli günler dileriz...";
                    Slow.slowPrint(s, 30);
                    System.exit(0);
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }
        } while (true);
    }


    @Override
    public void getUserList() {
        patients.showUsers();
    }


    @Override
    public void search(int choise) {
        inp.nextLine();
        String id = "0";
        int flag = 0;
        if (choise == 1) {

            System.out.println("Hangi sikayete göre arama yapmak istiyorsunuz?");
            complaintsList.
                    forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getComplaint()));

            System.out.println("\nSikayet id'sini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]", "");

            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-9s  %-12s %-12s %-12s\n", "Hasta Kodu", "Hasta Ad", "Hasta Soyad", "TC NO", "Dogum Tarihi", "Cinsiyet", "Aciliyet", "Sikayet", "Islem Durumu");
            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "---------", "--------------------", "--------------------", "-----------", "----------", "------------", "------------", "------------", "------------");

            for (Patients w : patientsList) {
                if (w.getComplaint().getId() == Integer.parseInt(id)) {
                    flag++;
                    System.out.printf("\"\"%-9s  %-20s  %-20s  %-11s  %-10s  %-9s  %-12s %-12s %-12s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getTcNo(), w.getBirthDate(), w.getGender(), w.getPriority(), w.getComplaint(), w.getLastStatus());
                }
            }
        } else if (choise == 2) {
            System.out.println("Hangi aciliyete göre arama yapmak istiyorsunuz?");
            prioritiesList.
                    forEach(t -> System.out.println("Id:" + t.getId() + " --> " + t.getPriority()));

            System.out.println("\nAciliyet id'sini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]", "");

            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "Hasta Kodu", "Hasta Ad", "Hasta Soyad", "TC NO", "Dogum Tarihi", "Cinsiyet", "Aciliyet", "Sikayet", "Islem Durumu");
            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "---------", "--------------------", "--------------------", "-----------", "----------", "------------", "------------", "------------", "------------");

            for (Patients w : patientsList) {
                if (w.getPriority().getId() == Integer.parseInt(id)) {
                    flag++;
                    System.out.printf("\"\"%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getTcNo(), w.getBirthDate(), w.getGender(), w.getPriority(), w.getComplaint(), w.getLastStatus());
                }
            }


        } else if (choise == 3) {
            System.out.println("Hangi TC NO'ya göre arama yapmak istiyorsunuz?");
            patientsList.
                    forEach(t -> System.out.println("Id:" + t.getId() + " --> " + t.getTcNo()));

            System.out.println("\nHasta TC NO'sunu giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]", "");

            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "Hasta Kodu", "Hasta Ad", "Hasta Soyad", "TC NO", "Dogum Tarihi", "Cinsiyet", "Aciliyet", "Sikayet", "Islem Durumu");
            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "---------", "--------------------", "--------------------", "-----------", "----------", "------------", "------------", "------------", "------------");

            for (Patients w : patientsList) {
                if (w.getTcNo().equals(id)) {
                    flag++;
                    System.out.printf("\"\"%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getTcNo(), w.getBirthDate(), w.getGender(), w.getPriority(), w.getComplaint(), w.getLastStatus());
                }
            }
        } else if (choise == 4) {
            System.out.println("Hangi randevu numarasina göre arama yapmak istiyorsunuz?");
            patientsList.
                    forEach(t -> System.out.println("Id:" + t.getId() + " --> " + t.getId()));

            System.out.println("\nRandevu numarasini giriniz: ");
            id = inp.nextLine().replaceAll("[^0-9]", "");

            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "Hasta Kodu", "Hasta Ad", "Hasta Soyad", "TC NO", "Dogum Tarihi", "Cinsiyet", "Aciliyet", "Sikayet", "Islem Durumu");
            System.out.printf("%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", "---------", "--------------------", "--------------------", "-----------", "----------", "------------", "------------", "------------", "------------");

            for (Patients w : patientsList) {
                if (w.getId().equals(id)) {
                    flag++;
                    System.out.printf("\"\"%-9s  %-20s  %-20s  %-11s  %-10s  %-6s  %-10s %-12s %-12s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getTcNo(), w.getBirthDate(), w.getGender(), w.getPriority(), w.getComplaint(), w.getLastStatus());
                }
            }
        }
//        else if (choise == 5) {
//            System.out.println("Hangi cinsiyete göre arama yapmak istiyorsunuz?");
//            genderList.
//                    forEach(t -> System.out.println("Id:" + t.getId() + " --> " + t.getTittle()));
//
//            System.out.println("\nÜnvan id'sini giriniz: ");
//            id = inp.nextLine().replaceAll("[^0-9]", "");
//
//            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "Doktor Kodu", "Doktor Ad", "Doktor Soyad", "Ünvan", "Brans", "Doktor Durum");
//            System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", "------------", "--------", "------------", "-----", "-----", "-----------");
//
//            for (Doctors w : doctorsList) {
//                if (w.getTitle().getId() == Integer.parseInt(id)) {
//                    flag++;
//                    System.out.printf("%-13s  %-15s  %-15s  %-17s  %-15s  %-12s \n", w.getId(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getBranch(), w.getDoctorSituation());
//                }
//            }
//        }

        System.out.println("------------------------------------------------------------------------------------------------");
        if (flag == 0) {
            System.out.println("Yanlış tuşlama yaptınız veya aradığınız durumda hasta bulunamadı!");
        } else {
            System.out.println("Aradığınız kriterde " + flag + " tane hasta bulundu...");
        }

    }

    @Override
    public void addUser() {
        System.out.println("Hasta ekleme menüsüne hoşgeldiniz...");
        patientManager.addPatientToList();
        this.getUserList();
    }

    @Override
    public void removeUser() {
        String select = "q";
        do {
            inp.nextLine();//dummy
            System.out.println("Lütfen silmek istediğiniz hastanin id sini giriniz: ");
            String id = inp.nextLine().replaceAll("[^A-Z0-9]", "");

            Patients patientToDelete = Patients.getPatientById(id);
            if (patientToDelete == null) {
                System.out.println("Geçersiz bir id giriniz!");
                System.out.println("Bir üst menüye çıkmak için 'Q', devam etmek için herhangi bir tuşa basınız: ");
                select = inp.next();
            } else {
                System.out.println("Hasta başarıyla silinmiştir...");
                System.out.println(patientToDelete);
                patientsList.remove(patientToDelete);
                String message = "Güncel hasta listemiz:";
                Slow.slowPrint(message, 30);
                this.getUserList();

            }
        } while (!select.equalsIgnoreCase("q"));

    }

}
