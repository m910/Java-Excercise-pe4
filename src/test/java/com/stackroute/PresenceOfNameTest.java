package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfNameTest {
    PresenceOfName presenceOfName;

    @Before
    public void setUp() throws Exception {
        presenceOfName=new PresenceOfName();
    }

    @After
    public void tearDown() throws Exception {

        presenceOfName=null;
    }

    @Test
    public void givenInputContainsHarry(){
        assertEquals(true,presenceOfName.findingPresenceOfName("This is Harry"));
    }

    @Test
    public void givenInputStringDoesNotContainsHarry(){
        assertEquals(false,presenceOfName.findingPresenceOfName("This is Henry"));
    }

    @Test
    public void givenInputStringContainsTheName(){
        assertNotEquals(true,presenceOfName.findingPresenceOfName("Henry is living in London"));
    }
}