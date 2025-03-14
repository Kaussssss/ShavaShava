import java.util.Scanner;
public class CheckDivisible {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = scanner.nextInt();
        if(input%5==0){
            System.out.print("Is the number " + input + " divisible by 5? True");
        }
        else{
            System.out.print("Is the number " + input + " divisible by 5? False");
        }

    }
}
