package business.concretes;

import application.console.concretes.Start;
import business.abstracts.AppointmentService;
import business.abstracts.MenuManager;
import core.Helpers.Slow;
import entities.concretes.Appointment;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppointmentMenuManager extends MenuManager implements AppointmentService {

    Scanner inp = new Scanner(System.in);

    Appointment appointment;

    @Override
    public void getSelectionMenu() {



        do {
            System.out.println();
            String message = "========== RANDEVU MENÜSÜ ==========\n";
            Slow.slowPrint(message, 30);
            System.out.println("Lütfen yapmak istediginiz islem türünü seciniz:");
            System.out.println("1-Randevu Bul");
            System.out.println("2-Randevu Iptal Et");
            System.out.println("3-Tüm Randevularin Listesi");
            System.out.println("4-Tamamlanmis Randevularin Listesi");
            System.out.println("5-Iptal Edilen Randevularin Listesi");
            System.out.println("6-Devam etmekte olan Randevularin Listesi");
            System.out.println("7-Ana Menu ");
            System.out.println("0-CIKIS");
            System.out.println("\nSeçiminiz: ");

            int select = -1;

            try {
                select = inp.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Lütfen seciminizini asagidaki menü numaralarindan giriniz");
                inp.nextLine();
                getSelectionMenu();
            }

            switch (select) {
                case 1:

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
                    String s = "İyi günler, saglikli günler dileriz...";
                    Slow.slowPrint(s, 30);
                    System.exit(0);
            }
        } while (true);
    }



    @Override
    public Appointment createAppointment() {
        return null;
    }

    @Override
    public Appointment getAppointment(String id) {
        return null;
    }

    @Override
    public Appointment cancelAppointment(String id) {
        return null;
    }

    @Override
    public List<Appointment> getAllAppointmentsList() {
        return null;
    }

    @Override
    public List<Appointment> getCompletedAppointmentsList() {
        return null;
    }

    @Override
    public List<Appointment> getContinuingAppointmentsList() {
        return null;
    }


}
