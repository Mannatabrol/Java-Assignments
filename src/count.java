import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        s = s.toUpperCase(); // Convert the string to uppercase
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Total Number of Vowels = " + v);
        System.out.println("Total Number of Consonants = " + c);
    }
}
