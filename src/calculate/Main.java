package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    static char userAns;

        public static void main(String[] args) {

            Main obj = new Main();

            do {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter first number: ");
                obj.a = reader.nextInt();
                System.out.println(" Enter second number :");
                obj.b = reader.nextInt();
                System.out.println(" Please enter one of symbol =, -, *, / :");
                obj.symbol = reader.next().charAt(0);
                obj.calculateResult(obj.a, obj.b, obj.symbol);
                System.out.println("Would you like to do more calculation Please enter :  Y or N");
                userAns = reader.next().toLowerCase().charAt(0);

            } while (userAns == 'y');
        }
    }





