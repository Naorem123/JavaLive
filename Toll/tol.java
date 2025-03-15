import java.util.Scanner;
public class tol {
    public static double calculateTollFee(String vehicleType, boolean hasRFID) {
        double tollFee = 0;
        if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type.");
            return 0;
        }
        if (hasRFID) {
            tollFee *= 0.90; 
        }
        return tollFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int n = input.nextInt();
        for (int i = 1; i<= n; i++) {
            System.out.print("Enter vehicle type for vehicle " + i + " (Car/Truck): ");
            String vehicleType = input.next();
             System.out.print("Does the vehicle have an RFID pass? (true/false): ");
            boolean hasRFID = input.nextBoolean();
            double tollFee = calculateTollFee(vehicleType, hasRFID);
            if (tollFee > 0) {
                System.out.println("Toll fee for vehicle " + i + ": " + tollFee);
            }
        }
    }
}
 