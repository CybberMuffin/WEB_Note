package ua.kpi.tef.controller;

public interface RegexValues {
    String ONLY_LETTERS = "[A-Za-z]*";
    String ONLY_NUMBERS = "[\\d]+";
    String EVERYTHING = "(.*?)";
    String NUM_AND_LETTERS = "[0-9A-z]+";
    String DIGIT_PHONE_NUMBER= "^[+]?[0-9]?{2}[0-9]{10}$";
    String EMAIL_SPECIAL = "^[A-Za-z0-9%_+-]+@[a-z.]+\\.[a-z]{2,6}$";
    String INDEX = "[0-9]{5,10}";
    String DATE = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
    String HARDCORE_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))" +
            "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    /*dd.mm.yyyy || dd-mm-yyyy || dd/mm/yyyy*/
}
