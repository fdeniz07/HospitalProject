package core.helpers;

public class Gender {

    public static String getGender(int id) {
        if (id == 1) {
            return "Male";
        } else if (id == 2) {
            return "Female";
        } else return "nonBinary";
    }
}
