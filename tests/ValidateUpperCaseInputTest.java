import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUpperCaseInputTest {

    @Test
    // I want to test that when there are caps in the middle of the username, it does not create the user
    void shouldReturnTrueIfUsernameHasAnyCapsIn() {
        String beingTested = "heLensCCot";
        assertTrue(ValidateUpperCaseInput.doesUsernameContainInvalidUpperCase(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameStartsWithCaps() {
        String beingTested = "Helenscott";
        assertTrue(ValidateUpperCaseInput.doesUsernameContainInvalidUpperCase(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameEndsWithCaps() {
        String beingTested = "helenscoT";
        assertTrue(ValidateUpperCaseInput.doesUsernameContainInvalidUpperCase(beingTested));
    }


    @Test
    void shouldReturnTrueIfUsernameIsAllUpperCase(){
        String beingTested = "HELENSCOTT";
        assertTrue(ValidateUpperCaseInput.doesUsernameContainInvalidUpperCase(beingTested));
    }
}