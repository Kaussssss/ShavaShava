import java.util.Scanner;
public class CheckNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        if(number>0){
            System.out.print("Positive");
        }
        else if(number<0){
            System.out.print("Negative");
        }
        else{
            System.out.print("Zero");
        }
    }
}
