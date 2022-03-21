package VehicleDatabase;

//class extends car class
public class estate extends car {

    private boolean addThirdRowSeat;

    public estate(boolean addThirdRowSeat, boolean addSatNav, boolean addParkingSensors, boolean addTowBar, boolean addRoofRack, String make, String model, int year, Gearbox gearbox, VehicleDatabase.colour colour, int mileage, String vin) {
        super(addSatNav, addParkingSensors, addTowBar, addRoofRack, make, model, year, gearbox, colour, mileage, vin);
        this.addThirdRowSeat = addThirdRowSeat;
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

   

}
