package com.sheela.topic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageActivity extends AppCompatActivity  implements View.OnClickListener{
    private RadioButton rdnRose,rdnPerson,rdnBuilding;
    ImageView rdnPictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        rdnRose = findViewById(R.id.rdnRose);
        rdnPerson = findViewById(R.id.rdnPerson);
        rdnBuilding = findViewById(R.id.rdnBuilding);
        rdnPictures = findViewById(R.id.rdnPictures);

        rdnRose.setOnClickListener(this);


        rdnPerson.setOnClickListener(this);
        rdnBuilding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdnRose:
                rdnPictures.setImageResource(R.drawable.rose);
                break;
            case R.id.rdnPerson:
                rdnPictures.setImageResource(R.drawable.person);
                break;
            case R.id.rdnBuilding:
                rdnPictures.setImageResource(R.drawable.building);
                break;


        }

    }
}
