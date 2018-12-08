package com.codenamerockeysportscarbio.sportscarbio;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView carImageView;
    private TextView bioNameTextView;
    private TextView carBioTextView;
    private Button backToTrack;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        carImageView = findViewById(R.id.carImageViewID);
       bioNameTextView = findViewById(R.id.nameID);
        carBioTextView = findViewById(R.id.bioTextID);
        backToTrack = findViewById(R.id.backToFirstActivity);

        extras = getIntent().getExtras();
        //checking
        if (extras != null) {
            String name  = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }

    }
    public  void setUp(String name, String bio) {
        // if statement decides what view to show
        if (name.equals("lambo")) {
            // we show Lambo stuff
            //gets the image we need
            carImageView.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.lambo));
            //gets the name of the car for the bio
            bioNameTextView.setText(name);
            //gets the bio we need
            carBioTextView.setText(bio);

        } else if (name.equals("McLaren 720S")) {
            // we show McLaren stuff
            //gets the image we need
            carImageView.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.mclaren));
            //gets the name of the car for the bio
            //bioNameTextView.setText(name);
            //gets the bio we need
            carBioTextView.setText(bio);
        }

        backToTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToTrack = new Intent(BioActivity.this, FirstActivity.class);
                startActivity(backToTrack);

            }
        });



    }
}
