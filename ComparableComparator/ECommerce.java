package ComparableComparator;
//E-commerce Orders Sorting
//You have orders with : price and productName
//Sort:
//Lower price first
//If same price → product name alphabetically


import java.util.*;

public class ECommerce {
    int price;
    String productName;

    ECommerce(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public static void main(String[] args) {

        ArrayList<ECommerce> list = new ArrayList<>();

        list.add(new ECommerce(500, "Shoes"));
        list.add(new ECommerce(300, "Bag"));
        list.add(new ECommerce(500, "Watch"));
        list.add(new ECommerce(300, "Apple"));

        // Comparator logic
        Collections.sort(list, (o1, o2) -> {
            if (o1.price != o2.price) {
                return o1.price - o2.price;
            } else {
                return o1.productName.compareTo(o2.productName);
            }
        });

        // Print result
        for (ECommerce o : list) {
            System.out.println(o.price + " " + o.productName);
        }
    }
}
