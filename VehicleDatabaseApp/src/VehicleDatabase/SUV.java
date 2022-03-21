package VehicleDatabase;

// class extends car class
public class SUV extends car {

    private boolean addAWD;

    public SUV(boolean addAWD, boolean addSatNav, boolean addParkingSensors,
            boolean addTowBar, boolean addRoofRack, String make, String model,
            int year, Gearbox gearbox, colour colour, int mileage, String vin) {
        super(addSatNav, addParkingSensors, addTowBar, addRoofRack, make, model,
                year, gearbox, colour, mileage, vin);
        this.addAWD = addAWD;
    }

    public void addAWD() {
        if (this.addAWD == true) {
            System.out.println("AWD Already Equipped!");
           return; 
        }
        if(this.addAWD == false) {
            addAWD = true;
            System.out.println("AWD has been Equipped!");
        }
    }

}

