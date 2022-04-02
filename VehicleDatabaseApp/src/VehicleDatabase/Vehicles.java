package VehicleDatabase;

// primary class/methods which is the base which other classes extend from
import java.io.Serializable;

public abstract class Vehicles implements Serializable, Comparable<Vehicles> {

    private final make make;
    private final String model;
    private final int year;
    private final Gearbox gearbox;
    private colour colour;
    private int mileage;
    private final String vin;
    private final vehicleclass vehicleClass;
    private VehicleStatus vehicleStatus;
    // Reg Number
    // KeyBox ID

    public Vehicles(make make, String model, int year, Gearbox gearbox, colour colour, int mileage, String vin, vehicleclass vehicleClass, VehicleStatus vehicleStatus) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.gearbox = gearbox;
        this.colour = colour;
        this.mileage = mileage;
        this.vin = vin;
        this.vehicleClass = vehicleClass;
        this.vehicleStatus = vehicleStatus;
    }



    public vehicleclass getVehicleClass() {
        return vehicleClass;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public make getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public colour getColour() {
        return colour;
    }

    public void setColour(colour colour) {
        System.out.println("Setting new vehicle colour....");
        if (colour == this.getColour()) {
            System.out.println("Colour Change Aborted... Car is Already " + getColour());
        } else {
            this.colour = colour;
            System.out.println("Colour Changed Successfully! Vehicle Colour is now " + colour);
        }

    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        System.out.println("Setting new Mileage....");
        if (mileage < 0 || mileage < this.getMileage()) {
            System.out.println("Mileage Changed Failed... Invalid Mileage Entered!");
        } else {
            this.mileage = mileage;
            System.out.println("Mileage Changed Successfully! Mileage is now " + mileage);
        }
    }

    public String getVin() {
        return vin;
    }

    // Unique Vin Number
    //
    @Override
    public int compareTo(Vehicles v) {
        if (!this.vin.equals(v.getVin())) {
            System.out.println("Error... Vehicle(VIN Number) Already on System...");
            
            
        } 
        // Key Box ID
        // Reg Number
        return this.vin.compareTo(v.getVin());
    }

}
