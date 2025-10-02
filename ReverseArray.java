import java.util.Scanner;
import java.util.Arrays;

class ReverseArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++)
    {
      arr[i] = sc.nextInt();
    }

    int start = 0;
    int end = arr.length - 1;

    while (start < end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

    System.out.println("Reversed array: " + Arrays.toString(arr));
  }
}