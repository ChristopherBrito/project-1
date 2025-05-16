class Grocery extends Product {
    Grocery(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    String getCategory() {
        return "Grocery";
    }
}