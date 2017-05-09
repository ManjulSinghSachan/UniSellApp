package snu.spm.unisell.adapters; /**
 * Created by mohitkolluri on 08/05/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import snu.spm.unisell.R;
import snu.spm.unisell.models.ProductModel;

public class ProductListCustomAdapter extends RecyclerView.Adapter<ProductListCustomAdapter.MyViewHolder> {

    private Context mContext;
    private List<ProductModel> mProductList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mProductTitleTextView, mProductPriceTextView;
        public ImageView mProductImageImageView;

        public MyViewHolder(View view) {
            super(view);
            mProductImageImageView = (ImageView) view.findViewById(R.id.imageview_product);
            mProductPriceTextView = (TextView) view.findViewById(R.id.textview_product_price);
            mProductTitleTextView = (TextView) view.findViewById(R.id.textview_product_name);
        }
    }


    public ProductListCustomAdapter(Context mContext, List<ProductModel> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.products_custom_card_layout, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ProductModel mProduct = mProductList.get(position);
        holder.mProductTitleTextView.setText(mProduct.getName());
        holder.mProductPriceTextView.setText("Rs " + mProduct.getPrice());

        // loading album cover using Glide library
        Glide.with(mContext).load(mProduct.getImage()).into(holder.mProductImageImageView);

    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }
}