package app.utils;

import app.exceptions.AppException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppValidatorTest {

    AppValidator validator;

    @BeforeEach
    void setUp() {
        validator = new AppValidator();
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, -5, 0, 15, 35})
    @DisplayName("Test if temperature is in bounds.")
    void test_If_Temperature_Is_In_Bounds(int value) throws AppException {
        assertEquals("Value is OK. Data can be obtained.",
                validator.validateAltitude(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {-110, -11, 36, 130})
    @DisplayName("Test if invalid temperature throws exception.")
    void test_If_Invalid_Temperature_Throws_Exception(int value) {
        assertThrows(AppException.class, () ->
                validator.validateAltitude(value), "No exception.");
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }
}