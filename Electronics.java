class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    String getCategory() {
        return "Electronics";
    }
}