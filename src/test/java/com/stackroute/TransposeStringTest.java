package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {

        transposeString=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString=null;
    }

    @Test
    public void transposingAString(){
        assertEquals("emocleW ot kooBsrennigeB ",transposeString.transposingAString("Welcome to BeginnersBook"));
    }

    @Test
    public void transposingString(){
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",transposeString.transposingAString("a quick brown fox jumps over the lazy dog"));
    }


    @Test
    public void transpose(){
        assertNotEquals("emocleW ot kooBsrennigeB ",transposeString.transposingAString("Welcome to Beginners"));
    }

    @Test
    public void nullInput(){
        assertNull(transposeString.transposingAString(null));
    }


}