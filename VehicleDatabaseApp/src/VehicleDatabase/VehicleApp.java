package VehicleDatabase;

//import static VehicleDatabase.userAccounts.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import uod.gla.io.File;
import uod.gla.menu.Finalisable;
import uod.gla.menu.MenuBuilder;
import uod.gla.menu.MenuItem;
import uod.gla.util.CollectionUtils;
import uod.gla.util.Reader;
import uod.gla.util.Sequence;

public class VehicleApp implements Finalisable {

    private static VehicleApp object = new VehicleApp();
    private static Sequence seq = new Sequence(1, 2_000_000_000);
    private static List<Vehicles> vehicleList = new ArrayList<>();
    private static List<Vehicles> soldvehicleList = new ArrayList<>();

    private static File seqFile = new File("storage", "seq");
    private static File vehicleFile = new File("Storage", "vehicles");
    private static File soldvehicleFile = new File("Storage", "soldvehicles");
   

    public static void main(String[] args) {
        Sequence tseq = seqFile.<Sequence>retrieve(true);
        List<Vehicles> tvehicles = vehicleFile.<List<Vehicles>>retrieve(true);
        List<Vehicles> tsvehicles = soldvehicleFile.<List<Vehicles>>retrieve(true);
        if (tseq != null) {
            seq = tseq;
        }
        if (tvehicles != null) {
            vehicleList = tvehicles;
        }
        if (tsvehicles != null) {
            soldvehicleList = tsvehicles;
        }

        menu();
        object.finalise();
    }
// Complete
    public static void menu() {
        System.out.println("Welcome to Vehicle Management System!");
        MenuItem create = new MenuItem("1", "Add New Vehicle", object, "create");
        MenuItem edit = new MenuItem("2", "Edit Vehicles", object, "edit");
        MenuItem add = new MenuItem("3", "Add Equipment", object, "add");
        MenuItem remove = new MenuItem("4", "Remove Equipment", object, "remove");        
        MenuItem delete = new MenuItem("5", "Delete Vehicles", object, "deleteVehicle");
        MenuItem List = new MenuItem("6", "List", object, "list");
        MenuItem Search = new MenuItem("7", "Vehicle Search", object, "vehicleSearch");
        MenuBuilder.displayMenu(object, create, edit, add,remove,delete, List, Search);
        System.out.println("Goodbye!");
    }
// Complete
    public static void create() {
        MenuItem car = new MenuItem("1", "Car", object, "createCar");
        MenuItem motorbike = new MenuItem("2", "Motorbike", object, "createMotorbike");
        MenuBuilder.displayMenuOnceAndReturn("Please select vehicle type...", car, motorbike);

    }
// Complete
    public static void createCar() {
        MenuItem SUV = new MenuItem("1", "SUV", object, "createCarSUV");
        MenuItem Estate = new MenuItem("2", "Estate", object, "createCarEstate");
        MenuItem Hatchback = new MenuItem("3", "Hatchback", object, "createCarHatchback");
        MenuItem Saloon = new MenuItem("4", "Saloon", object, "createCarSaloon");
        MenuBuilder.displayMenuOnceAndReturn("Please select Vehicle Body Type...", SUV, Estate, Hatchback, Saloon);

    }
// Complete
    public static void createMotorbike() {

        make make = Reader.readEnum("Select Make: ", make.class);
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean luggageBox = Reader.readBoolean("Vehicle Equipped with Luggage Box?: ");

        Vehicles v = new Motorbike(luggageBox, make, model, year, gearbox, colour, mileage, VIN, vehicleclass.Motorbike, VehicleStatus.AVAILABLE);
        vehicleList.add(v);
    }
// Complete
    public static void createCarSUV() {
        make make = Reader.readEnum("Select Make: ", make.class);
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean AWD = Reader.readBoolean("Vehicle Equipped with AWD?: ");
        boolean satNav = Reader.readBoolean("Vehicle Equipped with Sat Nav?: ");
        boolean parkingSensors = Reader.readBoolean("Vehicle Equipped with Parking Sensors?: ");
        boolean towBar = Reader.readBoolean("Vehicle Equipped with TowBar?: ");
        boolean roofRack = Reader.readBoolean("Vehicle Equipped with Roof Rack?: ");

        Vehicles v = new SUV(AWD, satNav, parkingSensors, towBar, roofRack, 
                make, model, year, gearbox, colour, mileage, VIN, vehicleclass.SUV, VehicleStatus.AVAILABLE);
        vehicleList.add(v);

    }
// Complete
    public static void createCarEstate() {

        make make = Reader.readEnum("Select Make: ", make.class);
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean thirdRowSeat = Reader.readBoolean("Vehicle Equipped with Third Row Seat?: ");
        boolean satNav = Reader.readBoolean("Vehicle Equipped with Sat Nav?: ");
        boolean parkingSensors = Reader.readBoolean("Vehicle Equipped with Parking Sensors?: ");
        boolean towBar = Reader.readBoolean("Vehicle Equipped with TowBar?: ");
        boolean roofRack = Reader.readBoolean("Vehicle Equipped with Roof Rack?: ");

        Vehicles v = new estate(thirdRowSeat, satNav, parkingSensors, towBar, roofRack, 
                make, model, year, gearbox, colour, mileage, VIN, vehicleclass.Estate, VehicleStatus.AVAILABLE);
        vehicleList.add(v);

    }
// Complete
    public static void createCarHatchback() {

        make make = Reader.readEnum("Select Make: ", make.class);
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean satNav = Reader.readBoolean("Vehicle Equipped with Sat Nav?: ");
        boolean parkingSensors = Reader.readBoolean("Vehicle Equipped with Parking Sensors?: ");
        boolean towBar = Reader.readBoolean("Vehicle Equipped with TowBar?: ");
        boolean roofRack = Reader.readBoolean("Vehicle Equipped with Roof Rack?: ");

        Vehicles v = new hatchback(satNav, parkingSensors, towBar, roofRack, 
                make, model, year, gearbox, colour, mileage, VIN, vehicleclass.Hatchback, VehicleStatus.AVAILABLE);
        vehicleList.add(v);

    }
// Complete
    public static void createCarSaloon() {

        make make = Reader.readEnum("Select Make: ", make.class);
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean satNav = Reader.readBoolean("Vehicle Equipped with Sat Nav?: ");
        boolean parkingSensors = Reader.readBoolean("Vehicle Equipped with Parking Sensors?: ");
        boolean towBar = Reader.readBoolean("Vehicle Equipped with TowBar?: ");
        boolean roofRack = Reader.readBoolean("Vehicle Equipped with Roof Rack?: ");

        Vehicles v = new Saloon(satNav, parkingSensors, towBar, roofRack, 
                make, model, year, gearbox, colour, mileage, VIN, vehicleclass.Saloon, VehicleStatus.AVAILABLE);
        vehicleList.add(v);

    }
// Complete
    public static Vehicles search() {
        String key = Reader.readLine("Search for vehicle details: ");
        Collection<Vehicles> vehicleFound = CollectionUtils.search(key, vehicleList);
        if (vehicleFound.isEmpty()) {
            return null;
        } else if (vehicleFound.size() == 1) {
            return ((List<Vehicles>) vehicleFound).get(0);
        } else {
            return Reader.readObject("Please Select a Vehicle: ", vehicleFound);
        }

    }
// Complete
    public static void vehicleSearch() {
        Vehicles v = search();
        if (v == null) {
            System.out.println("No vehicles found!");
            return;
        }
        System.out.println("The Following Vehicles have been found...");
        System.out.println("-----------------------------------------");
        System.out.println(v);
        System.out.println("----");

    }
// Complete
    public static void edit() {

        MenuItem colour = new MenuItem("1", "Colour", object, "changeColour");
        MenuItem mileage = new MenuItem("2", "Mileage", object, "changeMileage");
        MenuBuilder.displayMenuOnceAndReturn("What would you like to change? ", colour, mileage);

    }
// Complete
    public static void add() {
        Vehicles v = search();
        if (v == null) {
            System.out.println("No Vehicle Found!");
            return;
        }
        System.out.println("The following vehicles has been found...");
        System.out.println(v);
        System.out.println();
        boolean edited = false;

        if (v instanceof SUV) {
            if (Reader.readBoolean("Do you want to add AWD? ")) {
                ((SUV) v).addAWD();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add SatNav? ")) {
                ((SUV) v).addSatNav();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add Parking Sensors? ")) {
                ((SUV) v).addParkingSensors();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a TowBar? ")) {
                ((SUV) v).addTowBar();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a RoofRack? ")) {
                ((SUV) v).addRoofRack();
                edited = true;
            }

        }
        if (v instanceof estate) {
            if (Reader.readBoolean("Do you want to add a Third Row Seat? ")) {
                ((estate) v).addThirdRowSeat();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add SatNav? ")) {
                ((estate) v).addSatNav();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add Parking Sensors? ")) {
                ((estate) v).addParkingSensors();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a TowBar? ")) {
                ((estate) v).addTowBar();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a RoofRack? ")) {
                ((estate) v).addRoofRack();
                edited = true;
            }

        }

        if (v instanceof hatchback) {
            if (Reader.readBoolean("Do you want to add SatNav? ")) {
                ((hatchback) v).addSatNav();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add Parking Sensors? ")) {
                ((hatchback) v).addParkingSensors();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a TowBar? ")) {
                ((hatchback) v).addTowBar();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a RoofRack? ")) {
                ((hatchback) v).addRoofRack();
                edited = true;
            }

        }

        if (v instanceof Saloon) {
            if (Reader.readBoolean("Do you want to add SatNav? ")) {
                ((Saloon) v).addSatNav();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add Parking Sensors? ")) {
                ((Saloon) v).addParkingSensors();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a TowBar? ")) {
                ((Saloon) v).addTowBar();
                edited = true;
            }
            if (Reader.readBoolean("Do you want to add a RoofRack? ")) {
                ((Saloon) v).addRoofRack();
                edited = true;
            }

        }

        if (v instanceof Motorbike) {
            if (Reader.readBoolean("Do you want to add a LuggageBox? ")) {
                ((Motorbike) v).addLuggageBox();
                edited = true;
            }
        }

        if (edited) {
            System.out.println("Changes have been saved!");
        } else {
            System.out.println("No changes were made!");
        }

    }
// Complete
    public static void changeColour() {

        Vehicles v = search();
        if (v == null) {
            System.out.println("No Vehicle Found!");
            return;
        }
        System.out.println("The following vehicles has been found...");
        System.out.println(v);
        System.out.println();
        boolean edited = false;

        v.setColour(Reader.readEnum("***Current Colour : " + v.getColour() + "***" + " Please select a new Colour ", colour.class));
        edited = true;
//       System.out.println("Vehicle Colour Change Successfully");
    }
// Complete
    public static void changeMileage() {

        Vehicles v = search();
        if (v == null) {
            System.out.println("No Vehicle Found!");
            return;
        }
        System.out.println("The following vehicles has been found...");
        System.out.println(v);
        System.out.println();
        boolean edited = false;

        v.setMileage(Reader.readInt("***Current Mileage : " + v.getMileage() + "***" + " Please enter new Mileage "));
        edited = true;
//        System.out.println("Vehicle Mileage Change Successfully");
    }
// Complete
    public static void remove() {
        Vehicles v = search();
        if (v == null) {
            System.out.println("No Vehicle Found!");
            return;
        }
        System.out.println("The following vehicles has been found...");
        System.out.println(v);
        System.out.println();
        boolean edited = false;
        
        if (v instanceof Motorbike) {
            if (Reader.readBoolean("Do you want to Remove LuggageBox? ")) {
                ((Motorbike) v).removeLuggageBox();
                edited = true;
            }
        }

        if (edited) {
            System.out.println("Changes have been saved!");
        } else {
            System.out.println("No changes were made!");
        }

    }
// Complete
    public static void deleteVehicle() {
        Vehicles v = search();
        if (v == null) {
            System.out.println("No Vehicle Found!");
            return;
        }
        System.out.println("The following vehicles has been found...");
        System.out.println(v);
        System.out.println();
        
        if (Reader.readBoolean("Mark Vehicle as sold? ")) {
            vehicleList.remove(v);
            v.setVehicleStatus(VehicleStatus.SOLD);
            System.out.println("Vehicle mark as sold!");
            soldvehicleList.add(v);
            System.out.println("Vehicle added to Sold List!");
        } else {
            System.out.println("Status Change - Aborted!");
        }
        
    }
// Complete
    public static void list() {
        MenuItem available = new MenuItem("1", "List Available Vehicles", object, "listAvail");
        MenuItem sold = new MenuItem("2", "List Sold Vehicles", object, "listSold");
        MenuItem all = new MenuItem("3", "List All Vehicles", object, "listAll");        
        MenuBuilder.displayMenuOnceAndReturn("What would you like to change? ", available,sold, all);
    }
    
