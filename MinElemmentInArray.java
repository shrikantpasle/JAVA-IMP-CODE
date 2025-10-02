import java.util.Scanner;

public class MinElemmentInArray
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        if (n <= 0) 
        {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < minElement) 
            {
                minElement = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + minElement);
    }
}