package calculate;

public class Calculator {
    int a, b, ans;
    char symbol;

    void addition( int a, int b){
        ans = a+b;
        System.out.println("Addition of " + a + "and"+ b + "is: " + ans);
    }
    void subtraction( int a, int b){
        ans = a-b;
        System.out.println("Subtraction of " + a + "and"+ b + "is: " + ans);
    }
    void division(int a, int b){
        ans = a/b;
        System.out.println("Division of " + a + "and"+ b + "is: " + ans);
    }
    public void multiplication (int a, int b){
        ans = a*b;
        System.out.println("Multiplication of " + a + "and"+ b + "is: " + ans);
    }
    void calculateResult(int a, int b, char symbol){
        switch( symbol){
            case '+':
                addition(a,b);
                break;
            case'-':
                subtraction(a,b);
                break;
            case '/':
                division(a,b);
                break;
            case'*':
                multiplication(a,b);
                break;
            default:
                System.out.println("Please enter valid input");
        }
    }
}

