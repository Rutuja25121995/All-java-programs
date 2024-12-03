package com.tech.myprograms;

import java.util.HashSet;

class duplicates_array {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
        // Add elements to HashSet, duplicates are automatically removed
        for (int num : nums) {
            uniqueNumbers.add(num);
        }

        // Print unique numbers
        System.out.println("Unique numbers: " + uniqueNumbers);

        // Return the count of unique numbers
        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
    	duplicates_array s = new duplicates_array();
        int[] nums = {1, 1, 2};

        // Get the count of unique numbers
        int uniqueCount = s.removeDuplicates(nums);

        // Print the result
       
    }
}
