package business.concretes;

import core.Helpers.IdMaker;
import core.validations.NameValidator;
import core.validations.TcNoValidator;
import entities.concretes.Branches;
import entities.concretes.DoctorSituation;
import entities.concretes.Doctors;
import entities.concretes.Titles;

import java.util.Scanner;

import static entities.concretes.Branches.branchesList;
import static entities.concretes.Doctors.doctorsList;
import static entities.concretes.Titles.titlesList;

public class DoctorManager implements IdMaker {

    Scanner inp = new Scanner(System.in);

    Doctors doctors = new Doctors();

    //Validations
    NameValidator nameValidator = new NameValidator();
    TcNoValidator tcNoValidator = new TcNoValidator();

    private static int drIdCounter = 504;

    @Override
    public String idMaker(String number) {
        drIdCounter++;
        String suffix = "DR";
        number = number.substring(number.length() - 3);

        return suffix + drIdCounter + number;
    }

    void addDoctorToList() {
        System.out.println("Lütfen eklemek istediğiniz doktorun adını giriniz: ");
        doctors.setFirstName(nameValidator.isValidFirstName());

        System.out.println("Lütfen eklemek istediğiniz doktorun soyadını giriniz: ");
        doctors.setLastName(nameValidator.isValidFirstName());

        System.out.println("Lütfen eklemek istediğiniz doktorun kimlik numarasını giriniz: ");
        String tc = tcNoValidator.getValidTcNumber();

//        System.out.println("Lütfen eklemek istediğiniz doktorun doğum tarihini giriniz: "); eklenebilir
        System.out.println("Lütfen eklemek istediğiniz doktorun üvanını seçiniz: ");
        titlesList.stream().forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getTittle()));

        System.out.println("\nÜnvan id'sini giriniz: ");
        String titleId = inp.nextLine().replaceAll("[^0-9]", "");

        Titles title = Titles.getTitleById(Integer.parseInt(titleId));
        if (title == null) {
            System.out.println("Geçersiz id girdiniz!");
            System.out.println("Lütfen tekrar deneyiniz...");
            addDoctorToList();
        }
        doctors.setTitle(title);
        System.out.println("Lütfen eklemek istediğiniz doktorun branşını seçiniz: ");
        branchesList.stream().forEach(t -> System.out.println("Id: " + t.getId() + " --> " + t.getBranch()));

        System.out.println("\nBranş id'sini giriniz: ");
        String branchId = inp.nextLine().replaceAll("[^0-9]", "");
        Branches branch = Branches.getBranchById(Integer.parseInt(branchId));
        if (branch == null) {
            System.out.println("Geçersiz id girdiniz!");
            System.out.println("Lütfen tekrar deneyiniz...");
            addDoctorToList();
        }
        doctors.setBranch(branch);
        doctors.setDoctorSituation(DoctorSituation.getDoctorSituationById(22));
        doctors.setId(idMaker(tc));

        Doctors newDoctor = new Doctors(doctors.getId(), doctors.getFirstName(), doctors.getLastName(), doctors.getTitle(), doctors.getBranch(), doctors.getDoctorSituation());
        doctorsList.add(newDoctor);
        System.out.println("Doktor başarıyla eklenmiştir...");
        System.out.println(newDoctor);

    }

}
