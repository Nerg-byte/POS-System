
package posClasses;


public class ProductModel {
    private int product_id;
    private String product_name;
    private double product_price;

    public ProductModel(int product_id, String product_name, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    @Override
    public String toString() {
        return product_name; // this is what shows in the JComboBox
    }
}
