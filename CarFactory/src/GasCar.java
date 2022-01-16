public class GasCar implements Car {

    private String carType;
    private String carColor;
    private int carSeatNumber;

    public GasCar(String carType, String carColor, int carSeatNumber) {
        this.carType = carType;
        this.carColor = carColor;
        this.carSeatNumber = carSeatNumber;
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
    public String getCarType() {
        return this.carType;
    }

    @Override
    public String toString() {
        return "Thanks for ordering yet another gas car - just what we need...";
    }
}
