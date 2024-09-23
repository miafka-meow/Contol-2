import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int n = input.length();
        if (n == 0) {
            System.out.println("Длина наибольшей возрастающей подпоследовательности: 0");
            return;
        }

        // Массив для хранения длины возрастающей подпоследовательности
        int[] dp = new int[n];
        dp[0] = 1; // Длина первой подпоследовательности всегда 1

        // Заполнение массива dp
        for (int i = 1; i < n; i++) {
            dp[i] = 1; // Каждый символ сам по себе является возрастающей подпоследовательностью
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) > input.charAt(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Находим максимальную длину
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        System.out.println("Длина наибольшей возрастающей подпоследовательности: " + maxLength);
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        // Регулярное выражение для проверки формата десятичного числа
        String regex = "^[+-]?\\d*\\.\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Разделяем строку на целую и дробную части
            String[] parts = input.split("\\.");
            int itLength = parts[0].length() > 0 ? parts[0].length() : 0; // длина целой части
            int flLength = parts[1].length(); // длина дробной части

            // Выводим результаты
            System.out.println("Количество знаков в целой части: " + irLength);
            System.out.println("Количество знаков в дробной части: " + flLength);
        } else {
            System.out.println("Введенная строка не является десятичным числом.");
        }
    }
}

