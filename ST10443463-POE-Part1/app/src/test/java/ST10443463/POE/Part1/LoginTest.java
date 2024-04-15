/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ST10443463.POE.Part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yashin
 */
public class LoginTest {

    @Test
    public void testcheckUsername() {
        assertTrue(Login.checkUserName("kyl_1"));
        assertFalse(Login.checkUserName("kyle!!!!!"));

    }

    @Test
    public void testPasswordComplexity() {
        assertTrue(Login.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertFalse(Login.checkPasswordComplexity("password"));

    }

    @Test
    public void testRegisterUser() {
        assertTrue(Login.registerUser());
    }

}
