import java.util.Scanner;

public class EvenNumberCounter 
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        int evenCount = 0;
        for (int num : arr) 
        {
            if (num % 2 == 0) 
            {
                evenCount++;
            }
        }

        System.out.println("The number of even numbers in the array is: " + evenCount);
    }
}