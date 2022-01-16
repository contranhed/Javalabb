import java.util.Scanner;

public class ConsoleUI {
    Scanner scan = new Scanner(System.in);

    protected String carBrand;
    protected String carColor;
    protected int numCarSeats;

    // Empty constructor
    public ConsoleUI() {
    }

    public String inputCarBrand() {
        System.out.println("Name the car brand you want: ");
        carBrand = read();
        return carBrand;
    }

    public String inputCarColor() {
        System.out.println("Name the car color you want: ");
        carColor = read();
        return carColor;
    }

    // NB! No Error handling to check if input is a number.
    public int inputNumCarSeats() {
        System.out.println("Name the number of car seats you want: ");
        numCarSeats = Integer.parseInt(read());
        return numCarSeats;
    }

    // Read and return the user input
    public String read() {
        return scan.nextLine();
    }
}
