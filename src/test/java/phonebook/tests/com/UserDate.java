package phonebook.tests.com;

public class UserDate {
   private String mail;
    private String password;

    public String getMail() {
        return mail;
    }

    public UserDate setMail(String email) {
        this.mail = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDate setPassword(String password) {
        this.password = password;
        return this;
    }

}