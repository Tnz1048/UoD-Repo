package VehicleDatabase;

//import static VehicleDatabase.userAccounts.*;
import java.util.ArrayList;
import java.util.List;
import uod.gla.menu.MenuBuilder;
import uod.gla.menu.MenuItem;
import uod.gla.util.Reader;

public class VehicleApp {

    private static List<Vehicles> vehicleList = new ArrayList<>();
    private static VehicleApp object = new VehicleApp();

    public static void main(String[] args) {

        menu();

//        System.out.println("Welcome to Vehicle Management System!");
//        MenuItem login = new MenuItem("1", "Login", object, "login");
//        MenuBuilder.displayMenu(login);
//        System.out.println("Goodbye!");
    }

//    public static void login() {
//
//        String username = "Admin";
//        String password = "Password";
//
//        System.out.println("Please Log in to the System");
//        System.out.println("For This Example Please Use ....");
//        System.out.println("Username: Admin");
//        System.out.println("Password: Password");
//
//        String uName = Reader.readLine("Enter Username: ");
//        if (username == uName) {
//            String uPassword = Reader.readLine("Enter Password: ");
//            if (uPassword == password) {   
//                successfulLogin();
//                menu();
//        } else {
//                unsuccessfulLogin();                
//            }
//        }
//    }
    public static void menu() {
        System.out.println("Welcome to Vehicle Management System!");
        MenuItem create = new MenuItem("1", "Add New Vehicle", object, "create");
        MenuItem add = new MenuItem("2", "Add Extras Vehicles", object, "add");
        MenuItem Remove = new MenuItem("3", "Remove Vehicles", object, "remove");
        MenuItem List = new MenuItem("4", "List", object, "list");
        MenuBuilder.displayMenu(create, add, Remove, List);
        System.out.println("Goodbye!");
    }

    public static void create() {
        MenuItem car = new MenuItem("1", "Car", object, "createCar");
        MenuItem motorbike = new MenuItem("2", "Motorbike", object, "createMotorbike");
        MenuBuilder.displayMenuOnceAndReturn("Please select vehicle type...", car, motorbike);

    }

    public static void createCar() {
        MenuItem SUV = new MenuItem("1", "SUV", object, "createCarSUV");
        MenuItem Estate = new MenuItem("2", "Estate", object, "createCarEstate");
        MenuItem Hatchback = new MenuItem("3", "Hatchback", object, "createCarHatchback");
        MenuItem Saloon = new MenuItem("4", "Saloon", object, "createCarSaloon");
        MenuBuilder.displayMenuOnceAndReturn("Please select Vehicle Body Type...", SUV, Estate, Hatchback, Saloon);

    }

    public static void createMotorbike() {

        String make = Reader.readLine("Enter Make: ");
        String model = Reader.readLine("Enter Model: ");
        int year = Reader.readInt("Enter Year: ");
        int mileage = Reader.readInt("Enter Mileage: ");
        String VIN = Reader.readLine("Enter VIN: ");
        Gearbox gearbox = Reader.readEnum("Select Gearbox Type", Gearbox.class);
        colour colour = Reader.readEnum("Select Vehicle Colour: ", colour.class);
        boolean luggageBox = Reader.readBoolean("Vehicle Equipped with Luggage Box?: ");

        Vehicles v = new Motorbike(luggageBox, make, model, year, gearbox, colour, mileage, VIN);
        vehicleList.add(v);
    }

    public static void createCarSUV() {
        String make = Reader.readLine("Enter Make: ");
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

        Vehicles v = new SUV(AWD, satNav, parkingSensors, towBar, roofRack, make, model, year, gearbox, colour.BLUE, mileage, VIN);
        vehicleList.add(v);

    }

    public static void createCarEstate() {

        String make = Reader.readLine("Enter Make: ");
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

        Vehicles v = new estate(thirdRowSeat, satNav, parkingSensors, towBar, roofRack, make, model, year, gearbox, colour.BLUE, mileage, VIN);
        vehicleList.add(v);

    }

    public static void createCarHatchback() {

        String make = Reader.readLine("Enter Make: ");
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

        Vehicles v = new hatchback(satNav, parkingSensors, towBar, roofRack, make, model, year, gearbox, colour, mileage, VIN);
        vehicleList.add(v);

    }

    public static void createCarSaloon() {

        String make = Reader.readLine("Enter Make: ");
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

        Vehicles v = new Saloon(satNav, parkingSensors, towBar, roofRack, make, model, year, gearbox, colour, mileage, VIN);
        vehicleList.add(v);

    }

    public static void add() {

    }

    public static void remove() {

    }

    public static void list() {
        System.out.println("-----------------------------------------------------------------------");
        for (Vehicles v : vehicleList) {

            System.out.println("Year: " + v.getYear() + " | Make: " + v.getMake() + " | Model: " + v.getModel() + " | GearBox: " + v.getGearbox() + " | Colour: " + v.getColour());
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
}
