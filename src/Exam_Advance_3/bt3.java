package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU****************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn 1, 2, hoặc 3: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên phụ huynh :");
                    input = scanner.nextLine();
                    queue.offer(input);
                    break;
                case 2:
                    String poll = queue.poll();

                    if(poll!= null){
                        System.out.println("phụ huynh tiếp theo là:");
                        System.out.println(poll);
                    } else {
                        System.out.println("không có phụ huynh nào trong hàng đợi");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}
