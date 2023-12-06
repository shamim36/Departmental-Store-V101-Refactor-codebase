import java.util.Scanner;

class ShoppingFacade {
    private double total_price = 0.0;
    private Scanner scanner;

    public ShoppingFacade(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startShopping() {
        while (true) {
            showMainMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    total_price += shoppingFacadeForCategory(new Cloth());
                    break;
                case 2:
                    total_price += shoppingFacadeForCategory(new Technology());
                    break;
                case 3:
                    total_price += shoppingFacadeForCategory(new Grocery());
                    break;
                case 4:
                    System.out.println("\t\t#Thank you for shopping with us#");
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("***Press 1 to continue Shopping or 0 to exit : ");
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println("\t\t##Thank you for shopping with us##");
                break;
            }
        }
    }

    private double shoppingFacadeForCategory(ShoppingCategory category) {
        category.welcome();
        category.showOptions();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return category.calculatePrice(choice);
    }

    private void showMainMenu() {
        System.out.println("============================================================");
        System.out.println("==                                                        ==");
        System.out.println("==              Welcome To Departmental Store             ==");
        System.out.println("==                                                        ==");
        System.out.println("============================================================");
        System.out.println("\t1. Cloth For Boys");
        System.out.println("\t2. Technology");
        System.out.println("\t3. Grocery");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
}
