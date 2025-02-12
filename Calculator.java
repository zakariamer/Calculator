import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter two whole numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("You wanna add, subtract, multiple, or divide? (1 = add | 2 = subtract | 3 = multiply | 4 = divide)");
        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }


    }

}