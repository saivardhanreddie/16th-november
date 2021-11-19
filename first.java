import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        long number = sc.nextLong();
        long count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("The digits in entered Number is :- " + count);
        System.out.println();
    }
}