import java.util.Scanner;

class Grocery implements ShoppingCategory {
    private double total_price = 0.0;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void welcome() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("--                     Grocery Menu                      --");
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void showOptions() {
        System.out.println("\t1. Fish & Meat");
        System.out.println("\t2. Dairy & Eggs");
        System.out.println("\t3. Oil & Fat");
        System.out.println("\t4. Exit this shopping Category\n");
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public double calculatePrice(int choice) {
        switch (choice) {
            case 1:
                return fishMeatMenu();
            case 2:
                return dairyEggsMenu();
            case 3:
                return oilFatMenu();
            case 4:
                System.out.println("You have selected to exit from Grocery Menu");
                break;
            default:
                System.out.println("You have selected an invalid option");
        }
        return 0.0;
    }

    private double fishMeatMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Beef --> Price: 500.00tk");
        System.out.println("\t2. Chicken --> Price: 200.00tk");
        System.out.println("\t3. Mutton --> Price: 1000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Beef --> Price: 500.00tk");
                return 500.00;
            case 2:
                System.out.println("You have selected Chicken --> Price: 200.00tk");
                return 200.00;
            case 3:
                System.out.println("You have selected Mutton --> Price: 1000.00tk");
                return 1000.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }

    private double dairyEggsMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Milk --> Price: 50.00tk");
        System.out.println("\t2. Cheese --> Price: 100.00tk");
        System.out.println("\t3. Butter --> Price: 200.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Milk --> Price: 50.00tk");
                return 50.00;
            case 2:
                System.out.println("You have selected Cheese --> Price: 100.00tk");
                return 100.00;
            case 3:
                System.out.println("You have selected Butter --> Price: 200.00tk");
                return 200.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }

    private double oilFatMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Sunflower Oil --> Price: 100.00tk");
        System.out.println("\t2. Mustard Oil --> Price: 80.00tk");
        System.out.println("\t3. Coconut Oil --> Price: 120.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Sunflower Oil --> Price: 100.00tk");
                return 100.00;
            case 2:
                System.out.println("You have selected Mustard Oil --> Price: 80.00tk");
                return 80.00;
            case 3:
                System.out.println("You have selected Coconut Oil --> Price: 120.00tk");
                return 120.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }
}
