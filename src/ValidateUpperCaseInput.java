// are we going to allow upper case letters?


public class ValidateUpperCaseInput {

    // capital letters are not allowed anywhere in the username
    // will return true if there are caps and false if it's okay
    // if it returns false, create the username

    static boolean doesUsernameContainInvalidUpperCase(String username) {
        // returns the inversion of the does lowercase username = username passed in
        return (!username.toLowerCase().equals(username));
    }


}
