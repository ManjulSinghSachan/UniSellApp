package snu.spm.unisell.activity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import snu.spm.unisell.R;

/**
 * Created by MRUDULA on 14-04-2017.
 */
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button1 = (Button) findViewById(R.id.register);
        GradientDrawable sd2 = (GradientDrawable) button1.getBackground();
        int registerColor = ContextCompat.getColor(getBaseContext(), R.color.login);
        sd2.setColor(registerColor);
    }
}
