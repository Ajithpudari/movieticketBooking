package in.movie.movieticketbook.entity;

public class Registration {

    private int id;
    private String firstName;
    private String lastname;
    private String mobileNumber;
    private String mail;
    private String password;

    public Registration(int id, String firstName, String lastname, String mobileNumber, String mail, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
        this.mail = mail;
        this.password = password;
    }



    public Registration() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registration{" +

                ", userId=" + id +
                ", userName='" + firstName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", uEmail='" + mail + '\'' +
                ", uPassword='" + password + '\'' +
                "lastname='" + lastname + '\'' +
                '}';
    }


}



