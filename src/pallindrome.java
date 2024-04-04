import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        String str, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println("The given string is not a palindrome");
        }
        sc.close(); // Closing the Scanner object to prevent resource leak
    }
}

