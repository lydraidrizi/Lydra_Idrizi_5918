
    class AmphibiousCar implements Vehicle, GroundTransport {
        private int fuelCapacity;
        private int passengerCapacity;
        private String terrainType;

        public AmphibiousCar(int fuelCapacity, int passengerCapacity, String terrainType) {
            this.fuelCapacity = fuelCapacity;
            this.passengerCapacity = passengerCapacity;
            this.terrainType = terrainType;
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
    }

