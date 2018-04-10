package ua.kpi.tef.controller;

import ua.kpi.tef.model.previous.Notebook;
import ua.kpi.tef.view.Messages;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class InputNote {
    private Notebook note;
    private ArrayList<String> errors;
    private boolean correct;


    public InputNote() {
        this.note = new Notebook();
        this.errors = new ArrayList<>();
    }

    public Notebook getNote() {
        return note;
    }
    public boolean isCorrect() {
        return correct;
    }
    public ArrayList<String> getErrors() {
        return errors;
    }

    public void inputNotebook(){
        checkError(note.getLogin(), RegexValues.EVERYTHING, Messages.INPUT_LOGIN_ERROR);
        checkError(note.getName(), RegexValues.ONLY_LETTERS, Messages.INPUT_NAME_ERROR);

        correct = checkRegex(note.getLogin(), RegexValues.EVERYTHING)
                && checkRegex(note.getName(), RegexValues.ONLY_LETTERS);
    }

    private void checkError(String field, String regex, String err){
        if(!checkRegex(field, regex)){
            errors.add(err);
        }
    }

    public void setInputData(String login, String name)
    {
        note.setLogin(login);
        note.setName(name);

        errors = new ArrayList<>();
    }

    private boolean checkRegex(String string, String regexp) {
        return Pattern.compile(regexp).matcher(string).matches();
    }

}