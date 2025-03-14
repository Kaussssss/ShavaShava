import java.util.Scanner;
public class CountdownLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int countdown = scanner.nextInt();
        for (int i = countdown; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
