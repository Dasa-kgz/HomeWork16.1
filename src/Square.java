class Square extends Shapes{
    private double sideLength;
    public Square(double sideLength){
        this.sideLength=sideLength;       }
    @Override
    public void findArea() {
        double area = Math.pow(sideLength, 2);
        System.out.println("The area of the square is " + area);
    }
}
