import java.util.Scanner;

class Technology implements ShoppingCategory {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void welcome() {
        System.out.println("------------------------------------------------------------");
        System.out.println("--                         IT Menu                        --");
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void showOptions() {
        System.out.println("\t1. Mobile Phone");
        System.out.println("\t2. Desktop Computer (PC)");
        System.out.println("\t3. Laptop");
        System.out.println("\t4. Exit this shopping Category\n");
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public double calculatePrice(int choice) {
        switch (choice) {
            case 1:
                return mobileBrandMenu();
            case 2:
                return desktopBrandMenu();
            case 3:
                return laptopBrandMenu();
            case 4:
                System.out.println("You have selected to exit from Technology Menu");
                break;
            default:
                System.out.println("You have selected an invalid option");
        }
        return 0.0;
    }

    private double mobileBrandMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Samsung --> Price: 20000.00tk");
        System.out.println("\t2. Nokia --> Price: 15000.00tk");
        System.out.println("\t3. Apple --> Price: 50000.00tk");
        System.out.println("\t4. Xiaomi --> Price: 10000.00tk");
        System.out.println("\t5. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Samsung --> Price: 20000.00tk");
                return 20000.00;
            case 2:
                System.out.println("You have selected Nokia --> Price: 15000.00tk");
                return 15000.00;
            case 3:
                System.out.println("You have selected Apple --> Price: 50000.00tk");
                return 50000.00;
            case 4:
                System.out.println("You have selected Xiaomi --> Price: 10000.00tk");
                return 10000.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }

    private double desktopBrandMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. HP --> Price: 50000.00tk");
        System.out.println("\t2. Dell --> Price: 60000.00tk");
        System.out.println("\t3. Lenovo --> Price: 70000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected HP --> Price: 50000.00tk");
                return 50000.00;
            case 2:
                System.out.println("You have selected Dell --> Price: 60000.00tk");
                return 60000.00;
            case 3:
                System.out.println("You have selected Lenovo --> Price: 70000.00tk");
                return 70000.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }

    private double laptopBrandMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. HP --> Price: 70000.00tk");
        System.out.println("\t2. Dell --> Price: 80000.00tk");
        System.out.println("\t3. Lenovo --> Price: 90000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected HP --> Price: 70000.00tk");
                return 70000.00;
            case 2:
                System.out.println("You have selected Dell --> Price: 80000.00tk");
                return 80000.00;
            case 3:
                System.out.println("You have selected Lenovo --> Price: 90000.00tk");
                return 90000.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.0;
    }
}
