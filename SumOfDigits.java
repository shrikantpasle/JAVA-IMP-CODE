import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits of " + originalNumber + " is: " + sumOfDigits);
    }
}