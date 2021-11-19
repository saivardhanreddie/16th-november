import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        char ch;
        do {
            System.out.println("Enter a number which you wants to calculate the factorial :- ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int fact = 1;
            for (int i = x; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println(" factorial of a given number : " + fact);
            System.out.println("Do you want to continue ?(y/n) ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        {
        }
        System.out.println();
    }
}