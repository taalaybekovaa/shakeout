package javaShakeout;

public class SumOfDigits {

    /* Write a method to find sum of digits from a given number: int number=1902;
    Output: 1+9+0+2=12;
    *
    * Explanation of solution:
    * We created a method Sum of digits, which takes an integer - number as a parameter and return sum of its digits.
    We will be extracting each digit from the number one by one using modulo and division operations then sum up all the extracted digits to get the result

    * */
    public static int sumOfDigits(int number) {
        int sum = 0;//calculate the sum of the digit
        while (number > 0) { //The loop continues until the number becomes zero (all digits have been checked) First iteration number = 1902, second iteration number =190, 3 iteration 19 etc
            sum = sum + number % 10;//Extract the last digit(remainder) + add the digit to the sum First iteration sum = 0+(1902%10=2 remainder) Sum =2 Second iteration sum = 2+(190%10) Sum 2, 3 iteration sum=2+9 etc
            number = number / 10;//remove the last digit First iteration number=190 Second iteration number = 19. 3 iteration number = 1 etc
        }
        return sum;//retiring sum of the extracted digits First iteration Sum =2, Second iteration sum 2, 3 iteration sum =11 etc
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1902));//12
    }
}