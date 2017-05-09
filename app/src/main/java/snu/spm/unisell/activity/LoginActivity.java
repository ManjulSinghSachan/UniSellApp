package snu.spm.unisell.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import snu.spm.unisell.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1 = (Button) findViewById(R.id.login);
        GradientDrawable sd = (GradientDrawable) button1.getBackground();
        int loginColor = ContextCompat.getColor(getBaseContext(),R.color.login);
        sd.setColor(loginColor);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), snu.spm.unisell.activity.MainActivity.class);
                startActivity(i);
            }
        });

        Button button2 = (Button) findViewById(R.id.forgotPassword);
        GradientDrawable sd1 = (GradientDrawable) button2.getBackground();
        int passwordColor = ContextCompat.getColor(getBaseContext(),R.color.forgotPassword);
        sd1.setColor(passwordColor);

        Button button3 = (Button) findViewById(R.id.register);
        GradientDrawable sd2 = (GradientDrawable) button3.getBackground();
        int registerColor = ContextCompat.getColor(getBaseContext(),R.color.register);
        sd2.setColor(registerColor);

        TextView tx = (TextView)findViewById(R.id.textview1);
        //Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Caviar_Dreams_Bold.ttf");
        //tx.setTypeface(custom_font);

        TextView tx1 = (TextView)findViewById(R.id.textview2);
        //Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Caviar_Dreams_Bold.ttf");
        //tx1.setTypeface(custom_font1);

        //Intent is sent for register page to open on clicking the register button
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), snu.spm.unisell.activity.RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}
