package VehicleDatabase;

public class Main {

    public static void main(String[] args) {

        SUV vehicle01 = new SUV(true, true, true, true, true, "Ford", "Focus", 2020, Gearbox.Automatic, colour.BLACK, 2000, "abc1234567890def");
        Motorbike vehicle02 = new Motorbike(true, "Yammaha", "R15", 2020, Gearbox.Manual, colour.RED, 50, "asdhjashdlahsdj12");
        Saloon vehicle03 = new Saloon(false, true, false, false, "BMW", "520 M", 2021, Gearbox.Automatic, colour.WHITE, 8, "qwertyuiop1234567");
        estate vehicle04 = new estate(false, false, false, false, true, "Skoda", "Octavia Estate", 2019, Gearbox.Manual, colour.GRAY, 23000, "qsxcdffe234664");
        hatchback vehicle05 = new hatchback(true, true, true, true, "Kia", "Sportage", 2017, Gearbox.Manual, colour.ORANGE, 30002, "asdfghjkl12345678");
        hatchback vehicle06 = new hatchback(true, true, true, true, "Ford", "Focus", 0, Gearbox.Manual, colour.BLUE, 0, "ajhsdkjahsdkjhasd");
        

// Array created to store 5 vehicle objects
        Vehicles[] vehicles = new Vehicles[5];

        vehicles[0] = vehicle01;
        vehicles[1] = vehicle02;
        vehicles[2] = vehicle03;
        vehicles[3] = vehicle04;
        vehicles[4] = vehicle05;
        vehicle01.addAWD();
        

        // Random Test Code to check everything is working correctly.
      
//        System.out.println("Make: " + vehicle01.getMake());
//        System.out.println("Model: " + vehicle01.getModel());
//        System.out.println("Year: " + vehicle01.getYear());
//        System.out.println("Gearbox: " + vehicle01.getGearbox());
//        System.out.println("Colour: " + vehicle01.getColour());
//        System.out.println("VIN: " + vehicle01.getVin());
//        System.out.println("Mileage: " + vehicle01.getMileage());
//        System.out.println("Satnav: " + vehicle01.HasSatNav());
//        System.out.println("Parking Sensors: " + vehicle01.HasParkingSensors());
//        System.out.println("Tow Bar: " + vehicle01.HasTowBar());
//        System.out.println("Roof Rack: " + vehicle01.HasRoofRack());
//        System.out.println("AWD: " + vehicle01.isHasAWD());
//        System.out.println("Bike 1");
//        System.out.println("Luggage Box : " + vehicle02.hasLuggageBox());
//        vehicle02.addLuggageBox();
//        System.out.println("Luggage Box : " + vehicle02.hasLuggageBox());
//        vehicle02.removeLuggageBox();
//        System.out.println("Luggage Box : " + vehicle02.hasLuggageBox());
//                
//                
//        System.out.println("Old Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(27000);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(10000);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(-10);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        System.out.println(" ");
        

//        
//        System.out.println("Colour Change ");
//        
//        System.out.println("Old Vehicle Colour " + vehicle04.getColour());
//        vehicle04.setColour("Green");
//        System.out.println("New Vehicle Colour " + vehicle04.getColour());
//        
//        
//        System.out.println("Mileage Change");
//        
//        System.out.println("Old Vehicle01 Colour " + vehicle04.getMileage());
//        vehicle04.setMileage(20000);
//        System.out.println("New Vehicle01 Colour " + vehicle04.getMileage());
//        
//        System.out.println("Mileage Change under orginal");
//        
//        System.out.println("Old Vehicle01 Colour " + vehicle04.getMileage());
//        vehicle04.setMileage(20000);
//        System.out.println("New Vehicle01 Colour " + vehicle04.getMileage());
//        vehicle04.setMileage(10000);        
//        System.out.println("New Vehicle01 Colour " + vehicle04.getMileage());  

//       Mileage Change test

//        System.out.println("Old Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(27000);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(10000);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
//        vehicle04.setMileage(-10);
//        System.out.println("New Vehicle01 mileage " + vehicle04.getMileage());
        
//      Colour Change Test

//        System.out.println("Old Vehicle01 Colour " + vehicle04.getColour());
//        vehicle04.setColour("white");
//        System.out.println("New Vehicle01 Colour " + vehicle04.getColour());
//        vehicle04.setColour("white");
//        System.out.println("New Vehicle01 Colour " + vehicle04.getColour());
        
        

        
//        System.out.println("List of Array Position 1 : " + vehicles[0].getMake());
//        System.out.println("List of Array Position 2 : " + vehicles[1].getMake());
//        System.out.println("List of Array Position 3 : " + vehicles[2].getMake());
//        System.out.println("List of Array Position 4 : " + vehicles[3].getMake());
//        System.out.println("List of Array Position 5 : " + vehicles[4].getMake());


    }
}
