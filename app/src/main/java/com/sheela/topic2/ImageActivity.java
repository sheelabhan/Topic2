package com.sheela.topic2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity  implements View.OnClickListener {
    private RadioButton rdnRose, rdnPerson, rdnBuilding;
    private Button btnClose;
    ImageView rdnPictures;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        rdnRose = findViewById(R.id.rdnRose);
        rdnPerson = findViewById(R.id.rdnPerson);
        rdnBuilding = findViewById(R.id.rdnBuilding);
        rdnPictures = findViewById(R.id.rdnPictures);
        btnClose = findViewById(R.id.btnClose);
        rdnRose.setOnClickListener(this);


        rdnPerson.setOnClickListener(this);
        rdnBuilding.setOnClickListener(this);
        btnClose.setOnClickListener(this);
        builder = new AlertDialog.Builder(this);
        rdnRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this rose picture?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                rdnPictures.setImageResource(R.drawable.rose);

                                Toast.makeText(getApplicationContext(), "You clicked Yes",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(), "You clicked No",
                                        Toast.LENGTH_SHORT).show();

                            }
                        });


                AlertDialog alert = builder.create();
                alert.setTitle("Image radio Button");
                alert.show();

            }
        });
        rdnBuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this building picture?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                rdnPictures.setImageResource(R.drawable.building);

                                Toast.makeText(getApplicationContext(), "You clicked Yes",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(), "You clicked No",
                                        Toast.LENGTH_SHORT).show();

                            }
                        });


                AlertDialog alert = builder.create();
                alert.setTitle("image radio Button");
                alert.show();


            }
        });
        rdnPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this person picture?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                rdnPictures.setImageResource(R.drawable.person);

                                Toast.makeText(getApplicationContext(), "You clicked Yes",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(), "You clicked No",
                                        Toast.LENGTH_SHORT).show();

                            }
                        });


                AlertDialog alert = builder.create();
                alert.setTitle("image radio Button");
                alert.show();


            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {


                                Toast.makeText(getApplicationContext(), "You clicked Yes",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(), "You clicked No",
                                        Toast.LENGTH_SHORT).show();

                            }
                        });


                AlertDialog alert = builder.create();
                alert.setTitle("my title ");
                alert.show();


            }
        });

    }

    @Override
    public void onClick(View v) {


        //switch (v.getId()) {
//
//
//            case R.id.rdnRose:
//                rdnPictures.setImageResource(R.drawable.rose);
//
//                break;
//
//
//
//            case R.id.rdnPerson:
//                rdnPictures.setImageResource(R.drawable.person);
//
//                break;
//            case R.id.rdnBuilding:
//                rdnPictures.setImageResource(R.drawable.building);
//                break;
//        }


    }
}




//
//        switch (v.getId()) {
//
//
//            case R.id.rdnRose:
//                rdnPictures.setImageResource(R.drawable.rose);
//
//                break;
//
//
//
//            case R.id.rdnPerson:
//                rdnPictures.setImageResource(R.drawable.person);
//
//                break;
//            case R.id.rdnBuilding:
//                rdnPictures.setImageResource(R.drawable.building);
//                break;
//        }
//
//
//
//







