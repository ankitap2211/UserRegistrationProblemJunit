import UserRegistrationProgram.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateNames("Ankita");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateNames("anki");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateNames("Patil");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateNames("pa");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("xyz@bl.co.in");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 9919819801");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 789456");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("abcdefgh");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("123defgh");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPasswordUpperCase_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword1("AAlkhyts");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPasswordUpperCase_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword1("lkhyts");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPasswordNumber_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword2("1wertyuA");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPasswordNumber_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword2("rtyuA");
        Assertions.assertTrue(result);
    }
}
