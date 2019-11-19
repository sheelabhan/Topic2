package com.sheela.topic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst, etSecond;
    private Button btnCalculate;
    private RadioButton rdnAdd, rdnSub;

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etsecond);
        btnCalculate = findViewById(R.id.btnCalculate);
        rdnAdd = findViewById(R.id.rdnAdd);
        rdnSub = findViewById(R.id.rdnSub);
       btnCalculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(TextUtils.isEmpty(etFirst.getText()))
               {
                   etFirst.setError("Please enter first no");
                   etFirst.requestFocus();
                   return;

               }
               else  if(TextUtils.isEmpty(etSecond.getText())) {
                   etSecond.setError("Please enter second no");
                   etSecond.requestFocus();
                   return;

               }
               int first,second, result;
               first=Integer.parseInt(etFirst.getText().toString());
               second=Integer.parseInt(etSecond.getText().toString());
              if (rdnAdd.isChecked()){
                  result= first +second;
              } else{
                  result=first-second;
              }
               Toast.makeText(MainActivity.this, "Result is:" +result,Toast.LENGTH_LONG).show();

           }
       });
    }






}

