package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;
    @Before
    public void setUp() {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        removeVowels=null;
    }

    @Test
    public void removeVowels(){
        String[] result=RemoveVowels.removeVowels(new String[] {"india","pakistan"});
        assertArrayEquals(new String[] {"nd","pkstn"},result);
    }

    @Test
    public void ifStringIsLessThanZeroPrintErrMsg(){
        String[] result=RemoveVowels.removeVowels(new String[] {});
        assertArrayEquals(new String[] {"nulllength should be greater than 1",null},result);
    }
    @Test
    public void ifStringIsNullPrintErrMsg(){
        String[] result=RemoveVowels.removeVowels(new String[] {"rama"});
        assertArrayEquals(new String[] {"rm",null},result);
    }
    @Test
    public void ifArrayLengthIsLessThanZeroPrintErrMsg(){
        String[] result=RemoveVowels.removeVowels(new String[] {"",""});
        assertArrayEquals(new String[] {null,null},result);
    }

}