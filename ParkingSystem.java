/**
 * The ParkingSystem class represents a parking system with different types of slots.
 */
public class ParkingSystem {
    private int[] slots;

    /**
     * Constructs a ParkingSystem with the given number of slots for each car type.
     *
     * @param big    The number of slots for big cars.
     * @param medium The number of slots for medium cars.
     * @param small  The number of slots for small cars.
     */
    public ParkingSystem(int big, int medium, int small) {
        slots = new int[]{0, big, medium, small};
    }

    /**
     * Parks a car of the given type in the parking system.
     *
     * @param carType The type of car to park (1 for big, 2 for medium, 3 for small).
     * @return true if a slot is available and the car is parked successfully, false otherwise.
     */
    public boolean addCar(int carType) {
        if (slots[carType] > 0) {
            slots[carType]--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Main method to test the ParkingSystem class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of ParkingSystem
        ParkingSystem parking = new ParkingSystem(2, 3, 5);

        // Try to park a car of type 'big' (1)
        System.out.println(parking.addCar(1)); // Output: true

        // Try to park a car of type 'medium' (2)
        System.out.println(parking.addCar(2)); // Output: true

        // Try to park a car of type 'medium' (2)
        System.out.println(parking.addCar(2)); // Output: true

        // Try to park a car of type 'small' (3)
        System.out.println(parking.addCar(3)); // Output: true

        // Try to park a car of type 'big' (1), but there are no available slots
        System.out.println(parking.addCar(1)); // Output: false
    }
}
