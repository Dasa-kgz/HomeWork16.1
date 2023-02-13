public class Rectangle extends Shapes {
    private double length;

    private double width;

    public Rectangle(double length, double width) {

        this.length = length;

        this.width = width;

    }

    @Override

    public void findArea() {

        double area = length * width;

        System.out.println("The area of the rectangle is " + area);

    }
}
