package org.example;


import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ExampleClass {

    // Method 1: Generate a random password
    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }

    // Method 2: Count the number of vowels in a given string
    public static int countVowels(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String vowels = "AEIOUaeiou";
        int count = 0;

        for (char character : input.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                count++;
            }
        }

        return count;
    }

    // Method 3: Check if a string is a valid email address
    public static boolean isValidEmailAddress(String email) {
        // Simple email validation regex
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(regex);
    }

    // Method 4: Reverse a sentence
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    // Method 5: Generate a unique identifier based on timestamp and random number
    public static String generateUniqueIdentifier() {
        long timestamp = System.currentTimeMillis();
        int randomInt = new SecureRandom().nextInt(10000);
        return timestamp + "-" + randomInt;
    }

    // Method 6: Calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers.");
        }
        return 0.5 * base * height;
    }

    // Method 7: Calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers.");
        }
        return length * width;
    }

    // Method 8: Calculate the volume of a cylinder
    public static double calculateCylinderVolume(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Radius and height must be positive numbers.");
        }
        double baseArea = Math.PI * Math.pow(radius, 2);
        return baseArea * height;
    }

    // Method 9: Find the greatest common divisor (GCD) of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method 10:  (vulnerable)
    // If an application uses a key that is considered short and insecure,
    // the encrypted data is exposed to attacks aimed at getting at the plaintext.
    public static void generateKey(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024); // Vulnerable

        } catch (NoSuchAlgorithmException e) {
            // ...
        }
    }
}