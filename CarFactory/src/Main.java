import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        greeting();
        showMenu();
    }

    private static void greeting() {
        System.out.println("Welcome to build your own car!");
    }

    private static void showMenu() {
        boolean proceed = true;
        int choice;
        ConsoleUI ui = new ConsoleUI();
        Scanner scan = new Scanner(System.in);

        System.out.printf("Press 1 to build an electric car %nPress 2 to build a gas car %nPress 3 to build a hybrid car%n");

        while(proceed) {
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    Car electric = CarFactory.buildCar(CarType.ELECTRIC, ui.inputCarBrand(), ui.inputCarColor(), ui.inputNumCarSeats());
                    System.out.println(electric.toString());
                    break;
                case 2:
                    Car gas = CarFactory.buildCar(CarType.GASCAR, ui.inputCarBrand(), ui.inputCarColor(), ui.inputNumCarSeats());
                    System.out.println(gas.toString());
                    break;
                case 3:
                    Car hybrid = CarFactory.buildCar(CarType.HYBRIDCAR, ui.inputCarBrand(), ui.inputCarColor(), ui.inputNumCarSeats());
                    System.out.println(hybrid.toString());
                    break;
                default:
                    System.out.println("Not a valid number: try 1, 2 or 3 again");
                    break;
            }

        }
    }
}
