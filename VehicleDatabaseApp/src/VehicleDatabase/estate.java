package VehicleDatabase;

//class extends car class
public class estate extends car {

    private boolean addThirdRowSeat;

    public estate(boolean addThirdRowSeat, boolean addSatNav, boolean addParkingSensors, boolean addTowBar, boolean addRoofRack, VehicleDatabase.make make, String model, int year, Gearbox gearbox, VehicleDatabase.colour colour, int mileage, String vin, vehicleclass vehicleClass, VehicleStatus vehicleStatus) {
        super(addSatNav, addParkingSensors, addTowBar, addRoofRack, make, model, year, gearbox, colour, mileage, vin, vehicleClass, vehicleStatus);
        this.addThirdRowSeat = addThirdRowSeat;
    }

    public boolean hasThirdRowSeat() {
        return addThirdRowSeat;
    }

        public void addThirdRowSeat() {
            if (this.addThirdRowSeat == true) {
            System.out.println("Third Row Seat's Already Equipped!");
           return; 
        }
        if(this.addThirdRowSeat == false) {
            addThirdRowSeat = true;
            System.out.println("Third Row Seat's has been Equipped!");
        }
        
    }

       @Override
    public String toString() {
        //Type: Estate | Make: Skoda | Model: Karoq | Year: 2022 | GearBox: Auto | Colour: Blue | Mileage: 1234 | Vin: 1234567890abc
        //AWD: Yes | Third Row Seat: Yes | SatNav: Yes | Parking Sensors: Yes | Towbar: Yes | RoofRack: Yes 
        //
        
        return "Type: " + vehicleclass.SUV + " | Make: " + getMake() + " | Model: " + getModel()
                + " | Year: " + getYear() + " | Gearbox: " + getGearbox()
                + " | Colour: " + getColour() + " | Mileage: " + getMileage()
                + "\n  AWD: " + hasSatNav() + " | Third Row Seat: " + hasThirdRowSeat()
                + " | Satnav: " + hasSatNav() + " | Parking Sensors: " + hasParkingSensors()
                + " | Towbar: " + hasTowBar() + " | RoofRack: " + hasRoofRack()
                + "\n ";
        
    }

}
