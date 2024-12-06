//Keshaun Gay  

public class Wheel {
    private double diameter;
    private double width;
    
    // Default constructor
    public Wheel() {
        this.diameter = 16.0; 
        // Default diameter
        this.width = 1.0;     
        // Default width
    }
    
    
    public Wheel(double diameter, double width) {
        setDiameter(diameter); 
        // Set valid diameter or default
        setWidth(width);       
        // Set valid width or default
    }

   
    public double getDiameter() {
        return diameter;
    }

    public double getWidth() {
        return width;
    }
    //Sets diameter
    public void setDiameter(double diameter) {
        if (diameter >= 16 && diameter <= 55) {
            this.diameter = diameter;
        } else {
            this.diameter = 16.0; 
            // Default if invalid
        }
    }

    public void setWidth(double width) {
        if (width >= 1 && width <= 2.5) {
            this.width = width;
        } else {
            this.width = 1.0; 
             // Default if invalid
        }
    }

    public boolean equals(Wheel other) {
        return this.diameter == other.diameter && this.width == other.width;
    }

    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
