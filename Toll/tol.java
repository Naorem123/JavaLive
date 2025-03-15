import java.util.*; 
public class tol {
    public static double calculateToll(String vehicleType, boolean hasRFID) {
        double tollFee = 0;
if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type.");
            return -1; 
        }
         if (hasRFID)
          {
            tollFee -= tollFee * 0.10; 
        }
        return tollFee;
}
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the vehicle type: ");
        String vehicleType = scan.nextLine();
        System.out.println("Does the vehicle have RFID? (true/false): ");
        boolean hasRFID = scan.nextBoolean();

        double tollFee = calculateToll(vehicleType, hasRFID);
        if (tollFee != -1) {
            System.out.println("Toll fee: " + tollFee);
        }
     }       
        
    
  }   

