public class GalacticTransportationHub {
    public static void main(String[] args) {

        AmphibiousCar amphibiousCar = new AmphibiousCar(50, 4, "water and land");
        FlyingCar flyingCar = new FlyingCar(70, 4, "land", 3000);
        SpaceShuttle spaceShuttle = new SpaceShuttle(1000, 6, 100000, 5000);


        System.out.println("Amphibious Car:");
        System.out.println("Fuel Capacity: " + amphibiousCar.getFuelCapacity());
        System.out.println("Passenger Capacity: " + amphibiousCar.getPassengerCapacity());
        amphibiousCar.drive();
        System.out.println("Terrain Type: " + amphibiousCar.getTerrainType());
        System.out.println();


        System.out.println("Flying Car:");
        System.out.println("Fuel Capacity: " + flyingCar.getFuelCapacity());
        System.out.println("Passenger Capacity: " + flyingCar.getPassengerCapacity());
