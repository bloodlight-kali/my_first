import java.util.Scanner;
public class test {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int number1 = get();
        int number2 = get();
        char operation = getoperation();
        int result = calc(number1, number2, operation);
        System.out.println("результат");
        System.out.println(result);
    }
    public  static int get(){
        System.out.println("введите число");
        int number;
        number = scanner.nextInt();
        return number;
    }
    public static char getoperation(){
        char operation;
        System.out.println("выберете операцию");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getoperation();
        }
        return operation;
    }
    public static int calc(int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;
            case '*':
                result = number1*number2;
                break;
            case '/':
                result = number1/number2;
                break;
            default:
                System.out.println("не распознано");
                result = calc(number1, number2, getoperation());
        }
        return result;
    }
}

