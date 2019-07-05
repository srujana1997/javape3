package com.stackroute.javape3;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class VowelReplaceTest {

        public static VowelReplace vowelReplace;

        @BeforeClass
        public static void setUp()
        {
            vowelReplace = new VowelReplace();
        }

        @AfterClass
        public static void tearDown()
        {
            vowelReplace = null;
        }

        @Test
        public void testForReplacingVowelsSuccess()
        {
            assertArrayEquals(new String[] {"srjn", "Ind"}, vowelReplace.getVowelReplace(new String[] {"srujana", "India"}));

            assertArrayEquals(new String[] {"", ""}, vowelReplace.getVowelReplace(new String[] {"aeiou", ""}));

            assertArrayEquals(new String[] {" AEIOU", null}, vowelReplace.getVowelReplace(new String[] {"aeiou AEIOU", null}));
        }

        @Test
        public void testForReplacingVowelsFailure()
        {
            assertArrayEquals(null, vowelReplace.getVowelReplace(null));
        }

}