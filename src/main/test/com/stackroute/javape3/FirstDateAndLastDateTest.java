package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDateAndLastDateTest {
        FirstDateAndLastDate firstdateandlastdate;
        @Before
        public void setUp() {
            System.out.println("Before");
            firstdateandlastdate = new FirstDateAndLastDate();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            firstdateandlastdate = null;
        }

        @Test
        public void startDate() {
            //Arrange
            boolean expectedValue = false;
            //Act
            boolean actualValue = firstdateandlastdate.startDate();
            assertEquals(expectedValue, actualValue);
            assertNotNull(actualValue);
        }

        @Test
        public void endDate() {
            //Arrange
            boolean expectedValue1 = false;
            //Act
            boolean actualValue1 = firstdateandlastdate.endDate();
            assertEquals(expectedValue1, actualValue1);
            assertNotNull(actualValue1);
        }
}