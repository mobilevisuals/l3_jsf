import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
@Named(value = "authorController")
@SessionScoped
public class AuthorController implements Serializable {

    private String firstname;
    private String lastname;
    private String name;


    /**
     * Creates a new instance of AuthorController
     */
    public AuthorController() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAuthor()
    {
        name=firstname+" "+lastname;
        Author a=new Author(firstname,lastname);
    }

}