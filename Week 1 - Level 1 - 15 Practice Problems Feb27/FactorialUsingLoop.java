import java.util.Scanner;
public class FactorialUsingLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numFactorial = scanner.nextInt();
        if (numFactorial >= 0) {
            int fact = 1, i = 1;
            while (i <= numFactorial) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Enter a non-negative integer.");
        }

    }
}
