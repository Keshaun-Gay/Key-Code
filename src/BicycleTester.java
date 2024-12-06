//Keshaun Gay

public class BicycleTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bicycle Builder Tester!");
        System.out.println("---------------------------------");
        
        //Creates a default bicycle
        System.out.println("First we will create a \"Default\" Bicycle");
        Bicycle defaultBicycle = new Bicycle();
        System.out.println("Printing the Bicycle's data");
        System.out.println("Bicycle's make: " + defaultBicycle.getMake());
        System.out.println("Bicycle's front wheel: " + defaultBicycle.getFrontWheel());
        System.out.println("Bicycle's back wheel: " + defaultBicycle.getBackWheel());
        System.out.println("Bicycle's frame: " + defaultBicycle.getFrame());
        
        
        System.out.println("Testing the toString method");
        System.out.println(defaultBicycle.toString());

        //Setting invalid values for the bike's wheels and frame
        System.out.println("Setting invalid values for the default bike's wheels and frame");
        defaultBicycle.setFrontWheel(new Wheel(100, 3));  // Invalid
        defaultBicycle.setBackWheel(new Wheel(5, 0.5));   // Invalid
        defaultBicycle.setFrame(new Frame(15, "Circle"));  // Invalid
        
        //Print again to check changes
        System.out.println(defaultBicycle.toString());
        
        //Create another bike
        System.out.println("Creating another bike using the parameterized constructor");
        Bicycle customBicycle = new Bicycle("Big Wheel", new Wheel(55, 2.5), new Wheel(18, 2.0), new Frame(60, "Penny-Farthing"));
        System.out.println(customBicycle.toString());
        
        //Create another bike with invalid parameters
        System.out.println("Creating another bike using the parameterized constructor with invalid values");
        Bicycle invalidBicycle = new Bicycle("Big Wheel", new Wheel(60, 3), new Wheel(100, 0.5), new Frame(70, "Circle"));
        System.out.println(invalidBicycle.toString());

        // Test equals method
        System.out.println("Checking the \"equals\" method");
        System.out.println("Does the first and third bicycles have different memory addresses? " + 
                            (defaultBicycle != customBicycle));
        System.out.println("Does the first and third bicycles have the same properties? " + 
                            defaultBicycle.equals(customBicycle));
        
        System.out.println("---------------------------------");
        System.out.println("Tests Complete! Goodbye");
        System.out.println("---------------------------------");
    }
}
