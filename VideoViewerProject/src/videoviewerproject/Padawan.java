package videoviewerproject;
public class Padawan extends User {
    private String login;
    private int watched;

    public Padawan(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.watched = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getWatched() {
        return watched;
    }

    public void setWatched(int Watched) {
        this.watched = Watched;
    }
    @Override
    public String toString() {
        return "\n" + super.toString() + " - Login: " + login + "\n - Total Assitido: " + watched + "\n";
    }
}