    public static void listAvail() {
               Collections.sort(vehicleList);
        System.out.println("--------------------------AVAILABLE------------------------------------");  
        for (Vehicles v : vehicleList) {
            System.out.println("Type: " + v.getVehicleClass() + " | Make: " + v.getMake() + " | Model: " + v.getModel()
                    + " | Year: " + v.getYear() + " | Gearbox: " + v.getGearbox()
                    + " | Colour: " + v.getColour() + " | Mileage: " + v.getMileage() + " | Status:  " + v.getVehicleStatus());
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------------------------");
        if (vehicleList.size() == 1) {
            System.out.println(vehicleList.size() + " Vehicle displayed!");
        } else {
            System.out.println(vehicleList.size() + " Vehicles displayed!");
        }
        System.out.println("-----------------------------------------------------------------------");
    } 
    
    
    public static void listSold() {
                Collections.sort(soldvehicleList);
        System.out.println("------------------------------SOLD-------------------------------------");        
        for (Vehicles v : soldvehicleList) {
            System.out.println("Type: " + v.getVehicleClass() + " | Make: " + v.getMake() + " | Model: " + v.getModel()
                    + " | Year: " + v.getYear() + " | Gearbox: " + v.getGearbox()
                    + " | Colour: " + v.getColour() + " | Mileage: " + v.getMileage() + " | Status:  " + v.getVehicleStatus());
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------------------------");
        if (soldvehicleList.size() == 1) {
            System.out.println(soldvehicleList.size() + " Vehicle displayed!");
        } else {
            System.out.println(soldvehicleList.size() + " Vehicles displayed!");
        }
        System.out.println("-----------------------------------------------------------------------");
    } 
    
    public static void listAll() {
                Collections.sort(vehicleList);
        System.out.println("--------------------------AVAILABLE------------------------------------");         
        for (Vehicles v : vehicleList) {
            System.out.println("Type: " + v.getVehicleClass() + " | Make: " + v.getMake() + " | Model: " + v.getModel()
                    + " | Year: " + v.getYear() + " | Gearbox: " + v.getGearbox()
                    + " | Colour: " + v.getColour() + " | Mileage: " + v.getMileage() + " | Status:  " + v.getVehicleStatus());
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------------------------");
        if (vehicleList.size() == 1) {
            System.out.println(vehicleList.size() + " Vehicle displayed!");
        } else {
            System.out.println(vehicleList.size() + " Vehicles displayed!");
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" ");
                        Collections.sort(soldvehicleList);
        System.out.println("------------------------------SOLD-------------------------------------");        
        for (Vehicles v : soldvehicleList) {
            System.out.println("Type: " + v.getVehicleClass() + " | Make: " + v.getMake() + " | Model: " + v.getModel()
                    + " | Year: " + v.getYear() + " | Gearbox: " + v.getGearbox()
                    + " | Colour: " + v.getColour() + " | Mileage: " + v.getMileage() + " | Status:  " + v.getVehicleStatus());
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------------------------");
        if (soldvehicleList.size() == 1) {
            System.out.println(soldvehicleList.size() + " Vehicle displayed!");
        } else {
            System.out.println(soldvehicleList.size() + " Vehicles displayed!");
        }
        System.out.println("-----------------------------------------------------------------------");
 
    }     

    @Override
    public void finalise() {
        seqFile.save(seq);
        vehicleFile.save((Serializable) vehicleList);
        soldvehicleFile.save((Serializable) soldvehicleList);
    }
}


