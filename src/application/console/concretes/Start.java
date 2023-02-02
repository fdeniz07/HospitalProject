package application.console.concretes;

import business.concretes.DoctorMenuManager;
import core.helpers.Slow;

import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);

        DoctorMenuManager dmm = new DoctorMenuManager();

        int select;

        do {
            System.out.println();
           String message =    "========== DEVKENT HASTANESI UYGULAMAMIZA HOSGELDINIZ ==========\n";
            Slow.slowPrint(message,10);
            System.out.println("1-Doktor Menüsü Seçimi");
            System.out.println("2-Hasta Menüsü Seçimi");
            System.out.println("0-Çıkış");

            select = inp.nextInt();

            switch (select){
                case 1:
                    dmm.getSelectionMenu();
                    break;
                case 2:
                    //HastaMenü
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }



        }while(select != 0);

        System.out.println("İyi günler, saglikli günler dileriz...");
    }

}
