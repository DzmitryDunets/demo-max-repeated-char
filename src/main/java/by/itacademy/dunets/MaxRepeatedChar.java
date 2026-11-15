package by.itacademy.dunets;

import java.util.Scanner;

public class MaxRepeatedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String checked = "";
        int maxRepeatedCount = 0;
        String maxRepeatedChars = "";
        boolean hasRepeatedChars = false;

        for (int i = 0; i < text.length(); i++) {
            if (checked.indexOf(text.charAt(i)) == -1) {
                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j)) {
                        count++;
                    }
                }

                if (count == maxRepeatedCount) {
                    maxRepeatedChars += text.charAt(i);
                }

                if (count != 1 && count > maxRepeatedCount) {
                    hasRepeatedChars = true;
                    maxRepeatedCount = count;
                    maxRepeatedChars = String.valueOf((text.charAt(i)));
                }

                checked += text.charAt(i);
            }
        }
        if (!hasRepeatedChars) {
            System.out.println("Повторений нет!");
            return;
        }

        System.out.println("Повторений: " + maxRepeatedCount);
        if (maxRepeatedChars.length() > 1) {
            System.out.print("Символы: ");
            for (int i = 0; i < maxRepeatedChars.length(); i++) {
                if (i == maxRepeatedChars.length() - 1) {
                    System.out.println(maxRepeatedChars.charAt(i));
                } else {
                    System.out.print(maxRepeatedChars.charAt(i) + ", ");
                }
            }
        } else {
            System.out.println("Символ: " + maxRepeatedChars);
        }
    }
}
