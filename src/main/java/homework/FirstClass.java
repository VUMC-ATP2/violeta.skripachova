package homework;

public class FirstClass {
    public static void main(String[] args) {

        // Story about Spain
        String countryName = "Spain";
        int countryPopulation = 47450795;
        int countryAreaInSqKm = 505990;
        String countryCapital = "Madrid";
        String countryOfficialLanguage = "Spanish";
        boolean countryInEu = true;
        char countryCurrency = '€';
        System.out.println("Today we will talk about" + " " + countryName + " or Kingdom of Spain.");
        System.out.printf(countryName + " is the largest country in Southern Europe." + " Area is" + " " + countryAreaInSqKm + "km2 and it makes " + countryName + " the second-largest country in Western Europe.\n");
        System.out.printf(countryName + " is on 30th place in the World population list.\n"
                + countryName + " has the total population of " + countryPopulation + " people. It is less, than in Italy, but more than in Canada!\n"
                + countryName + "'s capital and the largest city is " + countryCapital + " and it is most populous city in " + countryName + ".\n" +
                countryCapital + " is the second-largest city in the European Union.\n" +
                "Yes, you read it correctly. " + countryName + " is a part of EU for a lot of year ." + " It is " + countryInEu + "!\n"
                + " Additionally, " + countryName + " is a part of Euro-zone countries with official currency is Euro %c.\n" +
                "The joke, that Spanish people talking only on %s is not a joke. They are in love with their language.\n" +
                "And we are in love with Spain!\n", countryCurrency, countryOfficialLanguage);

//Arithmetic operators + - / *
        byte a = 2;
        int b = 20;
        int c = a + b;
        short d = 40;
        byte e = -2;
        double f = 1.5;

// +
        System.out.println(a + b);
        System.out.println(c + d + e);
        System.out.println(a + b + c + d + e + f);

// -
        System.out.println(a - b);
        System.out.println(c - 40);
        System.out.println(d - c);

// /
        System.out.println(d / e);
        System.out.println(d / c);
        System.out.println(c / f / 2);

// *
        System.out.println(c * 2 * f);
        System.out.println(d * b);
        System.out.println(a * b * f / 2);

    }

}
