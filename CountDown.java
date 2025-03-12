import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 8: Countdown using while loop
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}
