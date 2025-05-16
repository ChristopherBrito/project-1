import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

abstract class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract String getCategory();

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

