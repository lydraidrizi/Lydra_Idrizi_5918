class FlyingCar implements Vehicle, GroundTransport, AirTransport {
    private int fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private int maxAltitude;

    public FlyingCar(int fuelCapacity, int passengerCapacity, String terrainType, int maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving on " + terrainType);
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }

    @Override
    public void fly() {
        System.out.println("Flying at an altitude of " + maxAltitude + " meters.");
    }

    @Override
    public int getMaxAltitude() {
        return maxAltitude;
    }
}