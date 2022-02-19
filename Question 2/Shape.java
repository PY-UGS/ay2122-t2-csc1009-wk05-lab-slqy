public abstract class Shape {

    private double dim1;
    private double dim2;
    private double PI;

    public Shape(){
        this.PI = Math.PI;
    }

    public double getDim1(){
        // returns the dim1 of the shape
        return dim1;
    }

    public void setDim1(double dim1){
        // sets a new dim1 of the shape
        this.dim1 = dim1;
    }

    public double getDim2(){
        // returns the dim2 of the shape
        return dim2;
    }

    public void setDim2(double dim2){
        // sets a new dim2 of the shape
        this.dim2 = dim2;
    }

    public double getPI(){
        // returns the PI of the shape
        return PI;
    }

    public void setPI(double PI){
        // sets a new dim2 of the shape
        this.PI = PI;
    }

    public abstract double area();
}
