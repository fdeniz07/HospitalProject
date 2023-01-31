package entities.concretes;

public class Titles {

    private int id;
    private String title;


    public Titles() {
    }

    public Titles(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", title='" + title + '\'' ;
    }

}
