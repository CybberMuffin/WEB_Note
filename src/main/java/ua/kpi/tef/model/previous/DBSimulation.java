package ua.kpi.tef.model.previous;

public enum DBSimulation {
    ADMIN("koditka"),
    USER_1("cyber"),
    USER_2("sentinel");

    private final String login;

    DBSimulation(String login){
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    static public boolean checkLogin(String value){
        for (DBSimulation db : DBSimulation.values()) {
            if (value.equals(db.getLogin()))
                return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return DBSimulation.this.name() + "{  " +
                "login='" + login + '\'' +
                '}';
    }

}
