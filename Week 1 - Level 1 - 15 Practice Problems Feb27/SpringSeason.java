import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month : ");
        int month = scanner.nextInt();
        System.out.print("Enter Day : ");
        int day = scanner.nextInt();
        if(month>=3&&month<=6){
            if(month==3&&day<20){
                System.out.print("Its not a Spring Season");
            }
            else if(month==6&&day>20){
                System.out.print("Its not a Spring Season");
            }
            else if(day>31||day<0){
                System.out.print("Enter Valid date");
            }
            else{
                System.out.print("Its a Spring Season");

            }
        }
        else{
            System.out.print("Its not a Spring Season");
        }
    }
}
