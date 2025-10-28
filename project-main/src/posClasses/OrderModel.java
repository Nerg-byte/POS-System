
package posClasses;

import java.sql.Timestamp;

public class OrderModel {
    private int orderId;
    private String productName;
    private int quantitySold;
    private int totalPrice;
    private Timestamp dateSold;

    public OrderModel(int orderId, String productName, int quantitySold, int totalPrice, Timestamp dateSold) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.totalPrice = totalPrice;
        this.dateSold = dateSold;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Timestamp getDateSold() {
        return dateSold;
    }

    public void setDateSold(Timestamp dateSold) {
        this.dateSold = dateSold;
    }
    
    
}
