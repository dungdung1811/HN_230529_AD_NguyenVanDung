package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU****************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.print("Chọn 1, 2, hoặc 3: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Nhập câu:");
                       input = scanner.nextLine();
                    break;
                case 2:
                    if (input != null && !input.isEmpty()) {
                        String reversedSentence = reverseSentence(input);
                        System.out.println("Câu sau khi đảo ngược: " + reversedSentence);
                    } else {
                        System.out.println("Bạn chưa nhập câu. Hãy chọn 'Nhập câu' trước.");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
    private static String reverseSentence(String input) {
        String[] words = input.split(" ");
        Stack<String> wordStack = new Stack<>();
        for (String word : words) {
            wordStack.push(word);
        }
        StringBuilder reversedSentence = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversedSentence.append(wordStack.pop()).append(" ");
        }
        return reversedSentence.toString().trim();
    }

}
