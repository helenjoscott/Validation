import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserNameForUpperCaseComplianceTest {

    @Test
    // I want to test that when there are caps in the middle of the username, it does not create the user
    void shouldReturnTrueIfUsernameHasAnyCapsIn() {
        String beingTested = "heLensCCot";
        assertTrue(ValidateUserNameForUpperCaseCompliance.doesUsernameContainInvalidUpperCase(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameStartsWithCaps() {
        String beingTested = "Helenscott";
        assertTrue(ValidateUserNameForUpperCaseCompliance.doesUsernameContainInvalidUpperCase(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameEndsWithCaps() {
        String beingTested = "helenscoT";
        assertTrue(ValidateUserNameForUpperCaseCompliance.doesUsernameContainInvalidUpperCase(beingTested));
    }
}