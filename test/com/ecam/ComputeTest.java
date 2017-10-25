package com.ecam;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeTest {
    Compute tests = new Compute();
    @Test
    public void addition() throws Exception {
        org.junit.Assert.assertEquals(5.0,tests.addition(3.0,2.0),0);
    }

    @Test
    public void substraction() throws Exception {
        org.junit.Assert.assertEquals(1.0, tests.substraction(3.0,2.0),0);
    }

    @Test
    public void multiplication() throws Exception {
        org.junit.Assert.assertEquals(6.0,tests.multiplication(3.0,2.0),0);
    }

    @Test
    public void division() throws Exception {
        org.junit.Assert.assertEquals(1.5,tests.division(3.0,2.0),0);
    }

}