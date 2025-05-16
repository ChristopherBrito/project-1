class Customer extends User {
    List<Product> cart;

    Customer(int userId, String username) {
        super(userId, username);
        this.cart = new ArrayList<>();
    }
}