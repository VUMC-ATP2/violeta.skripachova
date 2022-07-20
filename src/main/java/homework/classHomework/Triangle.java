package homework.classHomework;

//a
public class Triangle {
    int a;
    int b;
    int c;
    double s;

    //b
    public void newTriangle() {
        System.out.println("=== === ===");
        System.out.println("This is new Triangle!");
        System.out.println("=== === ===");
    }

    //c
    public void triangleArea(int a, int b, int c) {
        double p;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.s = s;
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Area of this triangle is " + s);
    }

    //d
    public boolean isTriangleRegular() {
        boolean isRegular;
        if (a == b && b == c) {
            System.out.println("This is regular triangle!");
            isRegular = true;
        } else {
            System.out.println("Not regular triangle!");
            isRegular = false;
        }
        return isRegular;
    }

    //e
    public boolean isTriangleIsosceles() {
        boolean isIsosceles;
        if (a == b || b == c || a == b) {
            System.out.println("An isosceles triangle!");
            isIsosceles = true;
        } else {
            System.out.println("Not isosceles triangle!");
            isIsosceles = false;
        }
        return isIsosceles;
    }


}
