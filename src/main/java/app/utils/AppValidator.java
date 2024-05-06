package app.utils;

import app.exceptions.AppException;

public class AppValidator {

    private static final int LOWER_TEMPERATURE = -10;
    private static final int UPPER_TEMPERATURE = 35;

    public String validateAltitude(int temperature)
            throws AppException {
        if (temperature >= LOWER_TEMPERATURE
                & temperature <= UPPER_TEMPERATURE) {
            return "Value is OK. Data can be obtained.";
        } else {
            throw new AppException("Invalid value.");
        }
    }
}
