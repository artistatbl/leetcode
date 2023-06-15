public class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[] { 0, big, medium, small };
    }

    public boolean addCar(int carType) {
        if (slots[carType] > 0) {
            slots[carType]--;
            return true;
        } else {
            return false;
        }
    }

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
