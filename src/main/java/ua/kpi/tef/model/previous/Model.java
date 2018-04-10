package ua.kpi.tef.model.previous;

public class Model {
    Notebook notebook;
    public void initNote(Notebook note) throws DB_Exception {
        if (DBSimulation.checkLogin(note.getLogin())) {
            this.notebook = note;
            throw new DB_Exception(note.getLogin());
        }
        else {
            this.notebook = note;
        }
    }

    public Notebook getNotebook() {
        return notebook;
    }
}
