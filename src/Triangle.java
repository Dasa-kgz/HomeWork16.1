public class Triangle extends Shapes{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void findArea() {
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area);
    }

}
