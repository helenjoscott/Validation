import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @org.junit.jupiter.api.Test
    void testGoldenPath() {
        int inputa = 10;
        int inputb = 5;
        int actual = Validation.divide(inputa, inputb);
        assertEquals(2,actual);
    }

    @Test
    void shouldAcceptAllLowerCaseAsValidUsername(){
        String beingTested = "helen";
        assertEquals("Username created!", Validation.checkUsernameValidity(beingTested));
    }



    // do only capital
    // really long string
    // string with spaces in

    // how can I make my tests more refactorable?

    // explore something similar with TDD

}