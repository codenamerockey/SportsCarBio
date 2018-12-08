package com.codenamerockeysportscarbio.sportscarbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

// The implements View.OnClickListener allows the entire class to register as a OnClickListener
public class FirstActivity extends AppCompatActivity implements  View.OnClickListener {

    private ImageView lamboView;
    private ImageView mclarenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        lamboView = findViewById(R.id.lamboImageView);
        mclarenView = findViewById(R.id.mclarenImageView);

        //this registers the view to be an onClickListener
        lamboView.setOnClickListener(this);
        mclarenView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lamboImageView:
                 //go to secondActivity
                //Toast.makeText(FirstActivity.this, "Lambo", Toast.LENGTH_SHORT).show();
                Intent lamboIntent = new Intent(FirstActivity.this, BioActivity.class);
                lamboIntent.putExtra("name", "lambo");
                lamboIntent.putExtra("bio", "The Huracán family of supercars is awe-inspiring and extremely powerful to say the least.\n\n" +
                        "Price Starting at\n" +
                        "$203,295" );
                startActivity(lamboIntent);
                break;
            case R.id.mclarenImageView:
                // go to secondActivity
                //Toast.makeText(FirstActivity.this, "Mclaren", Toast.LENGTH_SHORT).show();
                Intent mclarenIntent = new Intent(FirstActivity.this, BioActivity.class);
                mclarenIntent.putExtra("name", "McLaren 720S");
                mclarenIntent.putExtra("bio", " McLaren’s are eye catching, this aerodynamic, ferocious supercar is undeniable.\n\n" +
                        "Price Starting at\n" +
                        "$288,845" );
                startActivity(mclarenIntent);

                break;
        }
    }
}
