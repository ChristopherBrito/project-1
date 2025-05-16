class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    String getCategory() {
        return "Clothing";
    }
}
