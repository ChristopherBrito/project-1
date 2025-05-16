class Order {
    Customer customer;
    List<Product> items;

    Order(Customer customer, List<Product> items) {
        this.customer = customer;
        this.items = items;
    }

    Map<String, Double> calculateTotal() {
        double subtotal = items.stream().mapToDouble(p -> p.price).sum();
        double tax = ((Function<Double, Double>) x -> x * 0.1).apply(subtotal);
        double shipping = ((Function<Double, Double>) x -> x < 100 ? 5.0 : 0.0).apply(subtotal);
        double total = subtotal + tax + shipping;

        Map<String, Double> result = new LinkedHashMap<>();
        result.put("Subtotal", round(subtotal));
        result.put("Tax", round(tax));
        result.put("Shipping", round(shipping));
        result.put("Total", round(total));
        return result;
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}