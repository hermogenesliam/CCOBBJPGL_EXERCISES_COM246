public class App {
    public static void main(String[] args) throws Exception {

        HybridVehicle myCar = new HybridSedan();
        myCar.carName = "Toyota";
        myCar.chargeBattery();
        myCar.fillGas();
        myCar.wash(); 

        HybridVehicle myCar2 = new HybridPickup();
        myCar.carName = "BYD";
        myCar.chargeBattery();
        myCar.fillGas();
        myCar.wash(); 



    }
}
