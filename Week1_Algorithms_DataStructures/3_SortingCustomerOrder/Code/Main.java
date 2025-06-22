public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Ankur Bose", 1200.00),
            new Order(102, "Sumit Das", 500.00),
            new Order(103, "Abirbhab Sen", 750.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        Order[] bubbleSorted = orders.clone();
        Sorter.bubbleSort(bubbleSorted);
        System.out.println("\nAfter Bubble Sort:");
        printOrders(bubbleSorted);

        // Quick Sort
        Order[] quickSorted = orders.clone();
        Sorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nAfter Quick Sort:");
        printOrders(quickSorted);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
