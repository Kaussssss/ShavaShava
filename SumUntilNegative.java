import java.util.Scanner;
public class SumUntilNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double num;
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            num = scanner.nextDouble();
            if (num <= 0) break;
            total += num;
        System.out.println("Total sum: " + total);
        }
    }
}
