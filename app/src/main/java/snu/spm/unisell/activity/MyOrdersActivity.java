package snu.spm.unisell.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import snu.spm.unisell.adapters.ProductAdapter;
import snu.spm.unisell.R;
import snu.spm.unisell.other.OrderItem;

public class MyOrdersActivity extends AppCompatActivity {

    List<OrderItem> mOrderList;
    ProductAdapter mProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorders);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0.0f);

        OrderItem mOrderItem = new OrderItem(R.drawable.ic_books, "books", "30");

        mOrderList = new ArrayList<OrderItem>();
        mOrderList.add(mOrderItem);
        mOrderItem = new OrderItem(R.drawable.ic_electronics, "MP3", "400");
        mOrderList.add(mOrderItem);


        mProductAdapter = new ProductAdapter(mOrderList);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);

        recList.setAdapter(mProductAdapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);


    }
}
