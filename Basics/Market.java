package Basics;



class Product {
    String itemNo;
    String name;
    double price;
    int quantity;

    public Product(String itemNo, String name){
        this.name = name;
        this.itemNo = itemNo;
    }

    public Product(String itemNo, String name, double price, int quantity){
        this.name = name;
        this.itemNo = itemNo;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double p){
        price = p;
    }

    public void setQuantity(int q){
        quantity = q;
    }

    public String getItemNo(){ return itemNo; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }
}

class Customer {
    String customerId;
    String name;
    String address;
    String phoneNo;

    public Customer(String customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }

    public Customer(String customerId, String name, String address, String phoneNo){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }


    public void setAddress(String addr){
        address = addr;
    }

    public void setPhoneNo(String phn){
        phoneNo = phn;
    }

    public String getCustomerId(){ return customerId; }
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public String getPhoneNo(){ return phoneNo; }

}

public class Market {
    
}
