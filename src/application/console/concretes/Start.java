package application.console.concretes;

import business.concretes.DoctorMenuManager;
import business.concretes.PatientMenuManager;
import core.Helpers.Slow;

import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);

        DoctorMenuManager dmm = new DoctorMenuManager();
        PatientMenuManager pmm = new PatientMenuManager();

        String s = "İyi günler, saglikli günler dileriz...";

        int select;

        do {
            System.out.println();
           String message =    "========== DEVKENT HASTANESI UYGULAMAMIZA HOSGELDINIZ ==========\n";
            Slow.slowPrint(message,10);
            System.out.println("1-Doktor Menüsü Seçimi");
            System.out.println("2-Hasta Menüsü Seçimi");
            System.out.println("0-Çıkış");
            System.out.println("\nSeçiminiz: ");

            select = inp.nextInt();

            switch (select){
                case 1:
                    dmm.getSelectionMenu();
                    break;
                case 2:
                    pmm.getSelectionMenu();
                    break;
                case 0:
                    Slow.slowPrint(s,30);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }
        }while(true);


    }

}
