package homework.classHomework;

public class Main {
    public static void main(String[] args) {

//a
        Triangle firstTriangle = new Triangle();
        firstTriangle.newTriangle();
        firstTriangle.a = 5;
        firstTriangle.b = 5;
        firstTriangle.c = 6;
        firstTriangle.triangleArea(5, 5, 6);
        firstTriangle.isTriangleIsosceles();
        firstTriangle.isTriangleRegular();

//b
        Triangle secondTriangle = new Triangle();
        secondTriangle.newTriangle();
        secondTriangle.triangleArea(10, 11, 10);
        secondTriangle.isTriangleRegular();
        secondTriangle.isTriangleIsosceles();

    }
}
