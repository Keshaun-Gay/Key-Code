//Keshaun Gay

public class Frame {
    private double size;
    private String type;
    
    // Default constructor
    public Frame() {
        this.size = 18.5;       
        // Default size
        this.type = "Diamond";  
        // Default type
    }

    
    public Frame(double size, String type) {
        setSize(size);          
        // Set valid size or default
        setType(type);          
        // Set valid type or default
    }

    // Get size
    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    
    public void setSize(double size) {
        if (size >= 18.5 && size <= 60) {
            this.size = size;
        } else {
            this.size = 18.5; 
            // Default if invalid
        }
    }

    public void setType(String type) {
        if (type.equals("Diamond") || type.equals("Step-Through") || 
            type.equals("Truss") || type.equals("Penny-Farthing")) {
            this.type = type;
        } else {
            this.type = "Diamond"; 
            // Default if invalid
        }
    }

    // Equals method
    public boolean equals(Frame other) {
        return this.size == other.size && this.type.equalsIgnoreCase(other.type);
    }

    // toString method

    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
