package dietel.object.method.string;

/**
 * Create a class called PetrolPurchase to represent information about the petrol you purchase. The class should include
 * five pieces of information in the form of instance variables—the station’s location (type String), the type of petrol
 * (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage
 * discount (double). Your class should have a constructor that initializes the five instance variables. Provide a
 * set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates
 * the net purchase amount (i.e., multiplies the quantity by the price per liter) minus the discount, then returns the net
 * amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of
 * class PetrolPurchase
 */
public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int quantityPurchased;
    private double price;
    private double discount;

    public PetrolPurchase(String location, String petrolType, int quantityPurchased, double price, double discount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantityPurchased = quantityPurchased;
        this.price = price;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPurchaseAmount() {
        return getPrice() * getQuantityPurchased() - getDiscount();
    }
}
