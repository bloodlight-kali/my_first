import java.util.Scanner;
public class test_calc {

        public static void main(String[] args) throws Exception{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите арифметическое выражение, например 2 + 3:");
            String input = scanner.nextLine();
            String result = calc(input);
            System.out.println("Результат: " + result);
        }
        private static String calc(String input) {
            String[] elements = input.split(" ");

            double num1 = Double.parseDouble(elements[0]);
            double num2 = Double.parseDouble(elements[2]);
            String operator = elements[1];
            if (num1 >9){
                return " Вы можете ввести только числа от 0 до 9 включительно";
            }
            if (num2 >9){
                return " Вы можете ввести только числа от 0 до 9 включительно";
            }
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
