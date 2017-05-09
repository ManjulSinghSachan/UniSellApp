package snu.spm.unisell.models;

/**
 * Created by mohitkolluri on 08/05/17.
 */

public class ProductModel {

    private String mProductName;
    private double mProductPrice;
    private String mProductImage;


    public ProductModel() {
    }

    public ProductModel(String name, double price, String image) {
        this.mProductName = name;
        this.mProductPrice = price;
        this.mProductImage = image;
    }

    public String getName(){
        return mProductName;
    }


    public double getPrice(){
        return mProductPrice;
    }

    public String getImage(){ return mProductImage;}

    public void setName(String mName){
        this.mProductName = mName;
    }

    public void setPrice(double mPrice){
        this.mProductPrice = mPrice;
    }

    public void setmProductImage(String productImage){ this.mProductImage = productImage; }
}
