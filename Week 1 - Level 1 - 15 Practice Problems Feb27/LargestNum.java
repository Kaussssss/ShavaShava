import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int Num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int Num2 = scanner.nextInt();
        System.out.print("Enter number 3 : ");
        int Num3 = scanner.nextInt();
        if(Num1>Num2&&Num1>Num3){
            System.out.print("Is the first number the largest? True\n");
            System.out.print("Is the second number the largest? False\n");
            System.out.print("Is the third number the largest? False\n");
        }
        else if (Num2>Num1&&Num2>Num3) {
            System.out.print("Is the first number the largest? False\n");
            System.out.print("Is the second number the largest? True\n");
            System.out.print("Is the third number the largest? False\n");
        }
        else if(Num3>Num1&&Num3>Num2) {
            System.out.print("Is the first number the largest? False\n");
            System.out.print("Is the second number the largest? False\n");
            System.out.print("Is the third number the largest? True\n");
        }
    }
}
