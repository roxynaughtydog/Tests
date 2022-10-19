package examples;

import org.junit.jupiter.api.Test;

public class AuthTest {

    @Test
    void test1() {
        step("Go to the Website: ...");
        step("Click Account ");
        step("Click Companies");
        step("Click +");
        step("Fill all fields with valid data");
        step("Click Save ");
    }

}
