import java.util.Scanner;
public class SumUntil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double num;
        System.out.println("Enter numbers (0 to stop):");
        while ((num = scanner.nextDouble()) != 0) {
            total += num;
        }
        System.out.println("Total sum: " + total);
    }
}
