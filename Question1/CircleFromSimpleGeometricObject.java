public class CircleFromSimpleGeometricObject extends GeometricObject {

    private double radius;      // the radius of the circle

    public CircleFromSimpleGeometricObject(){

    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius(){
        // returns the radius
        return radius;
    }

    public void setRadius(double radius){
        // sets a new radius
        this.radius = radius;
    }

    public double getArea(){
        // returns the area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter(){
        // returns the perimeter of the circle
        double perimeter = Math.PI * this.getDiameter();
        return perimeter;
    }

    public double getDiameter(){
        // returns the diameter of the circle
        double diameter = 2 * radius;
        return diameter;
    }

    public void printCircle(){

    }
}
