class Circle {
    private double radius;
    // setter method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // getter method to get the radius
    public double getRadius() {
        return radius;
    }
    // method to calculate and return area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // method to calculate and return circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class getterandsetterexp {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.0); // setting radius using setter
        System.out.println("Radius of Circle: " + c1.getRadius());
        System.out.println("Area of Circle: " + c1.getArea());
        System.out.println("Circumference of Circle: " + c1.getCircumference());
    }
}

