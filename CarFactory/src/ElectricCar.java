public class ElectricCar implements Car {
    private String carBrand;
    private String carColor;
    private int carSeatNumber;

    public ElectricCar(String carType, String carColor, int carSeatNumber) {
        this.carBrand = carType;
        this.carColor = carColor;
        this.carSeatNumber = carSeatNumber;
    }

    @Override
    public String getCarType() {
        return this.carBrand;
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
        return "Congratulations! You have ordered an ElectricCar with these details: {" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carSeatNumber=" + carSeatNumber +
                '}';
    }
}
