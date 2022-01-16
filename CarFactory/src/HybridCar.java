public class HybridCar implements Car {
    private String carType;
    private String carColor;
    private int carSeatNumber;

    public HybridCar(String carType, String carColor, int carSeatNumber) {
        this.carType = carType;
        this.carColor = carColor;
        this.carSeatNumber = carSeatNumber;
    }

    @Override
    public String getCarType() {
        return this.carType;
    }

    @Override
    public String getCarColor() {
        return this.carColor;
    }

    @Override
    public int getCarSeatNumber() {
        return this.carSeatNumber;
    }



    @Override
    public String toString() {
        return "Thanks for ordering a Hybrid Car!";
    }
}
