package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {
    ReplaceLetter replaceLetter;


    @Before
    public void setUp() throws Exception {

        replaceLetter=new ReplaceLetter();
    }

    @After
    public void tearDown() throws Exception {
        replaceLetter=null;
    }

    @Test
    public void replaceALetterDByF(){
        assertEquals("faity fry",replaceLetter.replaceALetter("daily dry"));
    }

    @Test
    public void replaceALetter(){
        assertEquals("tonfon",replaceLetter.replaceALetter("london"));
    }

    @Test
    public void nullInput(){
        assertNull(replaceLetter.replaceALetter(null));
    }
}