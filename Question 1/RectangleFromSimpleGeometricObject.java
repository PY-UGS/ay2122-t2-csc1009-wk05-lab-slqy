public class RectangleFromSimpleGeometricObject extends GeometricObject {

    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(){

    }

    public RectangleFromSimpleGeometricObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth(){
        // returns the width
        return width;
    }

    public void setWidth(double width){
        // sets a new width
        this.width = width;
    }

    public double getHeight(){
        // returns the height
        return height;
    }

    public void setHeight(double height){
        // sets a new height
        this.height = height;
    }

    public double getArea(){
        // returns the area of the rectangle
        double area = width * height;
        return area;
    }

    public double getPerimeter(){
        // returns the perimeter of the rectangle
        double perimeter = (2 * width) + (2 * height);
        return perimeter;
    }
}
