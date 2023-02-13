public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,4);
        triangle.findArea();
        System.out.println("****************************************");

        Rectangle rectangle = new Rectangle(5,4);
        rectangle.findArea();
        System.out.println("****************************************");

        Circle circle = new Circle(1);
        circle.findArea();
        System.out.println("****************************************");

        Square square = new Square(5);
        square.findArea();


    }
}