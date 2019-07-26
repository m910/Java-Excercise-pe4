package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceOfWordTest {
    MultipleOccuranceOfWord multipleOccuranceOfWord;

    @Before
    public void setUp() throws Exception {
        multipleOccuranceOfWord=new MultipleOccuranceOfWord();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccuranceOfWord=null;
    }

    @Test
    public void givenAStringGivesOccuranceOfTheWord(){
        assertEquals("matches",multipleOccuranceOfWord.multipleOccuranceOfWord("She sells seashells by the seashore","se"));
    }

    @Test
    public void givenAStringGivesOutputAsOccuranceOfTheWord(){
        assertEquals("matches",multipleOccuranceOfWord.multipleOccuranceOfWord("a quick brown fox jumps over the lazy dog","a"));
    }

    @Test
    public void givenAStringDoesNotGivesOccuranceOfTheWord()
    {
        assertNotEquals("matches",multipleOccuranceOfWord.multipleOccuranceOfWord("a quick brown fox jumps over the dog","z"));
    }
}
