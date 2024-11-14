public class SpaceShuttle {
    class SpaceShuttle implements Vehicle, AirTransport, SpaceTransport {
        private int fuelCapacity;
        private int passengerCapacity;
        private int maxAltitude;
        private int orbitRange;

        public SpaceShuttle(int fuelCapacity, int passengerCapacity, int maxAltitude, int orbitRange) {
            this.fuelCapacity = fuelCapacity;
            this.passengerCapacity = passengerCapacity;
            this.maxAltitude = maxAltitude;
            this.orbitRange = orbitRange;
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
        public void fly() {
            System.out.println("Flying at an altitude of " + maxAltitude + " meters.");
        }

        @Override
        public int getMaxAltitude() {
            return maxAltitude;
        }

        @Override
        public void launch() {
            System.out.println("Launching into space.");
        }

        @Override
        public int getOrbitRange() {
            return orbitRange;
        }
    }

}
