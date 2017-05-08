package snu.spm.unisell.other;

/**
 * Created by MRUDULA on 08-05-2017.
 */
public class OrderItem {
    private int mImageId;
    private String mProductName;
    private String mPrice;

    public OrderItem(){

    }

    public OrderItem(int mImageId, String mProductName, String mPrice){
        this.mImageId = mImageId;
        this.mPrice = mPrice;
        this.mProductName = mProductName;
    }
    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmProductName() {
        return mProductName;
    }

    public void setmProductName(String mProductName) {
        this.mProductName = mProductName;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }
}
