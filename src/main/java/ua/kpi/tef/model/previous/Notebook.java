package ua.kpi.tef.model.previous;

public class Notebook {
    private String login;
    private String name;

    public Notebook() {}

    public Notebook(String login, String name){
        this.login = login;
        this.name = name;
    }
    public Notebook(Notebook note){
        this(note.login, note.name);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
