import org.junit.jupiter.api.Test;

public class AuthTest {
    @Test
    public void successrwrs () {
        step("Go to the Website: ");
        step("Click account");
        step("Click companies");
        step("Click +");
        step("Fill all fields with * except for the status field");
        step("Click Save");
    }
