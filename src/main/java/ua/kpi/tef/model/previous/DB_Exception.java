package ua.kpi.tef.model.previous;

public class DB_Exception extends Exception {
    private String login;

    public DB_Exception(String login){
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
