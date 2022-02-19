import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        // returns the color
        return color;
    }

    public void setColor(String color){
        // sets a new color
        this.color = color;
    }

    public boolean isFilled(){
        // returns the filled property
        return filled;
    }

    public void setFilled(boolean filled){
        // sets a new filled property
        this.filled = filled;
    }

    public Date getDateCreated(){
        // returns the dateCreated
        Date dateCreated = new Date();
        return dateCreated;
    }

    public String toString(){
        String details = "created on " + getDateCreated() + "\ncolor: " + color + " and filled: " + filled;
        return details;
    }
}
