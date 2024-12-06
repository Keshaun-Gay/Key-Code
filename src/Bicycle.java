//Keshaun Gay

public class Bicycle {
    private String make;
    private Wheel frontWheel;
    private Wheel backWheel;
    private Frame frame;
    
    // Default constructor
    public Bicycle() {
        this.make = "none";  
        // Default make
        this.frontWheel = new Wheel(); 
        // Default Wheel
        this.backWheel = new Wheel();  
        // Default Wheel
        this.frame = new Frame();      
        // Default Frame
    }

    
    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        setMake(make);          
        // Set valid make or default
        setFrontWheel(frontWheel);  
        // Set valid front wheel or default
        setBackWheel(backWheel);    
        // Set valid back wheel or default
        setFrame(frame);            
        // Set valid frame or default
    }

    //Return methods
    public String getMake() {
        return make;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() {
        return frame;
    } 

   
    public void setMake(String make) {
        if (make != null && !make.isEmpty()) {
            this.make = make;
        } else {
            this.make = "none";  
            // Default if invalid
        }
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = (frontWheel != null) ? frontWheel : new Wheel();  
        // Default if null
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = (backWheel != null) ? backWheel : new Wheel();  
        // Default if null
    }

    public void setFrame(Frame frame) {
        this.frame = (frame != null) ? frame : new Frame();  
         // Default if null
    }

    // Equals method
    public boolean equals(Bicycle other) {
        return this.make.equalsIgnoreCase(other.make) &&
               this.frontWheel.equals(other.frontWheel) &&
               this.backWheel.equals(other.backWheel) &&
               this.frame.equals(other.frame);
    }

   
    public String toString() {
        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel.toString() +
               " Back Wheel: " + backWheel.toString() + " Frame: " + frame.toString();
    }
}
