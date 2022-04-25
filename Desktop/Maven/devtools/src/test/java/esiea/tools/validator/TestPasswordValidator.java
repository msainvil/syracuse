package esiea.tools.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPasswordValidator {
    @Test
    void testPasswordValidatorVerify(){
       // "^(?=.*[0-9]).{6,20}$"

        String passtest1 = " "; //Expected : false
        String passtest2 = "azdjfkirold"; //Expected : false
        String passtest3 = "12345678783"; //Expected : true
        String passtest4 = "123456789OIUEHDLITEPH"; //Expected : false
        String passtest5 = "@egtdjdheueke23"; //Expected : true


        PasswordValidator pass1 = new PasswordValidator(passtest1);
        PasswordValidator pass2 = new PasswordValidator(passtest2);
        PasswordValidator pass3 = new PasswordValidator(passtest3);
        PasswordValidator pass4 = new PasswordValidator(passtest4);
        PasswordValidator pass5 = new PasswordValidator(passtest5);
        boolean f = false;

        assertEquals(pass1.verify(),f);
        assertEquals(pass2.verify(),f);
        assertTrue(pass3.verify());
        assertEquals(pass4.verify(),f);

        assertTrue(pass5.verify());

    }

}
