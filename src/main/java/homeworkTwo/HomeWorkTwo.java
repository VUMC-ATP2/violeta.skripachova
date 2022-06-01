package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

// 1 uzdevums
        int x = 7;
        System.out.println(x > 0); // a
        System.out.println(x < 0); // b
        System.out.println(x > 5 && x <= 10); // c
        System.out.println(!(x <= 5) && x < 10); // d
        System.out.println(x == 0 || x == 10); // e
        System.out.println(x * x > 10); // f

// 2 uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1-12!");
        int inputResult = scanner.nextInt();
        switch (inputResult) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May-yay");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October - beerfest coming");
                break;
            case 11:
                System.out.println("November - festive soon");
                break;
            case 12:
                System.out.println("December - the very last moment");
                break;
            default:
                System.out.println("Incorrect number of month");
        }

// 3 uzdevums
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.printf("The biggest number is %d!\n", a);
        } else if (b > a && b >c) {
            System.out.printf("The biggest number is %d!\n", b);
        } else if (c > a && c > b) {
            System.out.printf("The biggest number is %d!\n", c);
        } else if (a == b || b == c) {
            System.out.println("All numbers are equal, try again!");
        }else {
            System.out.println("Something went wrong, try again");
        }

// 4. uzdevums
        System.out.println("The traffic light color is ... (Red / Yellow / Green)");
        String trafficLight = scanner.next();
        switch (trafficLight){
            case "Red":
                System.out.println("STOP! Wait for green!");
                break;
            case "Yellow":
                System.out.println("Ready, steady..");
                break;
            case "Green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Please look up to the sign & be careful");
        }

        System.out.println("The traffic light color is ... (Red / Yellow / Green)");
        String trafficLight2 = scanner.next();

        if (trafficLight2.equals("Red") || trafficLight2.equals("red")){
            System.out.println("STOP! Wait for green!");
        } else if (trafficLight2.equals("Yellow") || trafficLight2.equals("yellow")) {
            System.out.println("Ready, steady .. but wait for green!");
        } else if (trafficLight2.equals("Green!") || trafficLight2.equals("green")) {
            System.out.println("Go...");
        }else {
            System.out.println("Please look up to the sign & be careful!");
        }

//5 uzdevums
        String name = "Petr";
        String surname = "Petrov";
        String phoneNumber = "+7 9878 787878789";
        int yearOfBirth = 1976;
        printBusinessCard(name, surname, phoneNumber, yearOfBirth);

        String name2 = "Mia";
        String surname2 = "Pupina";
        String phoneNumber2 = "+371 99999999";
        int yearOfBirth2 = 1999;
        printBusinessCard(name2, surname2, phoneNumber2, yearOfBirth2);

        String name3 = "Eltons";
        String surname3 = "Dzons";
        String phoneNumber3 = "only eltonjohn@umgstores.com";
        int yearOfBirth3 = 1947;
        printBusinessCard(name3, surname3, phoneNumber3, yearOfBirth3);

// 6 uzdevums
        printBusinessCardTwo("Anna", "Liepa", "+371 12341234", 1980);
        printBusinessCardTwo("Jugina", "Kamkaite", "+370 87654321", 1960);

// 7 uzdevums
        int summa = sum(10, 15);
        System.out.println("The sum of two is: " + summa);

// 8 uzdevums
        double averageNumber = average(25, 5, 13);
        System.out.println("The average of three is: " + averageNumber);

    }

    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.printf(" Business Card\n ##########\n Name: %s\n Surname: %s\n Mobile number: %s\n Year of birth: %d\n ##########\n", name, surname, phoneNumber, yearOfBirth);
    }

    public static void printBusinessCard(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.printf(" Business Card\n ##########\n Name: %s\n Surname: %s\n Mobile number: %s\n Year of birth: %d\n ##########\n", name, surname, phoneNumber, yearOfBirth);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}