public class Validation {

    public static final String CONTAINS_SPECIAL_CHARS = "Your username was not created because it contains special characters";
    public static final String CONTAINS_UPPER_CASE = "Your username was not created because it contains upper case letters";
    public static final String CONTAINS_UPPER_CASE_AND_CHARS = "Your username was not created because it contains upper case letters and special characters";
    public static final String CONTAINS_SPACES = "Your username was not created because it contains spaces";
    public static final String IS_EMPTY = "Your username was not created because it contains spaces";
    public static final String IS_NULL = "Your username was not created because it was null";

    public static boolean specialChars = false;
    public static boolean upperCase = false;

    public static void main(String[] args) {
        System.out.println("Hello Helen");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    // validates a username or password to some criteria

    public static String checkUsernameValidity(String username) {
        //if (isUsernameNull(username)) return IS_NULL;
        //if (isUsernameEmpty(username)) return IS_EMPTY;
        //if (doesUsernameContainSpaces(username)) return CONTAINS_SPACES;
        //if (doesUsernameContainCharsAndUpperCase(username)) return CONTAINS_UPPER_CASE_AND_CHARS;
        //if (doesUsernameContainUpperCase(username)) return CONTAINS_UPPER_CASE;
        //if (doesUsernameContainSpecialChars(username)) return CONTAINS_SPECIAL_CHARS;
        return "Username created!";
    }




}
