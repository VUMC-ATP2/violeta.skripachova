package classroom;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Before check");

        // will execute 10 line if conditions is true (only)!
        if (20>18) {
            System.out.println("Yes, 20 > 18");
        }

        System.out.println("After check");

        // age "if"
        int age = 18;

        if (age >= 18){
            System.out.println("You can vote!");
        }
        System.out.println("You can go home!");

        // if-else

        int currentHours = 19;
        if (currentHours < 18){
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        int i = 20;
        if (i < 15) {
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greather than 15");
        }
        System.out.println("outside if-else block");

        String vumc = "LU";
        if (vumc == "LUs") {
            System.out.println("VUMC is same as LU");
        } else {
            System.out.println("VUMC is not the same as LU");
        }

        // if - else if -else
        // found first true and not going further / if no true - print last else
        int number = -1;
        if (number > 0) {
            System.out.println("Number is greather ");
        } else if (number == 0) {
            System.out.println( "Number is equal to 0");
        } else {
            System.out.println("Number is less then 2 and not equal to 0");
        }

        // switch
        //break - obligatory to close case
       // default - will be used if case is not correct

        String animal = "Cat";

        switch (animal) {
            case "Dog":
                System.out.println("You have a dog!");
                break;
            case "Cat":
                System.out.println("You have a cat!");
                break;
            default:
                System.out.println("I dont know about animal you have");
        }

        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Incorrect day of week!");

        }

        String month;
/*
        var result: String = switch (month) {
            case "December", "January", "February" -> "winter";
            case "June", "July", "August" -> "summer";
            default -> "Don't know";
        }:
        System.out.printf("%s this is $s", month, result);
*/
    }
}
