import java.util.Scanner;
public class FirstIsSmall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int Num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int Num2 = scanner.nextInt();
        System.out.print("Enter number 3 : ");
        int Num3 = scanner.nextInt();
        if(Num1>Num2 && Num1>Num3){
            System.out.print("Is the first number the smallest? True");
        }
        else{
            System.out.print("Is the first number the smallest? False");
        }

    }
}
