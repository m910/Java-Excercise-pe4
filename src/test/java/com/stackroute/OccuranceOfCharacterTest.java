package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceOfCharacterTest {

    OccuranceOfCharacter occuranceOfCharacter;


    @Before
    public void setUp() throws Exception {

        occuranceOfCharacter=new OccuranceOfCharacter();
    }

    @After
    public void tearDown() throws Exception {
        occuranceOfCharacter=null;
    }


    @Test
    public void countingTheOccuranceOfCharacter()
    {
        assertEquals(10,occuranceOfCharacter.countingOccuranceOfACharacter("Java is java again java again","a"));
    }

    @Test
    public void countingThOccuranceOfCharacterIs(){
        assertEquals(6,occuranceOfCharacter.countingOccuranceOfACharacter("Java Is a programming language","a"));
    }

    @Test
    public void countingTheOccurance(){
        assertNotEquals(7,occuranceOfCharacter.countingOccuranceOfACharacter("Java Is a programming language","a"));
    }



}