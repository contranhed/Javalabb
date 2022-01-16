public class CarFactory {

    public static Car createCar(CarType carType, String carBrand, String carColor, int carSeatNumber) {
        Car newCar = null;

        switch (carType) {
            case ELECTRIC:
                newCar = new ElectricCar(carBrand, carColor, carSeatNumber);
                break;
            case GASCAR:
                newCar = new GasCar(carBrand, carColor, carSeatNumber);
                break;
            case HYBRIDCAR:
                newCar = new HybridCar(carBrand, carColor, carSeatNumber);
        }
         return newCar;
    }
}
