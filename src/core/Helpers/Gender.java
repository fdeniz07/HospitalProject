package core.Helpers;

import java.util.InputMismatchException;

public class Gender {


    public static String getGender(int id) {

       // System.out.println("Lütfen cinsiyetinizi giriniz (1 : Erkek, 2 : Kadin)");

        String response = "";

        try {
            if (id == 1) {
                response = "Erkek";
            } else if (id == 2) {
                response = "Kadin";
            } else {
                response = "Diger";
            }

        } catch (InputMismatchException e) {
            System.out.println("Lütfen gecerli bir sayi giriniz");
          //  scanner.nextInt();
        }

        return response;
    }
}
