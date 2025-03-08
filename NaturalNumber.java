import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter one number : ");
        int number = scanner.nextInt();
        if( number >= 0 && number == (int)number){
            for(int i = 1; i<=number ;i++){
                sum = sum + i;
            }
            System.out.print("The sum of " + number + " natural numbers is => " + sum +"\n");
        }
        else{
            System.out.print("The number" + number + " is not a natural number");
        }
    }
}
