import java.util.Scanner;
public class test_calc {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите арифметическое выражение, например 2 + 3:");
            String input = scanner.nextLine();

            String result = calc(input);
            System.out.println("Результат: " + result);
        }
        public static String calc(String input) {
            String[] elements = input.split(" ");

            double num1 = Double.parseDouble(elements[0]);
            double num2 = Double.parseDouble(elements[2]);
            String operator = elements[1];
            double result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        return "Ошибка: деление на ноль!";
                    }
                    break;
                default:
                    return "Ошибка: неверный оператор!";
            }
            return String.valueOf(result);
        }
    }
}
