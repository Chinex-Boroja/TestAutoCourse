package abstraction;

//This is contract, intended to be used by other classes

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode() {
        return "No Barcode";
    }
}
