package ua.kpi.tef.view;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public String addBundle(String... messages) {
        StringBuilder concatString = new StringBuilder();
        for (String v : messages) {
        concatString = concatString.append(bundle.getString(v));
        }
        String message = new String(concatString);
        return message;
    }
}
