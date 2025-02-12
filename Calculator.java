import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter two whole numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("You wanna add or subtract? (1 = add | 2 = subtract)");
        int answer = scan.nextInt();

        if (answer == 1){
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 - num2);
        }


    }

}