import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSpecialCharsInputTest {

    @Test
    void shouldReturnTrueIfUserNameStartsWithSpecialChar() {
        String beingTested = "!helenscott";
        assertTrue(ValidateSpecialCharsInput.doesUsernameContainSpecialChars(beingTested));
    }

}