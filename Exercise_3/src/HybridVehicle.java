class HybridVehicle implements Electric, InternalCombustion {
    String carName;
        
    public void chargeBattery() {
        System.out.println(carName + " is charging battery.");
    }
    
    public void fillGas() {
        System.out.println(carName + " is refilling gas.");
    }

    public void wash() {
        System.out.println("Cleaning " + carName + ".");
    }
}