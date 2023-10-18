package AD221.Smirnov;

import java.util.Scanner;

public class StringManipulation
{

    // Метод, який перевіряє, чи рядок закінчується на "ed"
    public static boolean endsWithEd(String str)
    {
        return str.endsWith("ed");
    }

    // Метод, який знаходить суму цифр у рядку
    public static int sumOfDigits(String str)
    {
        int sum = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                // Знаходимо цифри в рядку та обчислюємо їх суму
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    // Метод, який знаходить довжину найдовшого блоку символів у рядку
    public static int longestBlockLength(String str)
    {
        int maxBlockLength = 0;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1))
            {
                // Знаходимо найдовший блок символів у рядку
                currentBlockLength++;
            } else {
                if (currentBlockLength > maxBlockLength)
                {
                    maxBlockLength = currentBlockLength;
                }
                currentBlockLength = 1;
            }
        }

        if (currentBlockLength > maxBlockLength)
        {
            maxBlockLength = currentBlockLength;
        }

        return maxBlockLength;
    }

    // Метод, який виводить слова із рядку, розділені пробілами
    public static void printWords(String str)
    {
        String[] words = str.split(" ");

        for (String word : words)
        {
            // Виводимо слова у рядку, розділені пробілами
            System.out.println(word);
        }
    }

    // Метод, який складає рядки A та B по черзі
    public static String interleaveStrings(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < a.length() || j < b.length())
        {
            if (i < a.length()) {
                result.append(a.charAt(i));
                i++;
            }
            if (j < b.length()) {
                result.append(b.charAt(j));
                j++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок для перевірки на 'ed': ");
        String str1 = scanner.nextLine();
        System.out.println("1. Рядок закінчується на 'ed'? " + endsWithEd(str1));

        System.out.print("Введіть рядок для обчислення суми цифр: ");
        String str2 = scanner.nextLine();
        System.out.println("2. Сума цифр у рядку: " + sumOfDigits(str2));

        System.out.print("Введіть рядок для знаходження найдовшого блоку: ");
        String str3 = scanner.nextLine();
        System.out.println("3. Довжина найдовшого блоку: " + longestBlockLength(str3));

        System.out.print("Введіть рядок для виведення слів: ");
        String str4 = scanner.nextLine();
        System.out.println("4. Виведення слів у рядку:");
        printWords(str4);

        System.out.print("Введіть перший рядок для складання: ");
        String str5 = scanner.nextLine();
        System.out.print("Введіть другий рядок для складання: ");
        String str6 = scanner.nextLine();
        System.out.println("5. Результат складання рядків: " + interleaveStrings(str5, str6));

        scanner.close();
    }
}

