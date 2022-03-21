package VehicleDatabase;

// Car Class which extends from Vehicles

public class car extends Vehicles {

    private boolean addSatNav;
    private boolean addParkingSensors;
    private boolean addTowBar;
    private boolean addRoofRack;

    public car(boolean addSatNav, boolean addParkingSensors, boolean addTowBar,
            boolean addRoofRack, String make, String model, int year,
            Gearbox gearbox, colour colour, int mileage, String vin) {
        super(make, model, year, gearbox, colour, mileage, vin);
        this.addSatNav = addSatNav;
        this.addParkingSensors = addParkingSensors;
        this.addTowBar = addTowBar;
        this.addRoofRack = addRoofRack;
    }

    public void addSatNav() {
        if (this.addSatNav == true) {
            System.out.println("Satnav Already Equipped!");
           return; 
        }
        if(this.addSatNav == false) {
            
            addSatNav = true;
            System.out.println("Satnav has been Equipped!");
        }
        
    }

    public void addParkingSensors() {
       if (this.addParkingSensors == true) {
            System.out.println("Parking Sensors Already Equipped!");
           return; 
        }
        if(this.addParkingSensors == false) {
            addParkingSensors = true;
            System.out.println("Parking Sensors has been Equipped!");
        }
    }

    public void addTowBar() {
        if (this.addTowBar == true) {
            System.out.println("TowBar Already Equipped!");
           return; 
        }
        if(this.addTowBar == false) {
            
            addTowBar = true;
            System.out.println("TowBar has been Equipped!");
        }
    }

    public void addRoofRack() {
        if (this.addRoofRack == true) {
            System.out.println("RoofRack Already Equipped!");
           return; 
        }
        if(this.addRoofRack == false) {
            
            addRoofRack = true;
            System.out.println("RoofRack has been Equipped!");
        }
    }
}
