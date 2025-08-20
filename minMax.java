public class MaxMinArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {12, 45, 7, 89, 34, 22};

        // Assume first element is both max and min
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];   // Update max
            }
            if(numbers[i] < min) {
                min = numbers[i];   // Update min
            }
        }

        // Display result
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
