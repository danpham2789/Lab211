package week7;

import java.util.ArrayList;
import java.util.Hashtable;

public class OrderManagement {

    //display menu
    static int menu() {
        //loop until user want to exit
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = GetInput.checkInt("", 4);
        return choice;
    }

    //allow user create fruit
    static void createFruit(ArrayList<Fruit> lf) {
        //loop until user don't want to create fruit
        while (true) {
            System.out.print("Enter fruit id: ");
            String fruitId = GetInput.get("");
            System.out.print("Enter fruit name: ");
            String fruitName = GetInput.get("");
            System.out.print("Enter price: ");
            double price = GetInput.checkDouble("");
            System.out.print("Enter quantity: ");
            int quantity = GetInput.checkInt("");
            System.out.print("Enter origin: ");
            String origin = GetInput.get("");
            lf.add(new Fruit(fruitId, fruitName, price, quantity, origin));

            //check user want to continue or not
            if (!GetInput.checkBool("Do you want to continue? (true/false): ")) {
                return;
            }
        }
    }

    //allow user show view order
    static void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
        for (String name : ht.keySet()) {
            System.out.println("Customer: " + name);
            ArrayList<Order> lo = ht.get(name);
            displayListOrder(lo);
        }
    }

    //allow user buy items
    static void shopping(ArrayList<Fruit> lf, Hashtable<String, ArrayList<Order>> ht) {
        //check list empty user can't buy
        if (lf.isEmpty()) {
            System.err.println("No have item.");
            return;
        }
        //loop until user don't want to buy continue
        ArrayList<Order> lo = new ArrayList<>();
        while (true) {
            displayListFruit(lf);
            System.out.print("Enter item: ");
            int item = GetInput.checkInt("", lf.size());
            Fruit fruit = getFruitByItem(lf, item);
            System.out.print("Enter quantity: ");
            int quantity = GetInput.checkInt("", fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);
            //check item exist or not
            boolean isExist = false;
            for (Order o: lo){
                if (o.getFruitId().equals(fruit.getFruitId())) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                updateOrder(lo, fruit.getFruitId(), quantity);
            } else {
                lo.add(new Order(fruit.getFruitId(), fruit.getFruitName(),
                        quantity, fruit.getPrice()));
            }

            if (!GetInput.checkBool("Do you want to continue? (true/false): ")) {
                break;
            }
        }
        displayListOrder(lo);
        System.out.print("Enter name: ");
        String name = GetInput.get("");
        ht.put(name, lo);
        System.err.println("Add successful");
    }

    //display list fruit in shop
    static void displayListFruit(ArrayList<Fruit> lf) {
        int countItem = 1;
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit name", "Origin", "Price");
        for (Fruit fruit : lf) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10d%-20s%-20s%-15.0f$\n", countItem++,
                        fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
            }
        }
    }

    //get fruit user wants to buy
    static Fruit getFruitByItem(ArrayList<Fruit> lf, int item) {
        int countItem = 1;
        for (Fruit fruit : lf) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }

    //display list order
    static void displayListOrder(ArrayList<Order> lo) {
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
        for (Order order : lo) {
            System.out.printf("%15s%15d%15.0f$%15.0f$\n", order.getFruitName(),
                    order.getQuantity(), order.getPrice(),
                    order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }

    //if order exists then update order
    static void updateOrder(ArrayList<Order> lo, String id, int quantity) {
        for (Order order : lo) {
            if (order.getFruitId().equalsIgnoreCase(id)) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }
}