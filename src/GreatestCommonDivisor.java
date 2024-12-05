import java.util.Scanner;

public class GreatestCommonDivisor {

    static int gcd(int a, int b) {
        if(a % b != 0)
            return gcd(b, a % b);
        return b;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        sc.close();

        System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd(n1, n2) );

    }
}
