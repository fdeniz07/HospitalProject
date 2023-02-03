package business.concretes;

import core.Helpers.Gender;
import core.Helpers.IdMaker;
import core.validations.DateValidator;
import core.validations.NameValidator;
import core.validations.TcNoValidator;
import entities.concretes.Complaints;
import entities.concretes.LastStatuses;
import entities.concretes.Patients;
import entities.concretes.Priorities;

import java.util.Scanner;

import static entities.concretes.Complaints.complaintsList;
import static entities.concretes.Patients.patientsList;
import static entities.concretes.Priorities.prioritiesList;

public class PatientManager implements IdMaker {

    Scanner inp = new Scanner(System.in);

    Patients patients = new Patients();

    //Validations
    NameValidator nameValidator = new NameValidator();
    TcNoValidator tcNoValidator = new TcNoValidator();
    DateValidator dateValidator = new DateValidator();

    private static int patientIdCounter = 1005;

    @Override
    public String idMaker(String number) {
        patientIdCounter++;
        String suffix = "HT";
        number = number.substring(number.length() - 3);

        return suffix + patientIdCounter + number;
    }

    void addPatientToList() {
        System.out.println("Lütfen eklemek istediğiniz hastanin adını giriniz: ");
        patients.setFirstName(nameValidator.isValidFirstName());

        System.out.println("Lütfen eklemek istediğiniz hastanin soyadını giriniz: ");
        patients.setLastName(nameValidator.isValidFirstName());

        System.out.println("Lütfen eklemek istediğiniz hastanin TC kimlik numarasını giriniz: ");
        patients.setTcNo(tcNoValidator.getValidTcNumber());

        System.out.println("Lütfen hastanin dogum tarihinizi giriniz: ");
        patients.setBirthDate(dateValidator.getValidDate());

        System.out.println("Lütfen hastanin cinsiyetini giriniz (1 : Erkek, 2 : Kadin): ");
        patients.setGender(Gender.getGender(inp.nextInt()));

        System.out.println("Lütfen hastanin aciliyet durumunu giriniz: ");
        prioritiesList.
                forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getPriority()));

        System.out.println("\nAciliyet id'sini giriniz: ");
        inp.nextLine();
        String priorityId = inp.nextLine().replaceAll("[^0-9]", "");

        Priorities priotity = Priorities.
                getPrioritiesById(Integer.parseInt(priorityId));
        if (priotity == null) {
            System.out.println("Geçersiz id girdiniz!");
            System.out.println("Lütfen tekrar deneyiniz...");
            addPatientToList();
        }
        patients.setPriority(priotity);


        System.out.println("Lütfen hastanin sikayeti türünü giriniz: ");
        complaintsList.
                forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getComplaint()));

        System.out.println("\nSikayet id'sini giriniz: ");
        String complaintId = inp.nextLine().replaceAll("[^0-9]", "");

        Complaints complaints = Complaints.
                getComplaintById(Integer.parseInt(complaintId));
        if (complaints == null) {
            System.out.println("Geçersiz id girdiniz!");
            System.out.println("Lütfen tekrar deneyiniz...");
            addPatientToList();
        }
        patients.setComplaint(complaints);


//        System.out.println("Lütfen hastanin islem durumu durumunu giriniz: "); //Hastanin son durumuna sonra bakilacak!
//        lastStatusesList.
//                forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getLastStatus()));
//
//
//        System.out.println("\nIslem id'sini giriniz: ");
//        String lastStatusId = inp.nextLine().replaceAll("[^0-9]", "");
//
//        LastStatuses lastStatuses = LastStatuses.
//                getLastStatusById(Integer.parseInt(lastStatusId));
//        if (lastStatuses == null) {
//            System.out.println("Geçersiz islem id girdiniz!");
//            System.out.println("Lütfen tekrar deneyiniz...");
//            addPatientToList();
//        }
//        patients.setLastStatus(lastStatuses);

        patients.setPriority(priotity);
        patients.setComplaint(complaints);
        patients.setLastStatus(LastStatuses.getLastStatusById(1));
        patients.setId(idMaker(String.valueOf(patientIdCounter)));

        Patients newPatient = new Patients(patients.getId(), patients.getFirstName(), patients.getLastName(), patients.getTcNo(), patients.getBirthDate(), patients.getGender(), patients.getPriority(), patients.getComplaint(), patients.getLastStatus());
        patientsList.add(newPatient);
        System.out.println("Hasta başarıyla eklenmiştir...");
        System.out.println(newPatient);
    }
}
