package entities.concretes.enums;

public enum Gender {

    Male(1),
    Female(2),
    Child(3);

    private final int gender;

    Gender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }
}
