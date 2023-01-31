package entities.abstracts;

public abstract class Users {

    private String id;
    private String FirstName;
    private String LastName;

    public Users() {
    }

    public Users(String id, String firstName, String lastName) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


}
