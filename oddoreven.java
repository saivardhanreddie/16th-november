import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {

        System.out.println("Enter the Number Which you want to check it's even or odd :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEvenOdd(num);
    }

    public static int checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(" number is Even");
        } else {
            System.out.println(" number is odd");
        }
        return num;
    }

}
