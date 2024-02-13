import java.util.Scanner;
public class calc_java {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение, например 2 + 3:");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }
    private static String calc(String input) throws Exception {
        input = input.replaceAll("\\s+", ""); // Удаляем все пробелы из ввода
        String[] elements = input.split("[\\+\\-\\*]"); // Разделяем строку по операторам
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[1]);
        char operator = input.charAt(elements[0].length()); // Оператор находится между числами
        if (elements.length > 2) {
            try {
                throw new Exception("размер массива больше 3");
            } catch (Exception e) {
                System.err.println("ошибка - " + e.getMessage());
                System.exit(0);
            }
        }
        if (num1 > 10) {
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num1 < 1) {
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num2 > 10) {
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num2 < 1) {
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
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
