import java.util.Scanner;

class Cloth implements ShoppingCategory {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void welcome() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("--                      Cloth Menu                       --");
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void showOptions() {
        System.out.println("\t1. T-Shirt");
        System.out.println("\t2. Jeans");
        System.out.println("\t3. Shirt");
        System.out.println("\t4. Exit this shopping Category\n");
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public double calculatePrice(int choice) {
        switch (choice) {
            case 1:
                return clothSizeMenu("T-Shirt");
            case 2:
                return clothSizeMenu("Jeans");
            case 3:
                return clothSizeMenu("Shirt");
            case 4:
                System.out.println("You have selected to exit from Cloth Menu");
                break;
            default:
                System.out.println("Invalid choice");
        }
        return 0.0;
    }

    private double clothSizeMenu(String clothType) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Small --> Price: 1000.00tk");
        System.out.println("\t2. Medium --> Price: 1500.00tk");
        System.out.println("\t3. Large --> Price: 2000.00tk");
        System.out.println("\t4. Extra Large --> Price: 2500.00tk");
        System.out.println("\t5. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Small " + clothType + " --> Price: 1000.00tk");
                return 1000.00;
            case 2:
                System.out.println("You have selected Medium " + clothType + " --> Price: 1500.00tk");
                return 1500.00;
            case 3:
                System.out.println("You have selected Large " + clothType + " --> Price: 2000.00tk");
                return 2000.00;
            case 4:
                System.out.println("You have selected Extra Large " + clothType + " --> Price: 2500.00tk");
                return 2500.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }
}
