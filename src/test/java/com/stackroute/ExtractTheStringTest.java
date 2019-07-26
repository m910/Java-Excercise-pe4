package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtractTheStringTest {
    ExtractTheString extractTheString;

    @Before
    public void setUp() throws Exception {
        extractTheString =new ExtractTheString();
    }

    @After
    public void tearDown() throws Exception {

        extractTheString=null;
    }

    @Test
    public void givenAStringExctractedTheWord(){
        assertEquals("Sorted",extractTheString.extractingTheStringFromParagraphAndSorting("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void givenAInputStringAndSortedAlphabetically(){
        assertEquals("Sorted",extractTheString.extractingTheStringFromParagraphAndSorting("This is Harry"));
    }

    @Test
    public void givenAInputStringDoesNotSortedAlphabetically(){
        assertNotEquals("sorted",extractTheString.extractingTheStringFromParagraphAndSorting("This is Harry"));
    }
}