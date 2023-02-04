package core.validations;

import java.util.Scanner;

public class InputValidator {

    boolean isDigit;
    Scanner scan = new Scanner(System.in);

    public String isNotNumeric() {

        do {
            String value = scan.next().trim();
            value = value.replaceAll("[^0-9]", "");

            isDigit = false;

            if (!value.isEmpty()) {

                return value;

            } else {

                System.out.println("Rakam dışında bir karakter girilemez...");
                System.out.println("Tekrar deneyiniz: ");

                isDigit = true;

            }
        } while (true);
    }
}
