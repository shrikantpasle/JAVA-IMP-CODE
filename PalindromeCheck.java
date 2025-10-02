import java.util.Scanner;

class PalindromeCheck
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String originalStr = sc.nextLine();

    String cleanStr = originalStr.replaceAll("\\s+", "").toLowerCase();
    String reversedStr = new StringBuilder(cleanStr).reverse().toString();

    if (cleanStr.equals(reversedStr))
    {
      System.out.println("\"" + originalStr + "\" is a palindrome.");
    }
    else
    {
      System.out.println("\"" + originalStr + "\" is not a palindrome.");
    }
  }
}