public class ValidateSpecialCharsInput {
    static boolean doesUsernameContainSpecialChars(String username) {
        return !username.toLowerCase()
                .replaceAll("[^a-z]", "").equals(username);
    }


    static boolean doesUsernameContainCharsAndUpperCase(String username) {
        return (!username.toLowerCase().equals(username)) && (!username.replaceAll("[^a-z]", "").equals(username));
    }
}
