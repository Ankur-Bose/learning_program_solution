package Exercise3_Test_Execution_Order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
    @Test
    @Order(2)
    void testLogin() {
        System.out.println("Login test executed");
    }

    @Test
    @Order(1)
    void testSignIn() {
        System.out.println("SignIn test executed");
    }

    @Test
    @Order(3)
    void testDashboard() {
        System.out.println("Dashboard test executed");
    }

    @Test
    @Order(4)
    void testSignOut() {
        System.out.println("SignOut test executed");
    }

    @Test
    @Order(5)
    void testLogout() {
        System.out.println("Logout test executed");
    }
}
