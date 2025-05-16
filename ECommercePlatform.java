public class ECommercePlatform {
    public static void main(String[] args) {
        
        List<Product> products = Arrays.asList(
            new Electronics(1, "Laptop", 1000),
            new Clothing(2, "Jeans", 50),
            new Grocery(3, "Apples", 5),
            new Clothing(4, "Jacket", 120),
            new Electronics(5, "Headphones", 150)
        );

        Customer customer = new Customer(101, "john_doe");
        customer.cart.add(products.get(0)); 
        customer.cart.add(products.get(1)); 
        customer.cart.add(products.get(4)); 

        Order order = new Order(customer, customer.cart);

        System.out.println("=== Order Summary ===");
        order.calculateTotal().forEach((k, v) -> System.out.println(k + ": $" + v));

        System.out.println("\n=== Filtered Electronics ===");
        products.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .forEach(System.out::println);

        System.out.println("\n=== Search 'jean' ===");
        products.stream()
                .filter(p -> p.name.toLowerCase().contains("jean"))
                .forEach(System.out::println);

        System.out.println("\n=== Products Sorted by Price (Descending) ===");
        products.stream()
                .sorted((a, b) -> Double.compare(b.price, a.price))
                .forEach(System.out::println);

        System.out.println("\n=== Products with 20% Discount Applied ===");
        products.stream()
                .map(p -> {
                    double newPrice = Math.round(p.price * 0.8 * 100.0) / 100.0;
                    return p.getClass().getSimpleName() + ": " + p.name + " - $" + newPrice;
                })
                .forEach(System.out::println);
    }
}
