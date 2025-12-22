// College Management System
// Menu-driven Java program using if-else, Scanner, and basic validation

import java.util.Scanner;

public class CollegeManagement {

    static Scanner sc = new Scanner(System.in);

    
    static int regNo;
    static String name;
    static String password;
    static int marks;
    static char grade;


    static boolean isRegistered = false;
    static boolean isMarksEntered = false;
    static boolean isGradCal = false;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Register Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. View Result");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                if (isRegistered) {
                    System.out.println("Student already registered.");
                } else {
                    System.out.print("Enter Registration Number: ");
                    regNo = sc.nextInt();

                    System.out.print("Enter Student Name: ");
                    name = sc.next();

                    System.out.print("Set Password: ");
                    password = sc.next();

                    isRegistered = true;
                    System.out.println("Student registered successfully.");
                }

            } else if (choice == 2) {

                if (!isRegistered) {
                    System.out.println("Please register student first.");
                }
                    else {

                    System.out.print("Enter Marks (0 - 100): ");
                    marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks.");
                    } else {
                        isMarksEntered = true;
                        System.out.println("Marks entered successfully.");
                    }
                }

            } else if (choice == 3) {

                if (!isMarksEntered) {
                    System.out.println("Please enter marks first.");
                }else if (isGradCal){
                       System.out.println("grade already calculated");
                    }
                     else {
                      isGradCal  = true;
                    if (marks >= 90) {
                        grade = 'A';
                    } else if (marks >= 75) {
                        grade = 'B';
                    } else if (marks >= 50) {
                        grade = 'C';
                    } else {
                        grade = 'F';
                    }
                    System.out.println("Grade calculated successfully.");
                }

            } else if (choice == 4) {

                if (!isRegistered) {
                    System.out.println("No student registered.");
                }
                    else {
                    System.out.print("Enter password to view result: ");
                    String inputPass = sc.next();

                    if (inputPass.equals(password)) {

                        System.out.println("\n--- Student Result ---");
                        System.out.println("Reg No : " + regNo);
                        System.out.println("Name   : " + name);
                        System.out.println("Marks  : " + marks);
                        System.out.println("Grade  : " + grade);
                    } else {
                        System.out.println("Incorrect password.");
                    }
                }

            } else if (choice == 5) {

                System.out.println("Exiting system...");

            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
