package com.tech.myprograms;

class Solution {
    public boolean isPalindrome(int x) {
        // Convert the number to a String
        String numberStr = String.valueOf(x);
        int length = numberStr.length();
        
        // Check characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 121;
        boolean result = s.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
