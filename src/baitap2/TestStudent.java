package baitap2;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st = new Student();
        System.out.println(st.setName());

        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }

    }
}
