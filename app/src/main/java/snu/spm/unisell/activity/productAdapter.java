package snu.spm.unisell.activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import snu.spm.unisell.R;
import snu.spm.unisell.other.OrderItem;

/**
 * Created by MRUDULA on 08-05-2017.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productCardViewHolder> {

    private List<OrderItem> orderList;

    public ProductAdapter(List<OrderItem> orderList) {
        this.orderList = orderList;
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    @Override
    public void onBindViewHolder(productCardViewHolder orderViewHolder, int i) {
        OrderItem order = orderList.get(i);
        orderViewHolder.image.setImageResource(order.getmImageId());
        orderViewHolder.productName.setText(order.getmProductName());
        orderViewHolder.productPrice.setText(order.getmPrice());
    }

    @Override
    public productCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.activity_cardlayout, viewGroup, false);

        return new productCardViewHolder(itemView);
    }

    public class productCardViewHolder extends RecyclerView.ViewHolder {

        protected ImageView image;
        protected TextView productName;
        protected TextView productPrice;

        public productCardViewHolder(View v) {
            super(v);
            image = (ImageView) v.findViewById(R.id.image);
            productName =  (TextView) v.findViewById(R.id.title);
            productPrice = (TextView)  v.findViewById(R.id.cost);

        }
    }
}