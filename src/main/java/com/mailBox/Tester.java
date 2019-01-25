package com.mailBox;

import java.util.*;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 for exit.");
        while (true) {
            //使用者輸入他想寄送物件的長寬高，不需要依照大小輸入
            System.out.print("\nPlease enter object's length: ");
            float length = scanner.nextFloat();
            if (length == -1) break;
            System.out.print("Please enter object's width: ");
            float width = scanner.nextFloat();
            if (width == -1) break;
            System.out.print("Please enter object's height: ");
            int height = scanner.nextInt();
            if (height == -1) break;
            //新增Box3和Box5的物件
            Box3MailBox box3 = new Box3MailBox();
            boolean validateBox3 = box3.validate(length, width, height);
            Box5MailBox box5 = new Box5MailBox();
            boolean validateBox5 = box5.validate(length, width, height);
            //若Box3符合大小，即使用Box3
            if (validateBox3) {
                System.out.println("Box3");
            } else if (validateBox5) {
                System.out.println("Box5");
            } else {
                System.out.println("It isn't suitable box for you.");
            }
        }
    }
}
