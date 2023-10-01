package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ExampleClassTest {

    // Method 2: Test Count Vowels
    @Test
    public void testCountVowels() {
        // Test with a string that contains vowels
        int vowelCount1 = ExampleClass.countVowels("Hello, World!");
        assertEquals(3, vowelCount1);

        // Test with a string that doesn't contain vowels
        int vowelCount2 = ExampleClass.countVowels("Rhythm");
        assertEquals(0, vowelCount2);

        // Test with an empty string
        int vowelCount3 = ExampleClass.countVowels("");
        assertEquals(0, vowelCount3);

    }

    // Method 3: Test Is Valid Email Address
    @Test
    public void testIsValidEmailAddress() {
        // Test with valid email address
        assertTrue(ExampleClass.isValidEmailAddress("test.email@example.com"));

        // Test with invalid email address
        assertFalse(ExampleClass.isValidEmailAddress("invalid-email"));

        // Test with an empty string
        assertFalse(ExampleClass.isValidEmailAddress(""));

    }

    // Method 4: Test Reverse Sentence
    @Test
    public void testReverseSentence() {
        // Test with a sentence
        String reversed1 = ExampleClass.reverseSentence("This is a test sentence.");
        assertEquals("sentence. test a is This", reversed1);

        // Test with an empty string
        String reversed2 = ExampleClass.reverseSentence("");
        assertEquals("", reversed2);

    }

    // Method 6: Test Calculate Triangle Area
    @Test
    public void testCalculateTriangleArea() {
        // Test with valid values
        double area1 = ExampleClass.calculateTriangleArea(4.0, 6.0);
        assertEquals(12.0, area1, 0.01); // Using delta for double comparison

        // Test with negative values (should throw an exception)
        try {
            ExampleClass.calculateTriangleArea(-1.0, 5.0);
            fail("Expected IllegalArgumentException, but no exception was thrown");
        } catch (IllegalArgumentException e) {
            // Exception should be thrown
        }
    }

    // Method 9: Test Find GCD
    @Test
    public void testFindGCD() {
        // Test with two positive numbers
        int gcd1 = ExampleClass.findGCD(24, 36);
        assertEquals(12, gcd1);

        // Test with both numbers being zero (should return 0 as GCD)
        int gcd4 = ExampleClass.findGCD(0, 0);
        assertEquals(0, gcd4);
    }
}
