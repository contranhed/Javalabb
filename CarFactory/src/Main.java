import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        greeting();
        showMenu();
    }

    public static void greeting() {
        System.out.println("Welcome to *** Build Your Own Car ***!");
    }

    private static void showMenu() {
        boolean proceed = true;
        int choice;
        ConsoleUI ui = new ConsoleUI();
        Scanner scan = new Scanner(System.in);

        while(proceed) {
            System.out.println("");
            System.out.println("Make a choice:");
            System.out.printf("Press 1 to build an electric car %nPress 2 to build a gas car %nPress 3 to build a hybrid car %nPress 4 to exit%n");
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
                case 4:
                    proceed = false;
                    System.out.println("Thanks for the visit!");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Error: Not a valid number. Try 1, 2, 3 or 4 again");
                    break;
            }
        }
    }
}
