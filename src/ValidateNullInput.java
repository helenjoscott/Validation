public class ValidateNullInput {
    // empty usernames are not allowed
    // usernames that are explicitly assigned to be null re not allowed


    static boolean isUsernameEmpty(String username) {
        // returns yes if the username is empty
        return username.isEmpty();
    }

    static boolean isUsernameNull(String username) {
        // returns yes if the username is null
        return username == null;
    }

}
