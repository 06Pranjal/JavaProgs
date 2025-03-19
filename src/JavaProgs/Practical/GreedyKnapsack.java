package JavaProgs.Practical;

import java.util.Arrays;
import java.util.Scanner;

class Item {
    int weight, value;
    double ratio;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
}

public class GreedyKnapsack {
    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio)); // Sort items by value/weight ratio (descending)

        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity >= item.weight) { // Take full item
                totalValue += item.value;
                capacity -= item.weight;
            } else { // Take fraction of the item
                totalValue += item.ratio * capacity;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and value of item " + (i + 1) + ": ");
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items[i] = new Item(weight, value);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value in Knapsack = " + maxValue);

        sc.close();
    }
}

