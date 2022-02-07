import java.io.Serializable;

public class Author implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;

    //  CONSTRUCTORS

    public Author() {
    }

    public Author(Long id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Long getId(){return id;}
    public void getId(Long id){this.id = id;}

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
