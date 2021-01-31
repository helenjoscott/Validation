import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSpacesInputTest {

    @Test
    void shouldReturnTrueIfUsernameContainsSpaces() {
        String beingTested = "helen scott";
        assertTrue(ValidateSpacesInput.doesUsernameContainSpaces(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameContainsALeadingSpace() {
        String beingTested = " helenscott";
        assertTrue(ValidateSpacesInput.doesUsernameContainSpaces(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameContainsAPostSpace() {
        String beingTested = " helenscott ";
        assertTrue(ValidateSpacesInput.doesUsernameContainSpaces(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameContainsMultipleSpaces() {
        String beingTested = "  he len scott ";
        assertTrue(ValidateSpacesInput.doesUsernameContainSpaces(beingTested));
    }
}