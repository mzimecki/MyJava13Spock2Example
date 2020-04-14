package com.zimek;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomethingJunitTest {

    @Test
    public void should_return_correct_number() {
        //given
        double factor = 6.0;

        //when
        Something sth = new Something();
        double myNumber = sth.getMyNumber(factor);

        //then
        assertEquals(0, Double.compare(30.0, myNumber));
    }

}