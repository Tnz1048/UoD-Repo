package VehicleDatabase;

//Extends from vehicles class 

public class Motorbike extends Vehicles {

    private boolean hasLuggageBox;

    public Motorbike(boolean hasLuggageBox, String make, String model, int year,
            Gearbox gearbox, colour colour, int mileage, String vin) {
        super(make, model, year, gearbox, colour, mileage, vin);
        this.hasLuggageBox = hasLuggageBox;
    }

    public boolean hasLuggageBox() {
        return hasLuggageBox;
    }

    // Method to add Lugggage Box to MotorBike
    // If Motorbike already has it installed - will present a message to alert the user
    public void addLuggageBox() {
        if (this.hasLuggageBox == true) {
            System.out.println("Luggage Box Already Equipped!");
            return;
        }
        if (this.hasLuggageBox == false) {

            hasLuggageBox = true;
            System.out.println("Luggage Box has been Equipped!");
        }

    }
 // Method to remove Lugggage Box to MotorBike
 // If Motorbike does not have one installed - will present a message to alert the user
    public void removeLuggageBox() {
        if (this.hasLuggageBox == false) {
            System.out.println("No Luggage Box!");
            return;
        }
        if (this.hasLuggageBox == true) {

            hasLuggageBox = false;
            System.out.println("Luggage Box has been removed!");
        }

    }
}
