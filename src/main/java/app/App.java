package app;

import app.data.DataProvider;
import app.exceptions.AppException;
import app.utils.AppValidator;

public class App {

    public static void main(String[] args) {
        getOutput(handleData());
    }

    private static String handleData() {
        DataProvider provider = new DataProvider();
        AppValidator validator = new AppValidator();
        try {
            return validator.validateAltitude(provider.getValue());
        } catch (AppException ex) {
            return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
