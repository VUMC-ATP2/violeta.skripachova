package classroom;

public class Operators {
    public static void main(String[] args) {
        // Equal to ==
        int a = 10;
        int b = 5;
        System.out.println(a == b); // false

        // Not equal to !=
        int c = 5;
        int d = 4;
        System.out.println(c != d); // true

        // Less than <
        a = 30;
        b = 20;
        System.out.println(a < b); // false

        // Greater than >
        c = 40;
        d = 50;
        System.out.println(c > d); // false

        boolean result = 40 < 20;
        System.out.println(result);
        // false

        // Less than or equal to <=

        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        // Greater than or equal to >=
        a = 200;
        b = 100;
        System.out.println(b >= a);

        // String comparison
        String name = "Violeta";
        String name2 = "Violeta";
        System.out.println(name == name2);
        System.out.println(name.equals(name2)); //better to use with string
        //true

        // Logical operators
        // &&
        int x = 10;
        result = x <5 && x < 10;
        // 10 < 5 (false)
        // 10 < 10 (false)
        System.out.println(result);

        result = 3 < 5 && 4 < 5;
        System.out.println(result);
        //true
        // will be true only if both parts are true

        // ||
        result = 3 < 5 || 4 > 5;
        System.out.println(result);
        // true
        // will be true if one of issues will be true

        //
        a = 10;
        b = 20;
        result = (a > b); // false
        result = !(a > b); // true
        System.out.println(result);
        result = !(a < b); // false
        System.out.println(result);



    }
}
