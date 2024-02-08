import java.util.Scanner;

public class PalindromeNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a Palindrome or not: ");
        int num = sc.nextInt();
        int reverse = reverseFun(num);
        if(num == reverse) {
            System.out.println("Above entered number is Palindrome number.");
        }
        else {
            System.out.println("Above entered number is not a Palindrome number.");
        }
    }
    public static int reverseFun(int number) {
        int sum = 0, remainder;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum*10) + remainder;
            number /= 10;
        }
        return sum;
    }
}
