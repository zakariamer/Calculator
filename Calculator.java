import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter two whole numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
    }

}