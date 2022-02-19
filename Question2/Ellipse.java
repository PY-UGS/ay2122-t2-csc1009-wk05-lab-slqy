public class Ellipse extends Shape{

    public Ellipse(double len1, double len2){
        super.setDim1(len1);
        super.setDim2(len2);
    }

    public double area(){
        // returns the area of the rectangle
        double len1 = super.getDim1();
        double len2 = super.getDim2();
        double area = 3.14 * len1 * len2;
        return area;
    }
}
