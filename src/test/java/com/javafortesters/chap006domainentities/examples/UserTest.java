package com.javafortesters.chap006domainentities.examples;

import domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructNewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected","username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }
    @Test
    public  void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected admin", "admin", user.getUsername());

        assertEquals("given password expected", "pA55w0rD", user.getPassword());

    }
    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("password should be PaZZwor6", "PaZZwor6", user.getPassword());

    }

}
