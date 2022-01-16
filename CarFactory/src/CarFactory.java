public class CarFactory {

    public static Car buildCar(CarType carType, String carBrand, String carColor, int carSeatNumber) {
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
                break;
            default:
                System.out.println("We know it is hard, but you have to choose");
                break;
        }
         return newCar;
    }
}
