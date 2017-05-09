package snu.spm.unisell.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import snu.spm.unisell.R;

public class ProductDetailsActivity extends AppCompatActivity {

    Button add_to_cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        add_to_cart = (Button) findViewById(R.id.add_to_cart);

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductDetailsActivity.this, MyOrdersActivity.class));
            }
        });
    }
}
