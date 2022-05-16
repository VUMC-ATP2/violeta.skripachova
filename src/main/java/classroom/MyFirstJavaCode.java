package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        // One line comment

        /*
        Multi line comment
        is a perfect approach
        how to write a lot of comment
         */

        // byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);
        // %d - numbers
        // $s - text/string
        // %b - boolean
        // \n - print next line

        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1000);

        System.out.printf("Average salary for Junior AQ Engineer is: %d\n", salaryInEur);

        int chinaPopulation = 1449687399;
        long currentWorldPopulation = 794609700;
        System.out.printf("Current world population: %d people. In meanwhile China population: %d people\n", currentWorldPopulation, chinaPopulation);

    // Floating numbers
        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        // Primitive text (char)
        char firstLettersOfMyName = 'V';

        // Non-primitive String
        String myName = "Violeta";
        System.out.println(myName);

        String mySentence = "Hello, my name is Violeta. I am 30 years old.";
        String mySecondSentence = "I live in Riga";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + " " + mySecondSentence);
        System.out.printf("%s $s/n", mySentence, mySecondSentence);

        // boolean
        // is / has
        // isSummer , hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if (isSummer){
            System.out.println("Yes, it is summer");
        } else {
            System.out.println("No, it is not suumer");
        }

        // Arithmetic operators + - / *
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        System.out.println(7 + 7); //14
        System.out.println("7" + 7); // 77
        System.out.println("7" + "7"); // 77

        boolean isAGreaterThanB = a > b; // 10 > 20
        boolean isASmallerThanB = a < b; // 10 < 20

        boolean isTrue = a != b;
        System.out.println(isTrue);



    }
}
