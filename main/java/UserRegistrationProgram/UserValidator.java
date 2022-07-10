package UserRegistrationProgram;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN ="[A-Z][a-z]{3,}";
    private static final String EMAIL ="[abc][\\.][a-z]+[@][bl][\\.][co][\\.][a-z]{2,3}";
    private static final String MOBILE_NUMBER ="^(91\\s)[789][0-9]{9}$";
    private static final String PASSWORD_RULE1 ="[a-zA-Z]{8,}$";
    private static final String PASSWORD_RULE2 ="[A-Z]{1}[a-z]{8,}";
    private static final String PASSWORD_RULE3 ="[0-9A-Za-z]{8,}$";

    public boolean validateNames(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String number){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
        return pattern.matcher(number).matches();
    }
    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_RULE1);
        return pattern.matcher(password).matches();
    }
    public boolean validatePassword1(String password){
        Pattern pattern = Pattern.compile(PASSWORD_RULE2);
        return pattern.matcher(password).matches();
    }
    public boolean validatePassword2(String password){
        Pattern pattern = Pattern.compile(PASSWORD_RULE3);
        return pattern.matcher(password).matches();
    }
}
