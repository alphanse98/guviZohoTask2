// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.


public class problem2 { 

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = getSumOfSquares(slow); // Move one step
            fast = getSumOfSquares(getSumOfSquares(fast)); // Move two steps
        } while (slow != fast);
        
        return slow == 1;
    }
    
    private static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 2;
        
        System.out.println("Is " + n1 + " a happy number? " + isHappy(n1)); // Output: true
        System.out.println("Is " + n2 + " a happy number? " + isHappy(n2)); // Output: false
    }
}
