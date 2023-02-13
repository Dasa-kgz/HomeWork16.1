class Circle extends Shapes {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;

    }

    @Override

    public void findArea() {

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is " + area);

    }
}
