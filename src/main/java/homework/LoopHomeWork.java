package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        // 1 uzdevums
        System.out.println("*****");
        System.out.println("Welcome to the game *catch the 100!*");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (sum < 100) {
            sum = sum + num;
            if (sum > 100) {
                System.out.println("Done!");
                System.out.println("The sum is " + sum + "!" + " And it is bigger than 100!");
                System.out.println("*****");
                break;
            } else if (sum == 100) {
                System.out.println("Boom, you caught the 100, try again!");
                System.out.println("*** ***");
            } else {
                System.out.println("Please enter the number");
                num = scanner.nextInt();
            }
        }


        Scanner scannerTwo = new Scanner(System.in);
        int numberTwo = 0;
        int sumTwo = 0;
        while (sumTwo < 100) {
            System.out.println("Please enter number!");
            numberTwo = scanner.nextInt();
            sumTwo = sumTwo + numberTwo;
        }
        System.out.println("Boom, ready!");
        System.out.println("The sum is " + sumTwo + " and it is bigger than 100!");


// 2 uzdevums
        System.out.println("** ** **");
        System.out.println("Please enter number!");
        int enteredNumber;
        Scanner primeScanner = new Scanner(System.in);
        enteredNumber = primeScanner.nextInt();
        while (enteredNumber % 2 == 0 && enteredNumber > 2 || enteredNumber < 2) {
            System.out.println(enteredNumber + " - is not prime number!");
            System.out.println("Please enter next number..");
            enteredNumber = primeScanner.nextInt();
        }
        if (enteredNumber % 1 == 0 && enteredNumber % enteredNumber == 0 && enteredNumber >= 2) {
            System.out.println(enteredNumber + " - is prime number!");
        }

// 3 uzdevums
        int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] monthName = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        char[] monthInitial = {'J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'};

// while
        int number = 0;
        while (number < monthNumber.length) {
            System.out.print(monthNumber[number] + " ");
            number++;
        }
        System.out.println("");

        int name = 0;
        while (name < monthName.length) {
            System.out.print(monthName[name] + ", ");
            name++;
        }
        System.out.println("");

        int initial = 0;
        while (initial < monthInitial.length) {
            System.out.print(monthInitial[initial] + ", ");
            initial++;
        }
        System.out.println("");

// do while
        number = 1;
        do {
            System.out.print(number + ", ");
            number++;
        } while (number <= 6);
        System.out.println("");

        name = 0;
        do {
            System.out.print(monthName[name] + ", ");
            name++;
        } while (name <= 5);
        System.out.println("");

        initial = 0;
        do {
            System.out.print(monthInitial[initial] + ", ");
            initial++;
        } while (initial <= 5);
        System.out.println("");

// for loop
        for (number = 6; number <= 11; number++) {
            System.out.print(monthNumber[number] + ", ");
        }
        System.out.println("");

        for (name = 6; name <= 11; name++) {
            System.out.print(monthName[name] + ", ");
        }
        System.out.println("");

        for (initial = 6; initial <= 11; initial++) {
            System.out.print(monthInitial[initial] + ", ");
        }
        System.out.println("");

// for each
        for (int numbers : monthNumber) {
            System.out.print(numbers + ", ");
        }
        System.out.println("");

        for (String names : monthName) {
            System.out.print(names + ", ");
        }
        System.out.println("");

        for (char initials : monthInitial) {
            System.out.print(initials + ", ");
        }
        System.out.println("");

// 4 uzdevums
        int[] evenNumbers = new int[100];
        for (int a = 0; a <= evenNumbers.length; a++) {
            if (a % 2 == 0) {
                System.out.print(a + ",");
            }
        }
        System.out.println("");

// 5 uzdevums
        System.out.println("*** *** ***");
        System.out.println("Enter Your number:");
        int userNumber;
        int factorialNumber = 1;
        Scanner factorialScanner = new Scanner(System.in);
        userNumber = factorialScanner.nextInt();
        for (int b = 1; b <= userNumber; b++) {
            factorialNumber = factorialNumber * b;
        }
        System.out.println("Factorial is " + factorialNumber + "!");
        System.out.println("*** *** ***");

// 6 uzdevums
        System.out.println("Please enter your PIN:");
        final int correctPin = 1234;
        int enteredPin;
        int pinInput = 1;
        Scanner pinScanner = new Scanner(System.in);
        enteredPin = pinScanner.nextInt();
        while (enteredPin != correctPin && pinInput < 3) {
            System.out.println("Incorrect PIN!");
            System.out.println("Please try again...");
            enteredPin = pinScanner.nextInt();
            pinInput++;
        }
        if (enteredPin == correctPin) {
            System.out.println("Pin ok!");
            System.out.println("Welcome!");
        } else if (pinInput >= 3) {
            System.out.println("Boom - account blocked!");
            System.out.println("Please contact administrator.");
        }


    }
}
