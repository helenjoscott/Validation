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

    @Test
    void shouldBeTrueWhenUsernameContainsMoreThanOneUpperCaseChar(){
        String beingTested = "HelenScott";
        assertTrue(ValidateUserNameForUpperCaseCompliance.doesUsernameContainInvalidUpperCase(beingTested));
    }

    @Test
    void testUsernameSpecialChars(){
        String beingTested = "helen!scott";
        assertTrue(Validation.doesUsernameContainSpecialChars(beingTested));
    }

    @Test
    void testUsernameSpecialCharsAndUpperCase(){
        String beingTested = "Helen!scott";
        assertTrue(Validation.doesUsernameContainCharsAndUpperCase(beingTested));
    }

    @Test
    void testUsernameEmpty(){
        String beingTested = "";
        assertTrue(Validation.isUsernameEmpty(beingTested));
    }

    @Test
    void testUsernameisNull(){
        //String beingTested;
        assertTrue(Validation.isUsernameNull(null));
    }

    @Test
    void testUsernameisOnlySpecialChars(){
        String beingTested = "@^$%*£$^£%*£&£$&£73";
        assertTrue(Validation.doesUsernameContainSpecialChars(beingTested));
    }

    @Test
    void testUsernameisOnlyUpperCase(){
        String beingTested = "SFOHJ";
        assertTrue(ValidateUserNameForUpperCaseCompliance.doesUsernameContainInvalidUpperCase(beingTested));
    }


    // do only capital
    // really long string
    // string with spaces in

    // how can I make my tests more refactorable?

    // explore something similar with TDD

}