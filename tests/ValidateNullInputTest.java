import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateNullInputTest {

    @Test
    void shouldReturnTrueIfUsernameIsEmpty() {
        String beingTested = "";
        assertTrue(ValidateNullInput.isUsernameEmpty(beingTested));
    }

    @Test
    void shouldReturnTrueIfUsernameisNull() {
        String beingTested = null;
        assertTrue(ValidateNullInput.isUsernameNull(beingTested));
    }

    // do we want to allow spaces?
/*    @Test
    void shouldReturnTrueIfUsernameContainsOnlySpaces() {
        String beingTested = "    ";
        assertTrue(ValidateNullInput.isUsernameEmpty(beingTested));
    }*/

}