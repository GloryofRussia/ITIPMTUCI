package lab3;

import java.util.HashMap;

class Order {
    private String product;
    private String deliveryaddress;
    private double cost;

    public Order(String product, String deliveryaddress, double cost){
        this.product = product;
        this.deliveryaddress = deliveryaddress;
        this.cost = cost;
    }

    public String getproduct(){
        return product;
    }

    public void setProduct(String product){
        this.product = product;
    }

    public String getdeliveryaddress(){
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress){
        this.deliveryaddress = deliveryaddress;
    }

    public double getcost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }
}